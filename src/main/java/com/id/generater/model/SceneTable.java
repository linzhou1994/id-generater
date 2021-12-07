package com.id.generater.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tb_scene_table
 * @author 
 */
@Data
public class SceneTable implements Serializable {
    private Long id;

    /**
     * 产景id
     */
    private String sceneId;

    /**
     * 占用有效期截止
     */
    private Date finishTime;

    private static final long serialVersionUID = 1L;
}