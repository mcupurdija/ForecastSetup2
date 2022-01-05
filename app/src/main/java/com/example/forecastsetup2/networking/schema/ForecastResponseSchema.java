package com.example.forecastsetup2.networking.schema;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForecastResponseSchema implements Parcelable {

    @JsonProperty("location")
    private LocationSchema location;
    @JsonProperty("current")
    private CurrentSchema current;
    @JsonProperty("forecast")
    private ForecastSchema forecast;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public ForecastResponseSchema() {
    }

    @JsonProperty("location")
    public LocationSchema getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(LocationSchema location) {
        this.location = location;
    }

    @JsonProperty("current")
    public CurrentSchema getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(CurrentSchema current) {
        this.current = current;
    }

    @JsonProperty("forecast")
    public ForecastSchema getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(ForecastSchema forecast) {
        this.forecast = forecast;
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
        dest.writeParcelable(this.location, flags);
        dest.writeParcelable(this.current, flags);
        dest.writeParcelable(this.forecast, flags);
    }

    public void readFromParcel(Parcel source) {
        this.location = source.readParcelable(LocationSchema.class.getClassLoader());
        this.current = source.readParcelable(CurrentSchema.class.getClassLoader());
        this.forecast = source.readParcelable(ForecastSchema.class.getClassLoader());
    }

    protected ForecastResponseSchema(Parcel in) {
        this.location = in.readParcelable(LocationSchema.class.getClassLoader());
        this.current = in.readParcelable(CurrentSchema.class.getClassLoader());
        this.forecast = in.readParcelable(ForecastSchema.class.getClassLoader());
    }

    public static final Parcelable.Creator<ForecastResponseSchema> CREATOR = new Parcelable.Creator<ForecastResponseSchema>() {
        @Override
        public ForecastResponseSchema createFromParcel(Parcel source) {
            return new ForecastResponseSchema(source);
        }

        @Override
        public ForecastResponseSchema[] newArray(int size) {
            return new ForecastResponseSchema[size];
        }
    };
}