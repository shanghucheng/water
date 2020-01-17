package com.water.Biz;

import com.water.mapper.TicketsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TicketsBiz {

    @Autowired
    private TicketsMapper mapper;

    public String getUserTickets(String id){
        return mapper.getUserTickets(id);
    }

}
