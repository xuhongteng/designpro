package com.test.mydesign.mapper;

import com.test.mydesign.pojo.Admin;

public interface AdminMapper {
    int insert(Admin record);

    int insertSelective(Admin record);
}