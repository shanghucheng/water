package com.water.biz;

import com.water.Vo.WaterTypeVo;
import com.water.entity.BrandType;
import com.water.entity.WaterType;
import com.water.mapper.BrandTypeMapper;
import com.water.mapper.WaterTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeDebug.map;

@Service
public class WaterTypeBiz<main> {
    @Autowired
    private WaterTypeMapper mapper;

//    public List<Map<String, Object>> getWaterType() {
//        List<WaterTypeVo> typeVoList = mapper.getWaterType();
////        LinkedHashMap<String,List<WaterTypeVo>> linkedHashMap = list.stream().collect(Collectors.groupingBy(WaterTypeVo::getType,LinkedHashMap::new,Collectors.toList()));
//        List<WaterType> typeList = mapper.getWaterTypeId();
//        List<Map<String, Object>> getWaterType = getWt(typeVoList, typeList);
//        return getWaterType;
//    }
//
//    public List<WaterType> getWaterTypeId() {
//        return mapper.getWaterTypeId();
//    }
//
//    public List<Map<String, Object>> getWt(List<WaterTypeVo> typeList, List<WaterType> typeListId) {
//        List<Map<String, Object>> list = new ArrayList<>();
//        for (WaterType w : typeListId) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("id", w.getId());
//            map.put("type", w.getType());
//            List<Map<String, Object>> children = new ArrayList<>();
//            for (WaterTypeVo o : typeList) {
//                if (o.getId() == w.getId()) {
//                    Map<String, Object> getChildren = getChildren(o);
//                    children.add(getChildren);
//                }
//            }
//            map.put("children", children);
//            list.add(map);
//        }
//        return list;
//    }
//
//    public Map<String, Object> getChildren(WaterTypeVo waterTypeVo) {
//        Map<String, Object> map = new HashMap<>();
//        List<WaterTypeVo> chilren = new ArrayList<>();
//        for (int i = 1; i < 3; i++) {
//            map.put("categoryId", i + "");
//            if (waterTypeVo.getCategoryId() == i) {
//                chilren.add(waterTypeVo);
//            }
//            map.put("children", chilren);
//        }
//        return map;
//    }


    @Autowired
    private BrandTypeMapper brandTypeMapper;

    public List<Map<String, Object>> getWaterType() {
        List<BrandType> brandTypeList = brandTypeMapper.getCategoryId();
        List<WaterTypeVo> waterTypeVoList = mapper.getWaterType();
        List<WaterType> waterTypeList = mapper.getWaterTypeId();
        List<Map<String, Object>> res = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        List<WaterTypeVo> children = new ArrayList<>();
        for (WaterType w : waterTypeList) {
            map = new HashMap<>();
            children = new ArrayList<>();
            map.put("id", w.getId());
            map.put("type", w.getType());
            for (WaterTypeVo o : waterTypeVoList) {
                if (o.getId() == w.getId()) {
                    children.add(o);
                }
            }
            map.put("children", getChildren(brandTypeList, children));
            res.add(map);
        }
        return res;
    }

    public List<Map<String, Object>> getChildren(List<BrandType> brandTypeList, List<WaterTypeVo> waterTypeVoList) {
        List<Map<String, Object>> res = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        List<WaterTypeVo> children = new ArrayList<>();

        for (BrandType b : brandTypeList) {
            map = new HashMap<>();
            children = new ArrayList<>();
            if (b.getCategoryid() == 1) {
                map.put("categoryId", b.getCategoryid());
                map.put("categoryName", "桶装水");
            } else {
                map.put("categoryId", b.getCategoryid());
                map.put("categoryName", "瓶装水");
            }
            for (WaterTypeVo o : waterTypeVoList) {
                if (o.getCategoryId() == b.getCategoryid()) {
                    children.add(o);
                }
            }
            map.put("children", children);
            res.add(map);
        }

        return res;
    }

    public List<Map<String,String>> getSearchResult(String value){
        return mapper.getSearchResult(value);
    }



}
