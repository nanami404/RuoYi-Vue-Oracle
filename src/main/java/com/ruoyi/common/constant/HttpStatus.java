package com.ruoyi.common.constant;

import lombok.experimental.UtilityClass;

/**
 * HTTP状态码常量类
 * <p>
 * 定义了系统中使用的各种HTTP状态码常量
 * 包括成功、重定向、客户端错误、服务器错误等状态码
 * </p>
 *
 * @author more
 * @since 2024-01-01
 * @version 1.0
 */
@UtilityClass
public class HttpStatus {

    // ==================== 成功状态码 2xx ====================

    /**
     * 操作成功
     */
    public static final int SUCCESS = 200;

    /**
     * 对象创建成功
     */
    public static final int CREATED = 201;

    /**
     * 请求已经被接受
     */
    public static final int ACCEPTED = 202;

    /**
     * 操作已经执行成功，但是没有返回数据
     */
    public static final int NO_CONTENT = 204;

    // ==================== 重定向状态码 3xx ====================

    /**
     * 资源已被移除
     */
    public static final int MOVED_PERM = 301;

    /**
     * 重定向
     */
    public static final int SEE_OTHER = 303;

    /**
     * 资源没有被修改
     */
    public static final int NOT_MODIFIED = 304;

    // ==================== 客户端错误状态码 4xx ====================

    /**
     * 参数列表错误（缺少，格式不匹配）
     */
    public static final int BAD_REQUEST = 400;

    /**
     * 未授权
     */
    public static final int UNAUTHORIZED = 401;

    /**
     * 访问受限，授权过期
     */
    public static final int FORBIDDEN = 403;

    /**
     * 资源，服务未找到
     */
    public static final int NOT_FOUND = 404;

    /**
     * 不允许的HTTP方法
     */
    public static final int BAD_METHOD = 405;

    /**
     * 资源冲突，或者资源被锁
     */
    public static final int CONFLICT = 409;

    /**
     * 不支持的数据，媒体类型
     */
    public static final int UNSUPPORTED_TYPE = 415;

    // ==================== 服务器错误状态码 5xx ====================

    /**
     * 系统内部错误
     */
    public static final int ERROR = 500;

    /**
     * 接口未实现
     */
    public static final int NOT_IMPLEMENTED = 501;

    // ==================== 自定义状态码 6xx ====================

    /**
     * 系统警告消息
     */
    public static final int WARN = 601;
}
