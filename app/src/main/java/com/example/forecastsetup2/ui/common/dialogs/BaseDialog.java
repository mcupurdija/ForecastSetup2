package com.example.forecastsetup2.ui.common.dialogs;

import android.support.v4.app.DialogFragment;

import com.example.forecastsetup2.common.di.ControllerCompositionRoot;
import com.example.forecastsetup2.ui.MainActivity;

public abstract class BaseDialog extends DialogFragment {


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
