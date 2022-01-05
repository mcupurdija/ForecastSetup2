package com.example.forecastsetup2.ui.forecast;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.forecastsetup2.networking.schema.ForecastDaySchema;
import com.example.forecastsetup2.networking.schema.HourSchema;
import com.example.forecastsetup2.ui.common.ViewMvcFactory;
import com.example.forecastsetup2.ui.forecast.forecastItem.ForecastItemViewMvc;

import java.util.ArrayList;
import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.MyViewHolder> implements ForecastItemViewMvc.Listener {

    public interface Listener {
        void onHourClicked(HourSchema hourSchema);
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final ForecastItemViewMvc mViewMvc;

        public MyViewHolder(ForecastItemViewMvc viewMvc) {
            super(viewMvc.getRootView());
            mViewMvc = viewMvc;
        }
    }

    private final Listener mListener;
    private final ViewMvcFactory mViewMvcFactory;

    private List<HourSchema> mHours = new ArrayList<>();

    public ForecastAdapter(Listener listener, ViewMvcFactory viewMvcFactory) {
        mListener = listener;
        mViewMvcFactory = viewMvcFactory;
    }

    public void bindForecast(List<HourSchema> hourSchemaList) {
        mHours = new ArrayList<>(hourSchemaList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ForecastItemViewMvc viewMvc = mViewMvcFactory.getForecastItemViewMvc(parent);
        viewMvc.registerListener(this);
        return new MyViewHolder(viewMvc);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mViewMvc.bindDay(mHours.get(position));
    }

    @Override
    public int getItemCount() {
        return mHours.size();
    }

    @Override
    public void onHourClicked(HourSchema hourSchema) {
        mListener.onHourClicked(hourSchema);
    }
}
