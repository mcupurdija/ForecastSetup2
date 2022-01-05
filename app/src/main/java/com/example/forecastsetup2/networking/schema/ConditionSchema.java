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
public class ConditionSchema implements Parcelable {

    @JsonProperty("text")
    private String text;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("code")
    private Integer code;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    public ConditionSchema() {
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
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
        dest.writeString(this.text);
        dest.writeString(this.icon);
        dest.writeValue(this.code);
    }

    public void readFromParcel(Parcel source) {
        this.text = source.readString();
        this.icon = source.readString();
        this.code = (Integer) source.readValue(Integer.class.getClassLoader());
    }

    protected ConditionSchema(Parcel in) {
        this.text = in.readString();
        this.icon = in.readString();
        this.code = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<ConditionSchema> CREATOR = new Parcelable.Creator<ConditionSchema>() {
        @Override
        public ConditionSchema createFromParcel(Parcel source) {
            return new ConditionSchema(source);
        }

        @Override
        public ConditionSchema[] newArray(int size) {
            return new ConditionSchema[size];
        }
    };
}