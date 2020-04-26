package org.chance.strategy.core;

/**
 * 可实现策略的接口
 *
 * @author GengChao &lt; catchance@163.com &gt;
 * @date 2018/6/8
 */
public interface Strategyable {

    /**
     * 该策略类绑定的枚举 Key，用于作为唯一标识
     *
     * @return
     */
    Enum bindEnumKey();

}
