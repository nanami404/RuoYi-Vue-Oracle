package com.ruoyi.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.UtilityClass;

/**
 * 任务调度通用常量类
 * 
 * 定义任务调度相关的所有常量，包括任务属性、触发策略、
 * 任务状态等配置信息
 *
 * @author more
 * @since 2024-01-01
 * @version 1.0
 */
@UtilityClass
public class ScheduleConstants {

    // ======================== 任务属性 ========================

    /** 任务类名 */
    public static final String TASK_CLASS_NAME = "TASK_CLASS_NAME";

    /** 执行目标key */
    public static final String TASK_PROPERTIES = "TASK_PROPERTIES";

    // ======================== 触发策略 ========================

    /** 默认 */
    public static final String MISFIRE_DEFAULT = "0";

    /** 立即触发执行 */
    public static final String MISFIRE_IGNORE_MISFIRES = "1";

    /** 触发一次执行 */
    public static final String MISFIRE_FIRE_AND_PROCEED = "2";

    /** 不触发立即执行 */
    public static final String MISFIRE_DO_NOTHING = "3";

    // ======================== 任务状态枚举 ========================

    /**
     * 任务状态枚举
     */
    @Getter
    @AllArgsConstructor
    public enum Status {
        /**
         * 正常
         */
        NORMAL("0"),
        /**
         * 暂停
         */
        PAUSE("1");

        private final String value;
    }
}
