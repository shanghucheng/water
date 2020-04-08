package com.water.biz;

import com.water.entity.WaterInfo;
import com.water.mapper.WaterInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import com.cpic.caf.compon.tech.utils.StringUtils;

@Service
public class WaterInfoBiz {
    @Autowired
    private WaterInfoMapper mapper;

    public List<WaterInfo> getWaterInfo(String isCart, String isTab,String typeId) {

        List<WaterInfo> getWaterInfo = new ArrayList<>();
        if ("0".equalsIgnoreCase(isCart)) {
            switch (isTab) {
                case "0":
                    getWaterInfo = mapper.getWaterInfo(isTab,typeId);
                    break;
                case "1":
                    getWaterInfo = mapper.getWaterInfo(isTab,typeId);
                    break;
                default:
                    getWaterInfo = mapper.getWaterInfo(isTab,typeId);
            }
        }
        return getWaterInfo;
    }

    public WaterInfo getWaterInfoById(String id) {
        return mapper.getWaterInfoById(id);
    }

    public void updateStockAndSalesvolume(String id, String stock, String salesvolume) {
        if ("0".equalsIgnoreCase(stock)) {
            mapper.updateState(id, stock);
        } else {
            mapper.updateStockAndSalesvolume(id, stock, salesvolume);
        }
    }

    public List<WaterInfo> getWaterByTypeId(String watertype){
        return mapper.getWaterByTypeId(watertype);
    }


}
