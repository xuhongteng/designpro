package com.test.mydesign.mapper;

import com.test.mydesign.pojo.Region;

public interface RegionMapper {
    int insert(Region record);

    int insertSelective(Region record);
}