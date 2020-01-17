package com.water.Biz;

import com.water.entity.GuigeList;
import com.water.mapper.GuigeListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuigeListBiz {

    @Autowired
    private GuigeListMapper mapper;

    public List<GuigeList> getwaterGuiGe(String id){
        return mapper.getwaterGuiGe(id);
    }
}
