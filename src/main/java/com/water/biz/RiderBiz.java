package com.water.biz;

import com.water.entity.Rider;
import com.water.mapper.RiderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RiderBiz {
    @Autowired
    private RiderMapper mapper;

    public String getRiderByTel(String tel) {
        List<Rider> getRiderByTel = mapper.getRiderByTel(tel);
        if (getRiderByTel.isEmpty()) {
            return "1";
        } else {
            return "2";
        }
    }

    public int insertRider(String name, String passwrod, String tel) {
        Rider rider = new Rider();
        rider.setName(name);
        rider.setPasswrod(passwrod);
        rider.setTel(tel);
        mapper.insertRider(rider);
        return rider.getId();
    }

    public Rider getRiderByTelPassword(String tel, String passwrod) {
        return mapper.getRiderByTelPassword(tel, passwrod);
    }

    public List<Rider> getRiderRank(){
        return mapper.getRiderRank();
    }

}
