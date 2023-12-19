package com.lyapi.easyweb.config;

import com.lyapi.easyweb.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Liu
 */
@Configuration
@Import({GlobalExceptionHandler.class, Knife4jConfig.class,})
public class MyAutoConfiguration {
}