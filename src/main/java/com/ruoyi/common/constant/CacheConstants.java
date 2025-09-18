package com.ruoyi.common.constant;

import lombok.experimental.UtilityClass;

/**
 * 缓存的key常量类
 * 
 * 定义系统中所有缓存相关的key常量，包括用户登录、验证码、系统配置、
 * 字典管理、防重提交、限流控制等功能的缓存key
 *
 * @author more
 * @since 2024-01-01
 * @version 1.0
 */
@UtilityClass
public class CacheConstants {

    // ======================== 用户认证相关 ========================

    /**
     * 登录用户 redis key
     */
    public static final String LOGIN_TOKEN_KEY = "login_tokens:";

    /**
     * 验证码 redis key
     */
    public static final String CAPTCHA_CODE_KEY = "captcha_codes:";

    /**
     * 登录账户密码错误次数 redis key
     */
    public static final String PWD_ERR_CNT_KEY = "pwd_err_cnt:";

    // ======================== 系统配置相关 ========================

    /**
     * 参数管理 cache key
     */
    public static final String SYS_CONFIG_KEY = "sys_config:";

    /**
     * 字典管理 cache key
     */
    public static final String SYS_DICT_KEY = "sys_dict:";

    // ======================== 安全控制相关 ========================

    /**
     * 防重提交 redis key
     */
    public static final String REPEAT_SUBMIT_KEY = "repeat_submit:";

    /**
     * 限流 redis key
     */
    public static final String RATE_LIMIT_KEY = "rate_limit:";
}
