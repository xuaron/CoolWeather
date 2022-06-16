package com.coolweather.coolweather.db;


import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class Province extends LitePalSupport {

    private int id;

    private String provinceName; // 省名

    private  int provinceCode; // 省的代号
}
