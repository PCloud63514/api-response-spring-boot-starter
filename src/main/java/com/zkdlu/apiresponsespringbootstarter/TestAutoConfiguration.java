package com.zkdlu.apiresponsespringbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TestProperties.class)
@EnableConfigurationProperties(TestProperties.class)
public class TestAutoConfiguration {
    @Autowired
    public TestProperties testProperties;

    public TestAutoConfiguration() {
        System.out.println(testProperties.toString());
    }
}
