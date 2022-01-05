package com.example.forecastsetup2.ui.forecast;

import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.forecastsetup2.ui.common.controllers.BaseFragment;

public class ForecastFragment extends BaseFragment {

    public static Fragment newInstance() {
        return new ForecastFragment();
    }

    private static final String SAVED_STATE_CONTROLLER = "SAVED_STATE_CONTROLLER";

    private ForecastController mForecastController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ForecastViewMvc viewMvc = getCompositionRoot().getViewMvcFactory().getForecastViewMvc(container);
        mForecastController = getCompositionRoot().getForecastController();
        if (savedInstanceState != null) {
            restoreControllerState(savedInstanceState);
        }
        mForecastController.bindView(viewMvc);
        return viewMvc.getRootView();
    }

    private void restoreControllerState(Bundle savedInstanceState) {
        mForecastController.restoreSavedState((ForecastController.SavedState) savedInstanceState.getSerializable(SAVED_STATE_CONTROLLER));
    }

    @Override
    public void onStart() {
        super.onStart();
        mForecastController.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mForecastController.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(SAVED_STATE_CONTROLLER, mForecastController.getSavedState());
    }
}