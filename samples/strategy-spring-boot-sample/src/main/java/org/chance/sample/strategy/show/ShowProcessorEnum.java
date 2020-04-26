package org.chance.sample.strategy.show;

/**
 *
 * @author GengChao &lt; catchance@163.com &gt;
 * @date 2019-03-27
 *
 */
public enum ShowProcessorEnum {

    /**
     *
     */
    NEWCOMER(1, "新人"),
    OLD(2, "邀请");

    private final int code;
    private final String desc;

    ShowProcessorEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ShowProcessorEnum get(int code) {
        for (ShowProcessorEnum resultEnum : ShowProcessorEnum.values()) {
            if (resultEnum.code == (code)) {
                return resultEnum;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
