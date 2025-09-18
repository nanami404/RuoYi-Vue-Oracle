package com.ruoyi.framework.web.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * 实体基类
 * 提供通用的实体字段和功能，包括创建时间、更新时间、备注等基础字段
 * 所有业务实体类都应继承此基类以获得统一的基础功能
 *
 * @author more
 * @since 2025-01-19
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    // ========== 查询相关字段 ==========

    /**
     * 搜索值
     * 用于前端传递搜索关键字，不参与JSON序列化
     */
    @JsonIgnore
    private String searchValue;

    // ========== 审计字段 ==========

    /**
     * 创建者
     * 记录数据创建人的用户名或用户ID
     */
    private String createBy;

    /**
     * 创建时间
     * 记录数据的创建时间，格式为 yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新者
     * 记录数据最后更新人的用户名或用户ID
     */
    private String updateBy;

    /**
     * 更新时间
     * 记录数据的最后更新时间，格式为 yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    // ========== 扩展字段 ==========

    /**
     * 备注
     * 用于存储额外的说明信息
     */
    private String remark;

    /**
     * 请求参数
     * 用于存储前端传递的额外参数，只有非空时才参与JSON序列化
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Object> params;

    // ========== 自定义方法 ==========

    /**
     * 获取请求参数Map
     * 如果params为null，则初始化为空的HashMap
     *
     * @return 请求参数Map，永不为null
     */
    public Map<String, Object> getParams() {
        if (params == null) {
            params = new HashMap<>();
        }
        return params;
    }
}
