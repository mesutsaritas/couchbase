/**
 * 
 */
package com.example.web.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.util.TenantContext;

/**
 * @author msaritas
 *
 */
public class TenantInterceptor extends HandlerInterceptorAdapter {
     @Override
     public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

          TenantContext.setCurrentTenant("netmetriks");

          return true;
     }
}