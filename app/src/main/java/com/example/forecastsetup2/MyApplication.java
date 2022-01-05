package com.example.forecastsetup2;

import android.app.Application;

import com.example.forecastsetup2.common.di.CompositionRoot;

public class MyApplication extends Application {

    private CompositionRoot mCompositionRoot;

    @Override
    public void onCreate() {
        super.onCreate();
        mCompositionRoot = new CompositionRoot();
    }

    public CompositionRoot getCompositionRoot() {
        return mCompositionRoot;
    }
}
