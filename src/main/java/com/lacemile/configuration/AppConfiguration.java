package com.lacemile.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yuume on 17/1/6.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lacemile")
public class AppConfiguration {
}
