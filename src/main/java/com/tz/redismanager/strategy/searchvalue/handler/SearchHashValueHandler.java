package com.tz.redismanager.strategy.searchvalue.handler;

import com.tz.redismanager.annotation.HandlerType;
import com.tz.redismanager.bean.vo.RedisValueQueryVo;
import com.tz.redismanager.enm.HandlerTypeEnum;
import com.tz.redismanager.strategy.searchvalue.AbstractSearchValueHandler;
import com.tz.redismanager.util.RedisContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author Administrator
 * @version 1.0
 * @time 2019-06-23 21:33
 **/
@Service
@HandlerType({HandlerTypeEnum.HASH})
public class SearchHashValueHandler extends AbstractSearchValueHandler {
    private static final Logger logger = LoggerFactory.getLogger(SearchHashValueHandler.class);

    @Override
    public Object handle(RedisValueQueryVo vo) {
        RedisTemplate<String, Object> redisTemplate = RedisContextUtils.getRedisTemplate();
        Object value = null;
        try {
            value = redisTemplate.opsForHash().entries(vo.getSearchKey());
            if (null == value) {
                //重新设置keySerializer
                this.reSetKeySerializer(redisTemplate);
                value = redisTemplate.opsForHash().entries(vo.getSearchKey());
            }
        } catch (Exception e) {
            logger.error("[RedisAdmin] [searchKeyValue] {id:{}查询出错,message:{}}", vo.getId(), e.getMessage());
            logger.info("[RedisAdmin] [searchKeyValue] {从{}切换到StringRedisSerializer处理}", redisTemplate.getValueSerializer().getClass().getSimpleName());
            logger.info("[RedisAdmin] [searchKeyValue] {从{}切换到StringRedisSerializer处理}", redisTemplate.getHashValueSerializer().getClass().getSimpleName());
            redisTemplate.setValueSerializer(redisTemplate.getStringSerializer());
            redisTemplate.setHashValueSerializer(redisTemplate.getStringSerializer());
            value = redisTemplate.opsForHash().entries(vo.getSearchKey());
        }
        return value;
    }
}
