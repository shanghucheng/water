package com.water.Vo;

import lombok.Data;

@Data
public class WaterTypeVo {
    private int typeId;
    private int id;
    private String type;
    private int categoryId;
    private String brandName;
    private String imgUrl;
}
