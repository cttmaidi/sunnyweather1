package com.sunnyweather1.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ctt on 2017/12/25.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int proId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProId(){
        return proId;
    }
    public void setProId(int proId){
        this.proId=proId;
    }
}
