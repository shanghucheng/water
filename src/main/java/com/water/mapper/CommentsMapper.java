package com.water.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CommentsMapper {
public List<Map<String,String>> getWaterComment(@Param("id") String id,@Param("sign") String sign);
}