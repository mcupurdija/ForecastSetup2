package com.example.forecastsetup2.common.di;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;

import com.example.forecastsetup2.common.permissions.PermissionsHelper;
import com.example.forecastsetup2.networking.WeatherApi;
import com.example.forecastsetup2.networking.calls.FetchWeatherForecastCall;
import com.example.forecastsetup2.ui.common.ViewMvcFactory;
import com.example.forecastsetup2.ui.common.controllers.BackPressDispatcher;
import com.example.forecastsetup2.ui.common.dialogs.DialogsEventBus;
import com.example.forecastsetup2.ui.common.dialogs.DialogsManager;
import com.example.forecastsetup2.ui.common.navdrawer.NavDrawerHelper;
import com.example.forecastsetup2.ui.common.toastshelper.ToastsHelper;
import com.example.forecastsetup2.ui.forecast.ForecastController;

public class ControllerCompositionRoot {

    private final ActivityCompositionRoot mActivityCompositionRoot;

    public ControllerCompositionRoot(ActivityCompositionRoot activityCompositionRoot) {
        mActivityCompositionRoot = activityCompositionRoot;
    }

    private FragmentActivity getActivity() {
        return mActivityCompositionRoot.getActivity();
    }

    private Context getContext() {
        return getActivity();
    }

    private FragmentManager getFragmentManager() {
        return getActivity().getSupportFragmentManager();
    }

    private WeatherApi getWeatherApi() {
        return mActivityCompositionRoot.getWeatherApi();
    }

    private LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(getContext());
    }

    public ViewMvcFactory getViewMvcFactory() {
        return new ViewMvcFactory(getLayoutInflater(), getNavDrawerHelper());
    }

    private NavDrawerHelper getNavDrawerHelper() {
        return (NavDrawerHelper) getActivity();
    }

    public FetchWeatherForecastCall getFetchWeatherForecastCall() {
        return new FetchWeatherForecastCall(getWeatherApi());
    }

    public ForecastController getForecastController() {
        return new ForecastController(
                getFetchWeatherForecastCall(),
                getDialogsManager(),
                getDialogsEventBus()
        );
    }

    public ToastsHelper getToastsHelper() {
        return new ToastsHelper(getContext());
    }

    public BackPressDispatcher getBackPressDispatcher() {
        return (BackPressDispatcher) getActivity();
    }

    public DialogsManager getDialogsManager() {
        return new DialogsManager(getContext(), getFragmentManager());
    }

    public DialogsEventBus getDialogsEventBus() {
        return mActivityCompositionRoot.getDialogsEventBus();
    }

    public PermissionsHelper getPermissionsHelper() {
        return mActivityCompositionRoot.getPermissionsHelper();
    }
}