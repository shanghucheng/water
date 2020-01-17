package com.water.mapper;

import com.water.entity.Specs;
import com.water.entity.SpecsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecsMapper {
    int countByExample(SpecsExample example);

    int deleteByExample(SpecsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Specs record);

    int insertSelective(Specs record);

    List<Specs> selectByExample(SpecsExample example);

    Specs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Specs record, @Param("example") SpecsExample example);

    int updateByExample(@Param("record") Specs record, @Param("example") SpecsExample example);

    int updateByPrimaryKeySelective(Specs record);

    int updateByPrimaryKey(Specs record);
}