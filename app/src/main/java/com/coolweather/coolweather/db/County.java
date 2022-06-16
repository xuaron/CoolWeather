package com.coolweather.coolweather.db;


import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class County extends LitePalSupport {

    private int id;

    private String countyName; // 县名

    private String weatherId; // 县对应的天气 id

    private int cityId; // 当前县所属市的 id 值
}
