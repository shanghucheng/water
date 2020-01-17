package com.water.Biz;

import com.water.mapper.NavMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavBiz {

    @Autowired
    NavMapper mapper;

    public List<String> getImageUrl(){
        return mapper.getImageUrl();
    }
}
