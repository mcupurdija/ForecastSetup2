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
public class CurrentSchema implements Parcelable {

    @JsonProperty("last_updated_epoch")
    private Integer lastUpdatedEpoch;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("temp_c")
    private Double tempC;
    @JsonProperty("temp_f")
    private Double tempF;
    @JsonProperty("is_day")
    private Integer isDay;
    @JsonProperty("condition")
    private ConditionSchema condition;
    @JsonProperty("wind_mph")
    private Double windMph;
    @JsonProperty("wind_kph")
    private Double windKph;
    @JsonProperty("wind_degree")
    private Integer windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure_mb")
    private Double pressureMb;
    @JsonProperty("pressure_in")
    private Double pressureIn;
    @JsonProperty("precip_mm")
    private Double precipMm;
    @JsonProperty("precip_in")
    private Double precipIn;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("cloud")
    private Integer cloud;
    @JsonProperty("feelslike_c")
    private Double feelslikeC;
    @JsonProperty("feelslike_f")
    private Double feelslikeF;
    @JsonProperty("vis_km")
    private Double visKm;
    @JsonProperty("vis_miles")
    private Double visMiles;
    @JsonProperty("uv")
    private Double uv;
    @JsonProperty("gust_mph")
    private Double gustMph;
    @JsonProperty("gust_kph")
    private Double gustKph;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public CurrentSchema() {
    }

    @JsonProperty("last_updated_epoch")
    public Integer getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    @JsonProperty("last_updated_epoch")
    public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("temp_c")
    public Double getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("temp_f")
    public Double getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("is_day")
    public Integer getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    @JsonProperty("condition")
    public ConditionSchema getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(ConditionSchema condition) {
        this.condition = condition;
    }

    @JsonProperty("wind_mph")
    public Double getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    @JsonProperty("wind_kph")
    public Double getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    @JsonProperty("wind_degree")
    public Integer getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("pressure_mb")
    public Double getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
    }

    @JsonProperty("pressure_in")
    public Double getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    @JsonProperty("precip_mm")
    public Double getPrecipMm() {
        return precipMm;
    }

    @JsonProperty("precip_mm")
    public void setPrecipMm(Double precipMm) {
        this.precipMm = precipMm;
    }

    @JsonProperty("precip_in")
    public Double getPrecipIn() {
        return precipIn;
    }

    @JsonProperty("precip_in")
    public void setPrecipIn(Double precipIn) {
        this.precipIn = precipIn;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("cloud")
    public Integer getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    @JsonProperty("feelslike_c")
    public Double getFeelslikeC() {
        return feelslikeC;
    }

    @JsonProperty("feelslike_c")
    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    @JsonProperty("feelslike_f")
    public Double getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    @JsonProperty("vis_km")
    public Double getVisKm() {
        return visKm;
    }

    @JsonProperty("vis_km")
    public void setVisKm(Double visKm) {
        this.visKm = visKm;
    }

    @JsonProperty("vis_miles")
    public Double getVisMiles() {
        return visMiles;
    }

    @JsonProperty("vis_miles")
    public void setVisMiles(Double visMiles) {
        this.visMiles = visMiles;
    }

    @JsonProperty("uv")
    public Double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Double uv) {
        this.uv = uv;
    }

    @JsonProperty("gust_mph")
    public Double getGustMph() {
        return gustMph;
    }

    @JsonProperty("gust_mph")
    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    @JsonProperty("gust_kph")
    public Double getGustKph() {
        return gustKph;
    }

    @JsonProperty("gust_kph")
    public void setGustKph(Double gustKph) {
        this.gustKph = gustKph;
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
        dest.writeValue(this.lastUpdatedEpoch);
        dest.writeString(this.lastUpdated);
        dest.writeValue(this.tempC);
        dest.writeValue(this.tempF);
        dest.writeValue(this.isDay);
        dest.writeParcelable(this.condition, flags);
        dest.writeValue(this.windMph);
        dest.writeValue(this.windKph);
        dest.writeValue(this.windDegree);
        dest.writeString(this.windDir);
        dest.writeValue(this.pressureMb);
        dest.writeValue(this.pressureIn);
        dest.writeValue(this.precipMm);
        dest.writeValue(this.precipIn);
        dest.writeValue(this.humidity);
        dest.writeValue(this.cloud);
        dest.writeValue(this.feelslikeC);
        dest.writeValue(this.feelslikeF);
        dest.writeValue(this.visKm);
        dest.writeValue(this.visMiles);
        dest.writeValue(this.uv);
        dest.writeValue(this.gustMph);
        dest.writeValue(this.gustKph);
    }

    public void readFromParcel(Parcel source) {
        this.lastUpdatedEpoch = (Integer) source.readValue(Integer.class.getClassLoader());
        this.lastUpdated = source.readString();
        this.tempC = (Double) source.readValue(Double.class.getClassLoader());
        this.tempF = (Double) source.readValue(Double.class.getClassLoader());
        this.isDay = (Integer) source.readValue(Integer.class.getClassLoader());
        this.condition = source.readParcelable(ConditionSchema.class.getClassLoader());
        this.windMph = (Double) source.readValue(Double.class.getClassLoader());
        this.windKph = (Double) source.readValue(Double.class.getClassLoader());
        this.windDegree = (Integer) source.readValue(Integer.class.getClassLoader());
        this.windDir = source.readString();
        this.pressureMb = (Double) source.readValue(Double.class.getClassLoader());
        this.pressureIn = (Double) source.readValue(Double.class.getClassLoader());
        this.precipMm = (Double) source.readValue(Double.class.getClassLoader());
        this.precipIn = (Double) source.readValue(Double.class.getClassLoader());
        this.humidity = (Integer) source.readValue(Integer.class.getClassLoader());
        this.cloud = (Integer) source.readValue(Integer.class.getClassLoader());
        this.feelslikeC = (Double) source.readValue(Double.class.getClassLoader());
        this.feelslikeF = (Double) source.readValue(Double.class.getClassLoader());
        this.visKm = (Double) source.readValue(Double.class.getClassLoader());
        this.visMiles = (Double) source.readValue(Double.class.getClassLoader());
        this.uv = (Double) source.readValue(Double.class.getClassLoader());
        this.gustMph = (Double) source.readValue(Double.class.getClassLoader());
        this.gustKph = (Double) source.readValue(Double.class.getClassLoader());
    }

    protected CurrentSchema(Parcel in) {
        this.lastUpdatedEpoch = (Integer) in.readValue(Integer.class.getClassLoader());
        this.lastUpdated = in.readString();
        this.tempC = (Double) in.readValue(Double.class.getClassLoader());
        this.tempF = (Double) in.readValue(Double.class.getClassLoader());
        this.isDay = (Integer) in.readValue(Integer.class.getClassLoader());
        this.condition = in.readParcelable(ConditionSchema.class.getClassLoader());
        this.windMph = (Double) in.readValue(Double.class.getClassLoader());
        this.windKph = (Double) in.readValue(Double.class.getClassLoader());
        this.windDegree = (Integer) in.readValue(Integer.class.getClassLoader());
        this.windDir = in.readString();
        this.pressureMb = (Double) in.readValue(Double.class.getClassLoader());
        this.pressureIn = (Double) in.readValue(Double.class.getClassLoader());
        this.precipMm = (Double) in.readValue(Double.class.getClassLoader());
        this.precipIn = (Double) in.readValue(Double.class.getClassLoader());
        this.humidity = (Integer) in.readValue(Integer.class.getClassLoader());
        this.cloud = (Integer) in.readValue(Integer.class.getClassLoader());
        this.feelslikeC = (Double) in.readValue(Double.class.getClassLoader());
        this.feelslikeF = (Double) in.readValue(Double.class.getClassLoader());
        this.visKm = (Double) in.readValue(Double.class.getClassLoader());
        this.visMiles = (Double) in.readValue(Double.class.getClassLoader());
        this.uv = (Double) in.readValue(Double.class.getClassLoader());
        this.gustMph = (Double) in.readValue(Double.class.getClassLoader());
        this.gustKph = (Double) in.readValue(Double.class.getClassLoader());
    }

    public static final Parcelable.Creator<CurrentSchema> CREATOR = new Parcelable.Creator<CurrentSchema>() {
        @Override
        public CurrentSchema createFromParcel(Parcel source) {
            return new CurrentSchema(source);
        }

        @Override
        public CurrentSchema[] newArray(int size) {
            return new CurrentSchema[size];
        }
    };
}