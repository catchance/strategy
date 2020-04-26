package org.chance.sample.strategy.show;

import org.chance.strategy.core.Strategyable;
import org.chance.strategy.core.annotation.StrategyAnnotation;

/**
 * ShowProcessor
 *
 * @author GengChao &lt; catchance@163.com &gt;
 * @date 2019/8/1
 */
@StrategyAnnotation(bizType = ShowProcessor.BIZ_TYPE)
public interface ShowProcessor extends Strategyable {

    String BIZ_TYPE = "ActPrizeShowProcessor";

    /**
     * @param content
     * @return
     */
    void process(String content);

}
