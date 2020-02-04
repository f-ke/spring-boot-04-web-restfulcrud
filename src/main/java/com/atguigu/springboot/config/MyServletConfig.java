package com.atguigu.springboot.config;

import com.atguigu.springboot.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

@Configuration
public class MyServletConfig {

    //注册三大主件
    @Bean
    public ServletRegistrationBean MyServlet(){
        ServletRegistrationBean registrationbean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return registrationbean;
    }
    @Bean
    //设置tomcat
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryWebServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8083);

            }
        };
    }

}
