package com.id.generater.dao;

import com.id.generater.model.Scene;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SceneDao {
    int deleteByPrimaryKey(Long id);

    int insert(Scene record);

    int insertSelective(Scene record);

    Scene selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKey(Scene record);

    List<Scene> findBySceneKeys(@Param("list") List<String> sceneKeys);
}