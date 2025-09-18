package com.ruoyi.common.constant;

import lombok.experimental.UtilityClass;

import java.util.Locale;

import io.jsonwebtoken.Claims;

/**
 * 系统通用常量类
 * <p>
 * 定义了系统中使用的各种通用常量
 * 包括字符集、协议、状态标识、JWT相关、安全配置等常量
 * </p>
 *
 * @author more
 * @since 2024-01-01
 * @version 1.0
 */
@UtilityClass
public class Constants {

    // ==================== 字符集常量 ====================

    /**
     * UTF-8字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK字符集
     */
    public static final String GBK = "GBK";

    /**
     * 系统默认语言
     */
    public static final Locale DEFAULT_LOCALE = Locale.SIMPLIFIED_CHINESE;

    // ==================== 网络协议常量 ====================

    /**
     * WWW主域前缀
     */
    public static final String WWW = "www.";

    /**
     * HTTP协议前缀
     */
    public static final String HTTP = "http://";

    /**
     * HTTPS协议前缀
     */
    public static final String HTTPS = "https://";

    // ==================== 通用状态标识 ====================

    /**
     * 通用成功标识
     */
    public static final String SUCCESS = "0";

    /**
     * 通用失败标识
     */
    public static final String FAIL = "1";

    // ==================== 用户操作常量 ====================

    /**
     * 登录成功标识
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销操作标识
     */
    public static final String LOGOUT = "Logout";

    /**
     * 注册操作标识
     */
    public static final String REGISTER = "Register";

    /**
     * 登录失败标识
     */
    public static final String LOGIN_FAIL = "Error";

    // ==================== 权限相关常量 ====================

    /**
     * 所有权限标识
     */
    public static final String ALL_PERMISSION = "*:*:*";

    /**
     * 超级管理员角色标识
     */
    public static final String SUPER_ADMIN = "admin";

    /**
     * 角色权限分隔符
     */
    public static final String ROLE_DELIMETER = ",";

    /**
     * 权限标识分隔符
     */
    public static final String PERMISSION_DELIMETER = ",";

    // ==================== 验证码相关常量 ====================

    /**
     * 验证码有效期（分钟）
     */
    public static final Integer CAPTCHA_EXPIRATION = 2;

    // ==================== JWT令牌相关常量 ====================

    /**
     * 令牌键名
     */
    public static final String TOKEN = "token";

    /**
     * 令牌前缀
     */
    public static final String TOKEN_PREFIX = "Bearer ";

    /**
     * 登录用户键名
     */
    public static final String LOGIN_USER_KEY = "login_user_key";

    /**
     * JWT用户ID键名
     */
    public static final String JWT_USERID = "userid";

    /**
     * JWT用户名键名
     */
    public static final String JWT_USERNAME = Claims.SUBJECT;

    /**
     * JWT用户头像键名
     */
    public static final String JWT_AVATAR = "avatar";

    /**
     * JWT创建时间键名
     */
    public static final String JWT_CREATED = "created";

    /**
     * JWT用户权限键名
     */
    public static final String JWT_AUTHORITIES = "authorities";

    // ==================== 资源路径常量 ====================

    /**
     * 资源映射路径前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    // ==================== 远程调用协议常量 ====================

    /**
     * RMI远程方法调用协议前缀
     */
    public static final String LOOKUP_RMI = "rmi:";

    /**
     * LDAP远程方法调用协议前缀
     */
    public static final String LOOKUP_LDAP = "ldap:";

    /**
     * LDAPS远程方法调用协议前缀
     */
    public static final String LOOKUP_LDAPS = "ldaps:";

    // ==================== 安全配置常量 ====================

    /**
     * JSON对象白名单配置
     * <p>仅允许解析的包名，范围越小越安全</p>
     */
    public static final String[] JSON_WHITELIST_STR = {"com.ruoyi"};

    /**
     * 定时任务白名单配置
     * <p>仅允许访问的包名，如其他需要可以自行添加</p>
     */
    public static final String[] JOB_WHITELIST_STR = {"com.ruoyi.framework.task"};

    /**
     * 定时任务违规字符配置
     * <p>包含这些字符的定时任务将被拒绝执行</p>
     */
    public static final String[] JOB_ERROR_STR = {
            "java.net.URL", "javax.naming.InitialContext", "org.yaml.snakeyaml",
            "org.springframework", "org.apache", "com.ruoyi.common.utils.file",
            "com.ruoyi.framework.config", "com.ruoyi.project.tool"
    };
}
