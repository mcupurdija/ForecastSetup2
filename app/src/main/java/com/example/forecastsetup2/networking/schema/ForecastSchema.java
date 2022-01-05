package com.example.forecastsetup2.networking.schema;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForecastSchema implements Parcelable {

    @JsonProperty("forecastday")
    private List<ForecastDaySchema> forecastday = null;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public ForecastSchema() {
    }

    @JsonProperty("forecastday")
    public List<ForecastDaySchema> getForecastday() {
        return forecastday;
    }

    @JsonProperty("forecastday")
    public void setForecastday(List<ForecastDaySchema> forecastday) {
        this.forecastday = forecastday;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.forecastday);
    }

    public void readFromParcel(Parcel source) {
        this.forecastday = source.createTypedArrayList(ForecastDaySchema.CREATOR);
    }

    protected ForecastSchema(Parcel in) {
        this.forecastday = in.createTypedArrayList(ForecastDaySchema.CREATOR);
    }

    public static final Parcelable.Creator<ForecastSchema> CREATOR = new Parcelable.Creator<ForecastSchema>() {
        @Override
        public ForecastSchema createFromParcel(Parcel source) {
            return new ForecastSchema(source);
        }

        @Override
        public ForecastSchema[] newArray(int size) {
            return new ForecastSchema[size];
        }
    };
}