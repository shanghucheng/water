package com.water.Biz;

import com.water.entity.WaterInfo;
import com.water.mapper.WaterInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WaterInfoBiz {

    @Autowired
    private WaterInfoMapper mapper;

    public List<Map<String,String>> getBaseWaterInfo(){
        return mapper.getBaseWaterInfo();
    }
    public List<Map<String,String>> getWaterInfoDetail(String id){
        return mapper.getWaterInfoDetail(id);
    }
}
