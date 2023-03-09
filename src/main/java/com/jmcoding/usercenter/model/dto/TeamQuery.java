package com.jmcoding.usercenter.model.dto;

import com.jmcoding.usercenter.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jiumu
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TeamQuery extends PageRequest {

    private static final long serialVersionUID = 4569714478885283993L;
    /**
     * id
     */
    private Long id;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;

    /**
     * 搜索关键字（同时对队伍名称和描述进行搜索）
     */
    private String searchText;
}