package com.coolweather.coolweather.db;


import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class City extends LitePalSupport {

    private int id;

    private String cityName; // 市名

    private int cityCode; // 市的代号

    private int provinceId; // 当前市所属的省id
}
