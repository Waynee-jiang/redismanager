package com.tz.redismanager.enm;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>处理器类型</p>
 *
 * @author Administrator
 * @version 1.0
 * @time 2019-06-23 21:47
 **/
public enum HandlerTypeEnum {
    STRING("string"), LIST("list"), HASH("hash"), SET("set"), ZSET("zset");

    private String type;

    HandlerTypeEnum(String type) {
        this.type = type;
    }

    public static HandlerTypeEnum getEnumByType(String type) {
        if (StringUtils.isBlank(type)) {
            return null;
        }
        for (HandlerTypeEnum enm : HandlerTypeEnum.values()) {
            if (null != enm && enm.type.equals(type.trim())) {
                return enm;
            }
        }
        return null;
    }
}
