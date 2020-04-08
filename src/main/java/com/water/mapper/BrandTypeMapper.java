package com.water.mapper;

import com.water.entity.BrandType;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandTypeMapper extends Mapper<BrandType> {
    public List<BrandType> getCategoryId();
}