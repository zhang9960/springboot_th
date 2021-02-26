package com.z.springboot_thymeleaf.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置重定向，将http重定向到https
 * @author zhang
 * @version 1.0
 * @date 2021/2/3 10:36
 */
@Configuration
public class TomcatConfig {

//    @Bean
//    TomcatServletWebServerFactory tomcatServletWebServerFactory(){
//        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory(){
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint constraint = new SecurityConstraint();
//                constraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection securityCollection = new SecurityCollection();
//                securityCollection.addPattern("/*");
//                constraint.addCollection(securityCollection);
//                context.addConstraint(constraint);
//            }
//        };
//        factory.addAdditionalTomcatConnectors(createTomcatConnector());
//        return factory;
//    }

//    private Connector createTomcatConnector(){
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8080);
//        connector.setSecure(false);
//        connector.setRedirectPort(8081);
//        return connector;
//    }
}
