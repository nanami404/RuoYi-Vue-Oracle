package com.ruoyi.framework.web.domain;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Objects;

import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.utils.StringUtils;

/**
 * Ajax响应结果封装类
 * <p>
 * 用于统一封装Controller层的响应结果，继承HashMap实现动态数据存储
 * 提供成功、警告、错误等多种响应状态的静态工厂方法
 * </p>
 *
 * @author more
 * @since 2024-01-01
 * @version 1.0
 */
@Slf4j
@NoArgsConstructor
public class AjaxResult extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    // ==================== 常量定义 ====================

    /** 状态码键名 */
    public static final String CODE_TAG = "code";

    /** 返回消息键名 */
    public static final String MSG_TAG = "msg";

    /** 数据对象键名 */
    public static final String DATA_TAG = "data";

    // ==================== 构造方法 ====================

    /**
     * 构造AjaxResult对象
     *
     * @param code 状态码
     * @param msg  返回消息
     */
    public AjaxResult(int code, String msg) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 构造AjaxResult对象
     *
     * @param code 状态码
     * @param msg  返回消息
     * @param data 数据对象
     */
    public AjaxResult(int code, String msg, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (StringUtils.isNotNull(data)) {
            super.put(DATA_TAG, data);
        }
    }

    // ==================== 成功响应方法 ====================

    /**
     * 返回成功消息
     *
     * @return 成功响应结果
     */
    public static AjaxResult success() {
        return AjaxResult.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @param data 数据对象
     * @return 成功响应结果
     */
    public static AjaxResult success(Object data) {
        return AjaxResult.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回消息
     * @return 成功响应结果
     */
    public static AjaxResult success(String msg) {
        return AjaxResult.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回消息
     * @param data 数据对象
     * @return 成功响应结果
     */
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(HttpStatus.SUCCESS, msg, data);
    }

    // ==================== 警告响应方法 ====================

    /**
     * 返回警告消息
     *
     * @param msg 返回消息
     * @return 警告响应结果
     */
    public static AjaxResult warn(String msg) {
        return AjaxResult.warn(msg, null);
    }

    /**
     * 返回警告消息
     *
     * @param msg  返回消息
     * @param data 数据对象
     * @return 警告响应结果
     */
    public static AjaxResult warn(String msg, Object data) {
        return new AjaxResult(HttpStatus.WARN, msg, data);
    }

    // ==================== 错误响应方法 ====================

    /**
     * 返回错误消息
     *
     * @return 错误响应结果
     */
    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回消息
     * @return 错误响应结果
     */
    public static AjaxResult error(String msg) {
        return AjaxResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回消息
     * @param data 数据对象
     * @return 错误响应结果
     */
    public static AjaxResult error(String msg, Object data) {
        return new AjaxResult(HttpStatus.ERROR, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回消息
     * @return 错误响应结果
     */
    public static AjaxResult error(int code, String msg) {
        return new AjaxResult(code, msg, null);
    }

    // ==================== 状态判断方法 ====================

    /**
     * 判断是否为成功响应
     *
     * @return true-成功响应，false-非成功响应
     */
    public boolean isSuccess() {
        return Objects.equals(HttpStatus.SUCCESS, this.get(CODE_TAG));
    }

    /**
     * 判断是否为警告响应
     *
     * @return true-警告响应，false-非警告响应
     */
    public boolean isWarn() {
        return Objects.equals(HttpStatus.WARN, this.get(CODE_TAG));
    }

    /**
     * 判断是否为错误响应
     *
     * @return true-错误响应，false-非错误响应
     */
    public boolean isError() {
        return Objects.equals(HttpStatus.ERROR, this.get(CODE_TAG));
    }

    // ==================== 链式调用方法 ====================

    /**
     * 添加键值对，支持链式调用
     *
     * @param key   键名
     * @param value 键值
     * @return 当前AjaxResult对象，支持链式调用
     */
    @Override
    public AjaxResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
