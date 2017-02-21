package com.example.liuying.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by liuying on 2017/2/20.
 * Description:县
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县名
    private String weatherId;//县所对应天气id
    private int cityId;//当前县所属城市id

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
