package com.jesefe.asdasdas.Konfig;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;

@Configuration
public class Konfig  implements ServletContextAware {
    @Bean
    public ServletRegistrationBean facesServletRegistration() {
        ServletRegistrationBean registration =
                new ServletRegistrationBean(new FacesServlet(), "*.xhtml");
        registration.setLoadOnStartup(1);
        return registration;
    }



    @Override
    public void setServletContext(ServletContext servletContext) {
        servletContext.setInitParameter(
                "com.sun.faces.forceLoadConfiguration",
                Boolean.TRUE.toString());
    }
}
