package com.water.Biz;

import com.water.mapper.CommentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommentsBiz {

    @Autowired
    private CommentsMapper mapper;

    public List<Map<String,String>> getWaterComment(String id,String sign){
        return mapper.getWaterComment(id,sign);
    }

}
