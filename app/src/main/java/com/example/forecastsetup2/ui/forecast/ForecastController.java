package com.example.forecastsetup2.ui.forecast;

import com.example.forecastsetup2.networking.calls.FetchWeatherForecastCall;
import com.example.forecastsetup2.networking.schema.ForecastResponseSchema;
import com.example.forecastsetup2.networking.schema.HourSchema;
import com.example.forecastsetup2.ui.common.dialogs.DialogsEventBus;
import com.example.forecastsetup2.ui.common.dialogs.DialogsManager;
import com.example.forecastsetup2.ui.common.dialogs.promptdialog.PromptDialogEvent;

import java.io.Serializable;

public class ForecastController implements ForecastViewMvc.Listener, FetchWeatherForecastCall.Listener, DialogsEventBus.Listener {

    private enum ScreenState {
        IDLE, FETCHING_DATA, DATA_SHOWN, NETWORK_ERROR
    }

    private final FetchWeatherForecastCall mFetchWeatherForecastCall;
    private final DialogsManager mDialogsManager;
    private final DialogsEventBus mDialogsEventBus;

    private ForecastViewMvc mViewMvc;

    private ScreenState mScreenState = ScreenState.IDLE;

    public ForecastController(FetchWeatherForecastCall fetchWeatherForecastCall,
                              DialogsManager dialogsManager, DialogsEventBus dialogsEventBus) {
        mFetchWeatherForecastCall = fetchWeatherForecastCall;
        mDialogsManager = dialogsManager;
        mDialogsEventBus = dialogsEventBus;
    }

    public void bindView(ForecastViewMvc viewMvc) {
        mViewMvc = viewMvc;
    }

    public SavedState getSavedState() {
        return new SavedState(mScreenState);
    }

    public void restoreSavedState(SavedState savedState) {
        mScreenState = savedState.mScreenState;
    }

    public void onStart() {
        mViewMvc.registerListener(this);
        mFetchWeatherForecastCall.registerListener(this);
        mDialogsEventBus.registerListener(this);

        if (mScreenState != ScreenState.NETWORK_ERROR) {
            fetchForecastAndNotify("Belgrade");
        }
    }

    public void onStop() {
        mViewMvc.unregisterListener(this);
        mFetchWeatherForecastCall.unregisterListener(this);
        mDialogsEventBus.unregisterListener(this);
    }

    private void fetchForecastAndNotify(String query) {
        mScreenState = ScreenState.FETCHING_DATA;
        mViewMvc.showProgressIndication();
        mFetchWeatherForecastCall.fetchWeatherForecastAndNotify(query, 7);
    }

    @Override
    public void onSearchClicked(String query) {
        fetchForecastAndNotify(query);
    }

    @Override
    public void onHourClicked(HourSchema hourSchema) {
        // TODO
    }

    @Override
    public void onWeatherForecastFetched(ForecastResponseSchema responseSchema) {
        mScreenState = ScreenState.DATA_SHOWN;
        mViewMvc.hideProgressIndication();
        mViewMvc.setLocation(responseSchema.getLocation());
        mViewMvc.bindForecast(responseSchema.getForecast().getForecastday().get(0).getHour());
    }

    @Override
    public void onWeatherForecastFetchFailed() {
        mScreenState = ScreenState.NETWORK_ERROR;
        mViewMvc.hideProgressIndication();
        mDialogsManager.showUseCaseErrorDialog(null);
    }

    @Override
    public void onDialogEvent(Object event) {
        if (event instanceof PromptDialogEvent) {
            switch (((PromptDialogEvent) event).getClickedButton()) {
                case POSITIVE:
                    fetchForecastAndNotify("Belgrade");
                    break;
                case NEGATIVE:
                    mScreenState = ScreenState.IDLE;
                    break;
            }
        }
    }

    public static class SavedState implements Serializable {
        private final ScreenState mScreenState;

        public SavedState(ScreenState screenState) {
            mScreenState = screenState;
        }
    }
}