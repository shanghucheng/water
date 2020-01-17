package com.water.mapper;

import com.water.entity.Nav;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavMapper {
    public List<String> getImageUrl();
}