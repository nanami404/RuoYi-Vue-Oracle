package com.ruoyi.common.constant;

import lombok.experimental.UtilityClass;

/**
 * 代码生成通用常量类
 * 
 * 定义代码生成器相关的所有常量，包括模板类型、数据库字段类型、
 * 页面控件类型、Java数据类型、查询条件类型等
 *
 * @author more
 * @since 2024-01-01
 * @version 1.0
 */
@UtilityClass
public class GenConstants {

    // ======================== 模板类型 ========================

    /** 单表（增删改查） */
    public static final String TPL_CRUD = "crud";

    /** 树表（增删改查） */
    public static final String TPL_TREE = "tree";

    /** 主子表（增删改查） */
    public static final String TPL_SUB = "sub";

    // ======================== 树表字段 ========================

    /** 树编码字段 */
    public static final String TREE_CODE = "treeCode";

    /** 树父编码字段 */
    public static final String TREE_PARENT_CODE = "treeParentCode";

    /** 树名称字段 */
    public static final String TREE_NAME = "treeName";

    /** 上级菜单ID字段 */
    public static final String PARENT_MENU_ID = "parentMenuId";

    /** 上级菜单名称字段 */
    public static final String PARENT_MENU_NAME = "parentMenuName";

    // ======================== 数据库字段类型 ========================

    /** 数据库字符串类型 */
    public static final String[] COLUMNTYPE_STR = {"char", "varchar", "nvarchar", "varchar2"};

    /** 数据库文本类型 */
    public static final String[] COLUMNTYPE_TEXT = {"tinytext", "text", "mediumtext", "longtext"};

    /** 数据库时间类型 */
    public static final String[] COLUMNTYPE_TIME = {"datetime", "time", "date", "timestamp"};

    /** 数据库数字类型 */
    public static final String[] COLUMNTYPE_NUMBER = {"tinyint", "smallint", "mediumint", "int", "number", "integer",
            "bit", "bigint", "float", "double", "decimal"};

    // ======================== 页面字段配置 ========================

    /** 页面不需要编辑字段 */
    public static final String[] COLUMNNAME_NOT_EDIT = {"id", "create_by", "create_time", "del_flag"};

    /** 页面不需要显示的列表字段 */
    public static final String[] COLUMNNAME_NOT_LIST = {"id", "create_by", "create_time", "del_flag", "update_by",
            "update_time"};

    /** 页面不需要查询字段 */
    public static final String[] COLUMNNAME_NOT_QUERY = {"id", "create_by", "create_time", "del_flag", "update_by",
            "update_time", "remark"};

    // ======================== 实体基类字段 ========================

    /** Entity基类字段 */
    public static final String[] BASE_ENTITY = {"createBy", "createTime", "updateBy", "updateTime", "remark"};

    /** Tree基类字段 */
    public static final String[] TREE_ENTITY = {"parentName", "parentId", "orderNum", "ancestors", "children"};

    // ======================== HTML控件类型 ========================

    /** 文本框 */
    public static final String HTML_INPUT = "input";

    /** 文本域 */
    public static final String HTML_TEXTAREA = "textarea";

    /** 下拉框 */
    public static final String HTML_SELECT = "select";

    /** 单选框 */
    public static final String HTML_RADIO = "radio";

    /** 复选框 */
    public static final String HTML_CHECKBOX = "checkbox";

    /** 日期控件 */
    public static final String HTML_DATETIME = "datetime";

    /** 图片上传控件 */
    public static final String HTML_IMAGE_UPLOAD = "imageUpload";

    /** 文件上传控件 */
    public static final String HTML_FILE_UPLOAD = "fileUpload";

    /** 富文本控件 */
    public static final String HTML_EDITOR = "editor";

    // ======================== Java数据类型 ========================

    /** 字符串类型 */
    public static final String TYPE_STRING = "String";

    /** 整型 */
    public static final String TYPE_INTEGER = "Integer";

    /** 长整型 */
    public static final String TYPE_LONG = "Long";

    /** 浮点型 */
    public static final String TYPE_DOUBLE = "Double";

    /** 高精度计算类型 */
    public static final String TYPE_BIGDECIMAL = "BigDecimal";

    /** 时间类型 */
    public static final String TYPE_DATE = "Date";

    // ======================== 查询条件类型 ========================

    /** 模糊查询 */
    public static final String QUERY_LIKE = "LIKE";

    /** 相等查询 */
    public static final String QUERY_EQ = "EQ";

    // ======================== 通用标识 ========================

    /** 需要 */
    public static final String REQUIRE = "1";
}
