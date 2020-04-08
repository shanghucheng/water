package com.water.mapper;

import com.water.entity.ImgUrls;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ImgUrlsMapper extends Mapper<ImgUrls> {
    public List<ImgUrls> getImagesByWaterId(@Param("id") String id);
    public List<ImgUrls> getGoodDetailImg(@Param("id") String id);
    public List<ImgUrls> getNav();
}