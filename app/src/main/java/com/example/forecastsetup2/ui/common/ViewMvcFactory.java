package com.example.forecastsetup2.ui.common;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.forecastsetup2.ui.common.dialogs.promptdialog.PromptViewMvc;
import com.example.forecastsetup2.ui.common.dialogs.promptdialog.PromptViewMvcImpl;
import com.example.forecastsetup2.ui.common.navdrawer.NavDrawerHelper;
import com.example.forecastsetup2.ui.common.navdrawer.NavDrawerViewMvc;
import com.example.forecastsetup2.ui.common.navdrawer.NavDrawerViewMvcImpl;
import com.example.forecastsetup2.ui.common.toolbar.ToolbarViewMvc;
import com.example.forecastsetup2.ui.forecast.ForecastViewMvc;
import com.example.forecastsetup2.ui.forecast.ForecastViewMvcImpl;
import com.example.forecastsetup2.ui.forecast.forecastItem.ForecastItemViewMvc;
import com.example.forecastsetup2.ui.forecast.forecastItem.ForecastItemViewMvcImpl;

public class ViewMvcFactory {

    private final LayoutInflater mLayoutInflater;
    private final NavDrawerHelper mNavDrawerHelper;

    public ViewMvcFactory(LayoutInflater layoutInflater, NavDrawerHelper navDrawerHelper) {
        mLayoutInflater = layoutInflater;
        mNavDrawerHelper = navDrawerHelper;
    }

    public ToolbarViewMvc getToolbarViewMvc(@Nullable ViewGroup parent) {
        return new ToolbarViewMvc(mLayoutInflater, parent);
    }

    public NavDrawerViewMvc getNavDrawerViewMvc(@Nullable ViewGroup parent) {
        return new NavDrawerViewMvcImpl(mLayoutInflater, parent);
    }

    public ForecastViewMvc getForecastViewMvc(@Nullable ViewGroup parent) {
        return new ForecastViewMvcImpl(mLayoutInflater, parent, this);
    }

    public ForecastItemViewMvc getForecastItemViewMvc(@Nullable ViewGroup parent) {
        return new ForecastItemViewMvcImpl(mLayoutInflater, parent);
    }

    public PromptViewMvc getPromptViewMvc(@Nullable ViewGroup parent) {
        return new PromptViewMvcImpl(mLayoutInflater, parent);
    }
}