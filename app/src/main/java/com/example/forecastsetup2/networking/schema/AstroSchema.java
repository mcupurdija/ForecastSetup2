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
public class AstroSchema implements Parcelable {

    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("moonrise")
    private String moonrise;
    @JsonProperty("moonset")
    private String moonset;
    @JsonProperty("moon_phase")
    private String moonPhase;
    @JsonProperty("moon_illumination")
    private String moonIllumination;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public AstroSchema() {
    }

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("moonrise")
    public String getMoonrise() {
        return moonrise;
    }

    @JsonProperty("moonrise")
    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    @JsonProperty("moonset")
    public String getMoonset() {
        return moonset;
    }

    @JsonProperty("moonset")
    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    @JsonProperty("moon_phase")
    public String getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moon_phase")
    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("moon_illumination")
    public String getMoonIllumination() {
        return moonIllumination;
    }

    @JsonProperty("moon_illumination")
    public void setMoonIllumination(String moonIllumination) {
        this.moonIllumination = moonIllumination;
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
        dest.writeString(this.sunrise);
        dest.writeString(this.sunset);
        dest.writeString(this.moonrise);
        dest.writeString(this.moonset);
        dest.writeString(this.moonPhase);
        dest.writeString(this.moonIllumination);
    }

    public void readFromParcel(Parcel source) {
        this.sunrise = source.readString();
        this.sunset = source.readString();
        this.moonrise = source.readString();
        this.moonset = source.readString();
        this.moonPhase = source.readString();
        this.moonIllumination = source.readString();
    }

    protected AstroSchema(Parcel in) {
        this.sunrise = in.readString();
        this.sunset = in.readString();
        this.moonrise = in.readString();
        this.moonset = in.readString();
        this.moonPhase = in.readString();
        this.moonIllumination = in.readString();
    }

    public static final Parcelable.Creator<AstroSchema> CREATOR = new Parcelable.Creator<AstroSchema>() {
        @Override
        public AstroSchema createFromParcel(Parcel source) {
            return new AstroSchema(source);
        }

        @Override
        public AstroSchema[] newArray(int size) {
            return new AstroSchema[size];
        }
    };
}