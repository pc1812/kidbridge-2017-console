package net.$51zhiyuan.development.kidbridge.service;

import net.$51zhiyuan.development.kidbridge.module.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 会话管理
 */
@Service
public class TokenService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public void delSession(Integer userId){
        String mapperKey = String.format("%s:%s",Configuration.SYSTEM_SESSION_MAPPING_NAMESPACE,userId);
        String sessionId = (String) this.redisTemplate.opsForValue().get(mapperKey);
        String sessionKey = String.format("%s:%s", Configuration.SYSTEM_SESSION_NAMESPACE,sessionId);
        this.redisTemplate.delete(mapperKey);
        this.redisTemplate.delete(sessionKey);
    }
}
