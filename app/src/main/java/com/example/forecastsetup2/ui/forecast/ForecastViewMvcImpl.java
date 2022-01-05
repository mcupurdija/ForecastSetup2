package com.example.forecastsetup2.ui.forecast;

import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.forecastsetup2.R;
import com.example.forecastsetup2.networking.schema.ForecastDaySchema;
import com.example.forecastsetup2.networking.schema.HourSchema;
import com.example.forecastsetup2.networking.schema.LocationSchema;
import com.example.forecastsetup2.ui.common.ViewMvcFactory;
import com.example.forecastsetup2.ui.common.views.BaseObservableViewMvc;

import java.util.List;

public class ForecastViewMvcImpl extends BaseObservableViewMvc<ForecastViewMvc.Listener>
        implements ForecastViewMvc, ForecastAdapter.Listener {

    private final EditText mCity;
    private final Button mSearch;
    private final TextView mLocation;
    private final RecyclerView mRecyclerView;
    private final ForecastAdapter mAdapter;
    private final ProgressBar mProgressBar;

    public ForecastViewMvcImpl(LayoutInflater inflater, @Nullable ViewGroup parent, ViewMvcFactory viewMvcFactory) {
        setRootView(inflater.inflate(R.layout.fragment_forecast, parent, false));

        mCity = findViewById(R.id.etCity);
        mSearch = findViewById(R.id.bSearch);
        mSearch.setOnClickListener(v -> {

            if (TextUtils.isEmpty(mCity.getText())) return;
            for (Listener listener : getListeners()) {
                listener.onSearchClicked(mCity.getText().toString());
            }
        });
        mLocation = findViewById(R.id.tvLocation);

        mRecyclerView = findViewById(R.id.forecastList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        mAdapter = new ForecastAdapter(this, viewMvcFactory);
        mRecyclerView.setAdapter(mAdapter);

        mProgressBar = findViewById(R.id.progress);
    }

    @Override
    public void setLocation(LocationSchema locationSchema) {
        mLocation.setText(String.format("%s, %s, %s", locationSchema.getName(), locationSchema.getRegion(), locationSchema.getCountry()));
    }

    @Override
    public void bindForecast(List<HourSchema> hourSchemaList) {
        mAdapter.bindForecast(hourSchemaList);
    }

    @Override
    public void showProgressIndication() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressIndication() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void onHourClicked(HourSchema hourSchema) {
        for (Listener listener : getListeners()) {
            listener.onHourClicked(hourSchema);
        }
    }
}