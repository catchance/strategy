package org.chance.sample.strategy.show;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户奖品显示个性化处理器
 *
 * @author GengChao &lt; catchance@163.com &gt;
 * @date 2019-07-11 16:49:03
 */

@Slf4j
@Service("actPrizeShowOfDefaultProcessor")
public class ShowOfDefaultProcessor extends AbstractShowProcessor {

    @Override
    public Enum bindEnumKey() {
        // 默认实现，绑定null枚举就可以了
        return null;
    }

}
