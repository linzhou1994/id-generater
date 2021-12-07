package com.id.generater.service.impl;

import com.id.generater.dao.SceneDao;
import com.id.generater.model.Scene;
import com.id.generater.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author linzhou
 * @ClassName IdGeneraterServiceImpl.java
 * @createTime 2021年12月07日 17:46:00
 * @Description
 */
public class IdGenerateServiceImpl implements IdGenerateService {

    @Autowired
    private SceneDao sceneDao;

    @Override
    public Map<String, Long> initScenes(List<Scene> sceneList) {
        if (Objects.isNull(sceneList) || sceneList.isEmpty()) {
            return new HashMap<>();
        }
        List<String> sceneKeys = sceneList.stream().map(Scene::getSceneKey).distinct().collect(Collectors.toList());

        List<Scene> scenes = sceneDao.findBySceneKeys(sceneKeys);

        Map<String, Scene> key2Scene = scenes.stream().collect(Collectors.toMap(Scene::getSceneKey, o -> o));

        for (Scene scene : sceneList) {

        }


        return null;
    }

    @Override
    public Long getId(Long sceneId) {
        return null;
    }

    void equalsScene(Scene s1,Scene s2){

    }
}
