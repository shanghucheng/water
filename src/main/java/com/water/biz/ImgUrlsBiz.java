package com.water.biz;

import com.water.entity.ImgUrls;
import com.water.mapper.ImgUrlsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgUrlsBiz {
    @Autowired
    private ImgUrlsMapper mapper;

    public List<ImgUrls> getNav(){
        return mapper.getNav();
    }

    public List<ImgUrls> getImagesByWaterId(String id){
        return mapper.getImagesByWaterId(id);
    }
    public List<ImgUrls> getGoodDetailImg(String id){
        return mapper.getGoodDetailImg(id);
    }


}
