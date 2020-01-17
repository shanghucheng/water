package com.water.mapper;

import com.water.entity.Tickets;

import org.apache.ibatis.annotations.Param;

public interface TicketsMapper {
   public String getUserTickets(@Param("id") String id);
}