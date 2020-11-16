package com.water.mapper;

import com.water.entity.Rider;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RiderMapper extends Mapper<Rider> {
    public List<Rider> getRiderByTel(@Param("tel") String tel);
    public List<Rider> getRiderRank();
    public Rider getRiderByTelPassword(@Param("tel") String tel,@Param("passwrod") String passwrod);
    public int insertRider(Rider rider);
}