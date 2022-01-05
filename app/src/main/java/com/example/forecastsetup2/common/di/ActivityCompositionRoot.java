package com.example.forecastsetup2.common.di;

import android.support.v4.app.FragmentActivity;

import com.example.forecastsetup2.common.permissions.PermissionsHelper;
import com.example.forecastsetup2.networking.WeatherApi;
import com.example.forecastsetup2.ui.common.dialogs.DialogsEventBus;

public class ActivityCompositionRoot {

    private final CompositionRoot mCompositionRoot;
    private final FragmentActivity mActivity;

    private PermissionsHelper mPermissionsHelper;

    public ActivityCompositionRoot(CompositionRoot compositionRoot, FragmentActivity activity) {
        mCompositionRoot = compositionRoot;
        mActivity = activity;
    }

    public FragmentActivity getActivity() {
        return mActivity;
    }

    public WeatherApi getWeatherApi() {
        return mCompositionRoot.getWeatherApi();
    }

    public DialogsEventBus getDialogsEventBus() {
        return mCompositionRoot.getDialogsEventBus();
    }

    public PermissionsHelper getPermissionsHelper() {
        if (mPermissionsHelper == null) {
            mPermissionsHelper = new PermissionsHelper(getActivity());
        }
        return mPermissionsHelper;
    }
}
