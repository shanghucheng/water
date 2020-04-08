package com.water.biz;

import com.water.entity.Address;
import com.water.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBiz {
    @Autowired
    private AddressMapper mapper;

    public List<Address> getUserAddress(String id){
        return mapper.getUserAddress(id);
    }

    public void insertAddress(String userid,String username,String telnumber,String add,String address2){
        Address address = new Address();
        String[] list = add.split("-");
        address.setUserid(Integer.parseInt(userid));
        address.setUsername(username);
        address.setTelnumber(telnumber);
        address.setProvincename(list[0]);
        address.setCityname(list[1]);
        address.setCountyname(list[2]);
        address.setDetailinfo(address2);
        mapper.insertAddress(address);
    }
    public void deleteAddress(String id){
        mapper.deleteAddress(id);
    }
    public void updateAddress(String id,String username,String telnumber,String add,String address2){
        Address address = new Address();
        String[] list = add.split("-");
        address.setId(Integer.parseInt(id));
        address.setUsername(username);
        address.setTelnumber(telnumber);
        address.setProvincename(list[0]);
        address.setCityname(list[1]);
        address.setCountyname(list[2]);
        address.setDetailinfo(address2);
        mapper.updateAddress(address);
    }
}
