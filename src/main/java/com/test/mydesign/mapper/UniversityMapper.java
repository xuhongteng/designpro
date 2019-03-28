package com.test.mydesign.mapper;

import com.test.mydesign.pojo.University;

public interface UniversityMapper {
    int insert(University record);

    int insertSelective(University record);
}