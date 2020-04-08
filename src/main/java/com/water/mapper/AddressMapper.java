package com.water.mapper;

import com.water.entity.Address;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AddressMapper extends Mapper<Address> {
    public List<Address> getUserAddress(@Param("id") String id);
    public void insertAddress(Address address);
    public void deleteAddress(@Param("id") String id);
    public void updateAddress(Address address);
}