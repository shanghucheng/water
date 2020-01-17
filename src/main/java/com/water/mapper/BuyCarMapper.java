package com.water.mapper;

import com.water.entity.BuyCar;
import com.water.entity.BuyCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyCarMapper {
    int countByExample(BuyCarExample example);

    int deleteByExample(BuyCarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BuyCar record);

    int insertSelective(BuyCar record);

    List<BuyCar> selectByExample(BuyCarExample example);

    BuyCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BuyCar record, @Param("example") BuyCarExample example);

    int updateByExample(@Param("record") BuyCar record, @Param("example") BuyCarExample example);

    int updateByPrimaryKeySelective(BuyCar record);

    int updateByPrimaryKey(BuyCar record);
}