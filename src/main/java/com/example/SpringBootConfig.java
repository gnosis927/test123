package com.example;


import com.example.inteceptors.PortalLoginCheckInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@SpringBootConfiguration
public class SpringBootConfig implements WebMvcConfigurer {

    @Autowired
    PortalLoginCheckInterceptors portalLoginCheckInterceptors;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        List<String> exclueUrl=new ArrayList<>();


        /**哪些不进行拦截*/
        exclueUrl.add("/user/regist");
        exclueUrl.add("/user/modify");



        /**哪些进行拦截*/
        registry.addInterceptor(portalLoginCheckInterceptors).addPathPatterns("/user/**").excludePathPatterns(exclueUrl);
    }
}

