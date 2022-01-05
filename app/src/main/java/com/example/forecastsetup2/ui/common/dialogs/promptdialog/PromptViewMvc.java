package com.example.forecastsetup2.ui.common.dialogs.promptdialog;

import com.example.forecastsetup2.ui.common.views.ObservableViewMvc;

public interface PromptViewMvc extends ObservableViewMvc<PromptViewMvc.Listener> {

    public interface Listener {
        void onPositiveButtonClicked();

        void onNegativeButtonClicked();
    }

    void setTitle(String title);

    void setMessage(String message);

    void setPositiveButtonCaption(String caption);

    void setNegativeButtonCaption(String caption);
}

