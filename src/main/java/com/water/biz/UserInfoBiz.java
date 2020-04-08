package com.water.biz;

import com.water.entity.UserInfo;
import com.water.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserInfoBiz {
    @Autowired
    private UserInfoMapper mapper;

    /**
     * 添加用户
     */
    public int insertUser(String nickName, String gender, String language, String province, String city, String country, String avatarUrl) {
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(nickName);
        userInfo.setGender(gender);
        userInfo.setLanguage(language);
        userInfo.setProvince(province);
        userInfo.setCity(city);
        userInfo.setCountry(country);
        userInfo.setAvatarUrl(avatarUrl);
        mapper.insertUser(userInfo);
        return userInfo.getId();
    }

}
