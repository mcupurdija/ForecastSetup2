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
public class DaySchema implements Parcelable {

    @JsonProperty("maxtemp_c")
    private Double maxtempC;
    @JsonProperty("maxtemp_f")
    private Double maxtempF;
    @JsonProperty("mintemp_c")
    private Double mintempC;
    @JsonProperty("mintemp_f")
    private Double mintempF;
    @JsonProperty("avgtemp_c")
    private Double avgtempC;
    @JsonProperty("avgtemp_f")
    private Double avgtempF;
    @JsonProperty("maxwind_mph")
    private Double maxwindMph;
    @JsonProperty("maxwind_kph")
    private Double maxwindKph;
    @JsonProperty("totalprecip_mm")
    private Double totalprecipMm;
    @JsonProperty("totalprecip_in")
    private Double totalprecipIn;
    @JsonProperty("avgvis_km")
    private Double avgvisKm;
    @JsonProperty("avgvis_miles")
    private Double avgvisMiles;
    @JsonProperty("avghumidity")
    private Double avghumidity;
    @JsonProperty("daily_will_it_rain")
    private Integer dailyWillItRain;
    @JsonProperty("daily_chance_of_rain")
    private Integer dailyChanceOfRain;
    @JsonProperty("daily_will_it_snow")
    private Integer dailyWillItSnow;
    @JsonProperty("daily_chance_of_snow")
    private Integer dailyChanceOfSnow;
    @JsonProperty("condition")
    private ConditionSchema condition;
    @JsonProperty("uv")
    private Double uv;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public DaySchema() {
    }

    @JsonProperty("maxtemp_c")
    public Double getMaxtempC() {
        return maxtempC;
    }

    @JsonProperty("maxtemp_c")
    public void setMaxtempC(Double maxtempC) {
        this.maxtempC = maxtempC;
    }

    @JsonProperty("maxtemp_f")
    public Double getMaxtempF() {
        return maxtempF;
    }

    @JsonProperty("maxtemp_f")
    public void setMaxtempF(Double maxtempF) {
        this.maxtempF = maxtempF;
    }

    @JsonProperty("mintemp_c")
    public Double getMintempC() {
        return mintempC;
    }

    @JsonProperty("mintemp_c")
    public void setMintempC(Double mintempC) {
        this.mintempC = mintempC;
    }

    @JsonProperty("mintemp_f")
    public Double getMintempF() {
        return mintempF;
    }

    @JsonProperty("mintemp_f")
    public void setMintempF(Double mintempF) {
        this.mintempF = mintempF;
    }

    @JsonProperty("avgtemp_c")
    public Double getAvgtempC() {
        return avgtempC;
    }

    @JsonProperty("avgtemp_c")
    public void setAvgtempC(Double avgtempC) {
        this.avgtempC = avgtempC;
    }

    @JsonProperty("avgtemp_f")
    public Double getAvgtempF() {
        return avgtempF;
    }

    @JsonProperty("avgtemp_f")
    public void setAvgtempF(Double avgtempF) {
        this.avgtempF = avgtempF;
    }

    @JsonProperty("maxwind_mph")
    public Double getMaxwindMph() {
        return maxwindMph;
    }

    @JsonProperty("maxwind_mph")
    public void setMaxwindMph(Double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    @JsonProperty("maxwind_kph")
    public Double getMaxwindKph() {
        return maxwindKph;
    }

    @JsonProperty("maxwind_kph")
    public void setMaxwindKph(Double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    @JsonProperty("totalprecip_mm")
    public Double getTotalprecipMm() {
        return totalprecipMm;
    }

    @JsonProperty("totalprecip_mm")
    public void setTotalprecipMm(Double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    @JsonProperty("totalprecip_in")
    public Double getTotalprecipIn() {
        return totalprecipIn;
    }

    @JsonProperty("totalprecip_in")
    public void setTotalprecipIn(Double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    @JsonProperty("avgvis_km")
    public Double getAvgvisKm() {
        return avgvisKm;
    }

    @JsonProperty("avgvis_km")
    public void setAvgvisKm(Double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    @JsonProperty("avgvis_miles")
    public Double getAvgvisMiles() {
        return avgvisMiles;
    }

    @JsonProperty("avgvis_miles")
    public void setAvgvisMiles(Double avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    @JsonProperty("avghumidity")
    public Double getAvghumidity() {
        return avghumidity;
    }

    @JsonProperty("avghumidity")
    public void setAvghumidity(Double avghumidity) {
        this.avghumidity = avghumidity;
    }

    @JsonProperty("daily_will_it_rain")
    public Integer getDailyWillItRain() {
        return dailyWillItRain;
    }

    @JsonProperty("daily_will_it_rain")
    public void setDailyWillItRain(Integer dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    @JsonProperty("daily_chance_of_rain")
    public Integer getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    @JsonProperty("daily_chance_of_rain")
    public void setDailyChanceOfRain(Integer dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    @JsonProperty("daily_will_it_snow")
    public Integer getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    @JsonProperty("daily_will_it_snow")
    public void setDailyWillItSnow(Integer dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    @JsonProperty("daily_chance_of_snow")
    public Integer getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    @JsonProperty("daily_chance_of_snow")
    public void setDailyChanceOfSnow(Integer dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    @JsonProperty("condition")
    public ConditionSchema getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(ConditionSchema condition) {
        this.condition = condition;
    }

    @JsonProperty("uv")
    public Double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Double uv) {
        this.uv = uv;
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
        dest.writeValue(this.maxtempC);
        dest.writeValue(this.maxtempF);
        dest.writeValue(this.mintempC);
        dest.writeValue(this.mintempF);
        dest.writeValue(this.avgtempC);
        dest.writeValue(this.avgtempF);
        dest.writeValue(this.maxwindMph);
        dest.writeValue(this.maxwindKph);
        dest.writeValue(this.totalprecipMm);
        dest.writeValue(this.totalprecipIn);
        dest.writeValue(this.avgvisKm);
        dest.writeValue(this.avgvisMiles);
        dest.writeValue(this.avghumidity);
        dest.writeValue(this.dailyWillItRain);
        dest.writeValue(this.dailyChanceOfRain);
        dest.writeValue(this.dailyWillItSnow);
        dest.writeValue(this.dailyChanceOfSnow);
        dest.writeParcelable(this.condition, flags);
        dest.writeValue(this.uv);
    }

    public void readFromParcel(Parcel source) {
        this.maxtempC = (Double) source.readValue(Double.class.getClassLoader());
        this.maxtempF = (Double) source.readValue(Double.class.getClassLoader());
        this.mintempC = (Double) source.readValue(Double.class.getClassLoader());
        this.mintempF = (Double) source.readValue(Double.class.getClassLoader());
        this.avgtempC = (Double) source.readValue(Double.class.getClassLoader());
        this.avgtempF = (Double) source.readValue(Double.class.getClassLoader());
        this.maxwindMph = (Double) source.readValue(Double.class.getClassLoader());
        this.maxwindKph = (Double) source.readValue(Double.class.getClassLoader());
        this.totalprecipMm = (Double) source.readValue(Double.class.getClassLoader());
        this.totalprecipIn = (Double) source.readValue(Double.class.getClassLoader());
        this.avgvisKm = (Double) source.readValue(Double.class.getClassLoader());
        this.avgvisMiles = (Double) source.readValue(Double.class.getClassLoader());
        this.avghumidity = (Double) source.readValue(Double.class.getClassLoader());
        this.dailyWillItRain = (Integer) source.readValue(Integer.class.getClassLoader());
        this.dailyChanceOfRain = (Integer) source.readValue(Integer.class.getClassLoader());
        this.dailyWillItSnow = (Integer) source.readValue(Integer.class.getClassLoader());
        this.dailyChanceOfSnow = (Integer) source.readValue(Integer.class.getClassLoader());
        this.condition = source.readParcelable(ConditionSchema.class.getClassLoader());
        this.uv = (Double) source.readValue(Double.class.getClassLoader());
    }

    protected DaySchema(Parcel in) {
        this.maxtempC = (Double) in.readValue(Double.class.getClassLoader());
        this.maxtempF = (Double) in.readValue(Double.class.getClassLoader());
        this.mintempC = (Double) in.readValue(Double.class.getClassLoader());
        this.mintempF = (Double) in.readValue(Double.class.getClassLoader());
        this.avgtempC = (Double) in.readValue(Double.class.getClassLoader());
        this.avgtempF = (Double) in.readValue(Double.class.getClassLoader());
        this.maxwindMph = (Double) in.readValue(Double.class.getClassLoader());
        this.maxwindKph = (Double) in.readValue(Double.class.getClassLoader());
        this.totalprecipMm = (Double) in.readValue(Double.class.getClassLoader());
        this.totalprecipIn = (Double) in.readValue(Double.class.getClassLoader());
        this.avgvisKm = (Double) in.readValue(Double.class.getClassLoader());
        this.avgvisMiles = (Double) in.readValue(Double.class.getClassLoader());
        this.avghumidity = (Double) in.readValue(Double.class.getClassLoader());
        this.dailyWillItRain = (Integer) in.readValue(Integer.class.getClassLoader());
        this.dailyChanceOfRain = (Integer) in.readValue(Integer.class.getClassLoader());
        this.dailyWillItSnow = (Integer) in.readValue(Integer.class.getClassLoader());
        this.dailyChanceOfSnow = (Integer) in.readValue(Integer.class.getClassLoader());
        this.condition = in.readParcelable(ConditionSchema.class.getClassLoader());
        this.uv = (Double) in.readValue(Double.class.getClassLoader());
    }

    public static final Parcelable.Creator<DaySchema> CREATOR = new Parcelable.Creator<DaySchema>() {
        @Override
        public DaySchema createFromParcel(Parcel source) {
            return new DaySchema(source);
        }

        @Override
        public DaySchema[] newArray(int size) {
            return new DaySchema[size];
        }
    };
}