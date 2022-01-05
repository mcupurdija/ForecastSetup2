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
public class LocationSchema implements Parcelable {

    @JsonProperty("name")
    private String name;
    @JsonProperty("region")
    private String region;
    @JsonProperty("country")
    private String country;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("tz_id")
    private String tzId;
    @JsonProperty("localtime_epoch")
    private Integer localtimeEpoch;
    @JsonProperty("localtime")
    private String localtime;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public LocationSchema() {
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("tz_id")
    public String getTzId() {
        return tzId;
    }

    @JsonProperty("tz_id")
    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    @JsonProperty("localtime_epoch")
    public Integer getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    @JsonProperty("localtime_epoch")
    public void setLocaltimeEpoch(Integer localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    @JsonProperty("localtime")
    public String getLocaltime() {
        return localtime;
    }

    @JsonProperty("localtime")
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
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
        dest.writeString(this.name);
        dest.writeString(this.region);
        dest.writeString(this.country);
        dest.writeValue(this.lat);
        dest.writeValue(this.lon);
        dest.writeString(this.tzId);
        dest.writeValue(this.localtimeEpoch);
        dest.writeString(this.localtime);
    }

    public void readFromParcel(Parcel source) {
        this.name = source.readString();
        this.region = source.readString();
        this.country = source.readString();
        this.lat = (Double) source.readValue(Double.class.getClassLoader());
        this.lon = (Double) source.readValue(Double.class.getClassLoader());
        this.tzId = source.readString();
        this.localtimeEpoch = (Integer) source.readValue(Integer.class.getClassLoader());
        this.localtime = source.readString();
    }

    protected LocationSchema(Parcel in) {
        this.name = in.readString();
        this.region = in.readString();
        this.country = in.readString();
        this.lat = (Double) in.readValue(Double.class.getClassLoader());
        this.lon = (Double) in.readValue(Double.class.getClassLoader());
        this.tzId = in.readString();
        this.localtimeEpoch = (Integer) in.readValue(Integer.class.getClassLoader());
        this.localtime = in.readString();
    }

    public static final Parcelable.Creator<LocationSchema> CREATOR = new Parcelable.Creator<LocationSchema>() {
        @Override
        public LocationSchema createFromParcel(Parcel source) {
            return new LocationSchema(source);
        }

        @Override
        public LocationSchema[] newArray(int size) {
            return new LocationSchema[size];
        }
    };
}