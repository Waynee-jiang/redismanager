package com.tz.redismanager.bean.vo;

import com.tz.redismanager.annotation.ConnectionId;

public class RedisKeyUpdateVo {
    @ConnectionId
    private String id;
    private String key;
    private String oldKey;
    private Long expireTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public String getOldKey() {
        return oldKey;
    }

    public void setOldKey(String oldKey) {
        this.oldKey = oldKey;
    }
}