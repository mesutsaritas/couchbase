
package com.example.web.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author msaritas
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

     @Override
     public void addInterceptors(InterceptorRegistry registry) {
          registry.addInterceptor(new TenantInterceptor());
     }
}
