package org.cwsya.tlbook.config;

import org.cwsya.tlbook.handlerInterceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cws
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptor = registry.addInterceptor(new LoginHandlerInterceptor());
        interceptor.addPathPatterns("/admin/**/*");
        interceptor.excludePathPatterns("/admin/login",
                "/admin/isLogin");
    }
}