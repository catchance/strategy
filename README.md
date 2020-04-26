# strategy简介
在spring boot项目中快速使用策略模式

# 主要功能
## v0.1.0 
spring boot项目中快速使用策略模式

# 使用说明
## 引入依赖
### gradle
`implementation 'org.chance:strategy-spring-boot-starter:0.1.0'`
### maven
```xml
        <dependency>
            <groupId>org.chance</groupId>
            <artifactId>strategy-spring-boot-starter</artifactId>
            <version>0.1.0</version>
        </dependency>
```

## 使用示例
### 定义接口
```java 
// ShowProcessor.java
@StrategyAnnotation(bizType = ShowProcessor.BIZ_TYPE)
public interface ShowProcessor extends Strategyable {

    String BIZ_TYPE = "ActPrizeShowProcessor";

    /**
     * @param content
     * @return
     */
    void process(String content);
}
``` 
### 定义枚举
```java
public enum ShowProcessorEnum {
    
    NEWCOMER(1, "新人"),
    OLD(2, "邀请");

    private final int code;
    private final String desc;

    ShowProcessorEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }   
    // ...
}
```

### 实现接口
#### 默认实现
```java
@Service("actPrizeShowOfDefaultProcessor")
public class ShowOfDefaultProcessor extends ShowProcessor {

    @Override
    public Enum bindEnumKey() {
        // 默认实现，绑定null枚举就可以了
        return null;
    }
    
    // 实现方法
    
}
```
#### 具体实现
```java
@Service("showOfNewcomerProcessor")
public class ShowOfNewcomerProcessor extends ShowProcessor {
    
    @Override
    public Enum bindEnumKey() {
        // 默认实现，绑定null枚举就可以了
        return ShowProcessorEnum.NEWCOMER;
    }
    
    // 实现方法
}
```

#### 业务中使用
```java
ShowProcessor showProcessor = StrategyFactory.getInstance().createStrategy(ShowProcessorEnum.OLD, ShowProcessor.BIZ_TYPE, true);
```

# 示例
- [strategy-spring-boot-sample](https://github.com/catchance/strategy/tree/master/samples/strategy-spring-boot-sample)

# License
Strategy is Open Source software released under the [Apache 2.0 license](https://www.apache.org/licenses/LICENSE-2.0.html).
