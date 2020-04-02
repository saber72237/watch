package com.yygq.watch.config;


import com.yygq.watch.component.LoginHanderInterceptor;
import com.yygq.watch.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        registry.addViewController("/yygq").setViewName("success");
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurerAdapter(){
        WebMvcConfigurer adapter = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login/login");
                registry.addViewController("/login").setViewName("login/login");
                registry.addViewController("/index.html").setViewName("login/login");
                registry.addViewController("/main.html").setViewName("data/heart");
                registry.addViewController("/oxygen").setViewName("data/oxygen");
                registry.addViewController("/temperature").setViewName("data/temperature");
                registry.addViewController("/map").setViewName("data/map");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHanderInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/user/login","/**/*.css",
                                "/**/*.js", "/**/*.png", "/**/*.jpg",
                                "/**/*.jpeg","/**/*.gif", "/**/fonts/*");
            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
