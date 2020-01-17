package com.water.Biz;

import com.water.entity.Address;
import com.water.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AddressBiz {

    @Autowired
    private AddressMapper mapper;

    public List<Address> getOrderAddress(String id){
        return mapper.getOrderAddress(id,"1");
    }
    public List<Address> getAllAddress(String id){ return mapper.getAllAddress(id);
    }

}
