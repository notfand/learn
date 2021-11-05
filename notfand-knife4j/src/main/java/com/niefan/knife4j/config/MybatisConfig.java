package com.niefan.knife4j.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置
 * @author Niefan
 * @date 2021/11/5
 */
@MapperScan("com.niefan.knife4j.mapper")
@Configuration
public class MybatisConfig {
}
