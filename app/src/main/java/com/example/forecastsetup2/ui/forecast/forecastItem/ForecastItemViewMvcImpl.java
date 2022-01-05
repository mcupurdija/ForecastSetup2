package com.example.forecastsetup2.ui.forecast.forecastItem;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.forecastsetup2.R;
import com.example.forecastsetup2.networking.schema.HourSchema;
import com.example.forecastsetup2.ui.common.views.BaseObservableViewMvc;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ForecastItemViewMvcImpl extends BaseObservableViewMvc<ForecastItemViewMvc.Listener> implements ForecastItemViewMvc {

    private final SimpleDateFormat apiFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    private final SimpleDateFormat uiFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());

    private final ImageView mIcon;
    private final TextView mTemp;
    private final TextView mHour;

    private HourSchema mHourSchema;

    public ForecastItemViewMvcImpl(LayoutInflater inflater, @Nullable ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.hour_item, parent, false));

        mIcon = findViewById(R.id.ivIcon);
        mTemp = findViewById(R.id.tvTemp);
        mHour = findViewById(R.id.tvHour);

        getRootView().setOnClickListener(view -> {
            for (Listener listener : getListeners()) {
                listener.onHourClicked(mHourSchema);
            }
        });
    }

    @Override
    public void bindDay(HourSchema hourSchema) {
        mHourSchema = hourSchema;

        try {
            Date date = apiFormat.parse(hourSchema.getTime());
            Picasso.with(getContext()).load("http:" + hourSchema.getCondition().getIcon()).into(mIcon);
            mTemp.setText(String.format("%s \u00B0C", hourSchema.getTempC()));
            mHour.setText(uiFormat.format(date));
        } catch (Exception ignored) {
        }
    }
}