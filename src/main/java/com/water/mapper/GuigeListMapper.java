package com.water.mapper;

import com.water.entity.GuigeList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuigeListMapper {
  public List<GuigeList> getwaterGuiGe(@Param("id") String id);
}