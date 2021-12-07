package com.id.generater.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tb_scene
 * @author 
 */
@Data
public class Scene implements Serializable {
    private Long id;

    /**
     * 发号场景
     */
    private String sceneKey;

    /**
     * 发号场景
     */
    private String appId;

    /**
     * 每次发号量
     */
    private Long generatorStep;

    /**
     * 重置类型
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    private static final long serialVersionUID = 1L;
}