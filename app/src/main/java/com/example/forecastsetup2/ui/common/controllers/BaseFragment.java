package com.example.forecastsetup2.ui.common.controllers;

import android.support.v4.app.Fragment;

import com.example.forecastsetup2.common.di.ControllerCompositionRoot;
import com.example.forecastsetup2.ui.MainActivity;

public class BaseFragment extends Fragment {

    private ControllerCompositionRoot mControllerCompositionRoot;

    protected ControllerCompositionRoot getCompositionRoot() {
        if (mControllerCompositionRoot == null) {
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((MainActivity) getActivity()).getActivityCompositionRoot()
            );
        }
        return mControllerCompositionRoot;
    }
}
