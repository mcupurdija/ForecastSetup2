package com.example.forecastsetup2.networking.schema;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForecastDaySchema implements Parcelable {

    @JsonProperty("date")
    private String date;
    @JsonProperty("date_epoch")
    private Integer dateEpoch;
    @JsonProperty("day")
    private DaySchema day;
    @JsonProperty("astro")
    private AstroSchema astro;
    @JsonProperty("hour")
    private List<HourSchema> hour = null;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public ForecastDaySchema() {
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("date_epoch")
    public Integer getDateEpoch() {
        return dateEpoch;
    }

    @JsonProperty("date_epoch")
    public void setDateEpoch(Integer dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    @JsonProperty("day")
    public DaySchema getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(DaySchema day) {
        this.day = day;
    }

    @JsonProperty("astro")
    public AstroSchema getAstro() {
        return astro;
    }

    @JsonProperty("astro")
    public void setAstro(AstroSchema astro) {
        this.astro = astro;
    }

    @JsonProperty("hour")
    public List<HourSchema> getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(List<HourSchema> hour) {
        this.hour = hour;
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
        dest.writeString(this.date);
        dest.writeValue(this.dateEpoch);
        dest.writeParcelable(this.day, flags);
        dest.writeParcelable(this.astro, flags);
        dest.writeList(this.hour);
    }

    public void readFromParcel(Parcel source) {
        this.date = source.readString();
        this.dateEpoch = (Integer) source.readValue(Integer.class.getClassLoader());
        this.day = source.readParcelable(DaySchema.class.getClassLoader());
        this.astro = source.readParcelable(AstroSchema.class.getClassLoader());
        this.hour = new ArrayList<HourSchema>();
        source.readList(this.hour, HourSchema.class.getClassLoader());
    }

    protected ForecastDaySchema(Parcel in) {
        this.date = in.readString();
        this.dateEpoch = (Integer) in.readValue(Integer.class.getClassLoader());
        this.day = in.readParcelable(DaySchema.class.getClassLoader());
        this.astro = in.readParcelable(AstroSchema.class.getClassLoader());
        this.hour = new ArrayList<HourSchema>();
        in.readList(this.hour, HourSchema.class.getClassLoader());
    }

    public static final Parcelable.Creator<ForecastDaySchema> CREATOR = new Parcelable.Creator<ForecastDaySchema>() {
        @Override
        public ForecastDaySchema createFromParcel(Parcel source) {
            return new ForecastDaySchema(source);
        }

        @Override
        public ForecastDaySchema[] newArray(int size) {
            return new ForecastDaySchema[size];
        }
    };
}