package com.water.mapper;

import com.water.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AddressMapper {
   public List<Address> getOrderAddress(@Param("id") String id,@Param("isDefault") String isDefault);
   public List<Address> getAllAddress(@Param("id") String id);
}