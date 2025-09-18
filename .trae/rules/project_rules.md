# 项目开发规范

## 开发环境配置
- **操作系统**：Windows 10
- **JDK版本**：1.8
- **构建工具**：Maven 3.6+
- **数据库**：达梦数据库 DM8
- **数据库框架**：mybatis-plus

## 代码规范

### Java代码风格
- **行长度限制**：120字符
- **命名规范**：
  - 类名：大驼峰命名（PascalCase）
  - 方法名/变量名：小驼峰命名（camelCase）
  - 常量：全大写下划线分隔（CONSTANT_CASE）
  - 包名：全小写，点分隔

### Lombok使用约定
- **优先使用注解**：
  ```java
  @Data           // 优先使用，生成getter/setter/toString/equals/hashCode
  @Builder        // 构建复杂对象时使用
  @Slf4j          // 日志对象生成
  @NoArgsConstructor // 无参构造函数生成
  @AllArgsConstructor // 全参构造函数生成
  ```
- **避免使用**：`@ToString`单独使用（@Data已包含）
- **实体类标准模板**：
  ```java
  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  @TableName("table_name")
  public class EntityName {
      // 字段定义
  }
  ```

### 类头注释规范
**所有新创建的类必须包含以下注释：**
```java
/**
 * 类功能描述
 *
 * @author more
 * @since 创建日期(yyyy-MM-dd)
 * @version 1.0
 */
```

### 方法注释规范
```java
/**
 * 方法功能描述
 *
 * @param paramName 参数说明
 * @return 返回值说明
 * @throws ExceptionType 异常说明
 */
```
## 性能优化

### 数据库优化
- **索引使用**：为常用查询字段添加索引
- **分页查询**：大数据量查询必须分页
- **批量操作**：使用批量插入/更新替代循环操作

### 缓存策略
- **Redis缓存**：AccessToken、用户信息、权限数据
- **本地缓存**：配置信息、字典数据
- **缓存过期**：设置合理的过期时间

### 并发控制
- **分布式锁**：使用Redis实现关键业务锁
- **线程安全**：确保共享资源的线程安全性
- **异步处理**：耗时操作使用异步执行

---

**重要提醒**：
1. 所有代码提交前必须通过单元测试
2. 新增功能必须添加对应的权限配置
3. 数据库变更必须提供回滚脚本
4. 只有在用户说要生成代码或者修复的情况下才改动相关代码，并严格遵循阿里巴巴 Java 开发规范进行编码