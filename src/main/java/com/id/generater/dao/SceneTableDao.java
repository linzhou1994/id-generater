package com.id.generater.dao;

import com.id.generater.model.SceneTable;

public interface SceneTableDao {
    int deleteByPrimaryKey(Long id);

    int insert(SceneTable record);

    int insertSelective(SceneTable record);

    SceneTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SceneTable record);

    int updateByPrimaryKey(SceneTable record);
}