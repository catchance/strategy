package org.chance.strategy.autoconfigure;

import org.chance.strategy.core.factory.StrategyFactory;
import org.chance.strategy.core.util.ApplicationContextHolder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * StrategyAutoConfiguration
 *
 * @author GengChao &lt; catchance@163.com &gt;
 * @date 2019/7/30
 */

@Configuration
//@AutoConfigureBefore(JmsAutoConfiguration.class)
@ConditionalOnClass({ApplicationContext.class})
//@ConditionalOnMissingBean(ConnectionFactory.class)
@EnableConfigurationProperties(StrategyProperties.class)
@Import(ApplicationContextHolder.class)
public class StrategyAutoConfiguration {

    /**
     * 只有一个有参构造器的情况下，参数的值就会从容器中拿
     */
    public StrategyAutoConfiguration(StrategyProperties properties) {
        if (properties != null && !properties.isLazy()) {
            StrategyFactory.getInstance();
        }
    }

}
