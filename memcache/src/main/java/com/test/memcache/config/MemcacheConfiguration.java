package com.test.memcache.config;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemcacheConfiguration {
    // 设置服务信息
    @Value("${memcache.servers}")
    private String[] servers;
    @Value("${memcache.failover}")
    private boolean failover;
    @Value("${memcache.initConn}")
    // 最小连接数
    private int initConn;
    @Value("${memcache.minConn}")
    // 最大连接数
    private int minConn;
    @Value("${memcache.maxConn}")
    private int maxConn;
    // 设置连接池守护线程的睡眠时间
    @Value("${memcache.maintSleep}")
    private int maintSleep;
    // 设置TCP的参数，连接超时等
    @Value("${memcache.nagel}")
    private boolean nagel;
    @Value("${memcache.socketTO}")
    private int socketTO;
    @Value("${memcache.aliveCheck}")
    private boolean aliveCheck;

    @Bean
    public SockIOPool sockIOPool () {
        SockIOPool pool = SockIOPool.getInstance();
        pool.setServers(servers);
        pool.setFailover(failover);
        pool.setInitConn(initConn);
        pool.setMinConn(minConn);
        pool.setMaxConn(maxConn);
        pool.setMaintSleep(maintSleep);
        pool.setNagle(nagel);
        pool.setSocketTO(socketTO);
        pool.setAliveCheck(aliveCheck);
        pool.initialize();
        return pool;
    }

    @Bean
    public MemCachedClient memCachedClient(){
        return new MemCachedClient();
    }

}
