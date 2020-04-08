package com.water.mapper;

import com.water.entity.UserInfo;
import tk.mybatis.mapper.common.Mapper;

public interface UserInfoMapper extends Mapper<UserInfo> {
    public int insertUser(UserInfo userInfo);
}