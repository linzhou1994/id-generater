package com.id.generater.service;

import com.id.generater.model.Scene;

import java.util.List;
import java.util.Map;

/**
 * @author linzhou
 * @ClassName IdGeneraterService.java
 * @createTime 2021年12月07日 17:45:00
 * @Description
 */
public interface IdGenerateService {

    /**
     * 初始化场景
     *
     * @param sceneList
     * @return
     */
    Map<String, Long> initScenes(List<Scene> sceneList);

    /**
     * 通过场景获取id
     *
     * @param sceneId
     * @return
     */
    Long getId(Long sceneId);

}
