package edu.zipcloud.cloudstreetmarket.portal.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author 卡卡
 * Created by jing on 2017/8/1.
 */
public class CloudstreetWebAppWCI extends WebContentInterceptor {

    public CloudstreetWebAppWCI() {
        setRequireSession(false);
        setCacheSeconds(120);
        setSupportedMethods("GET", "POST", "OPTIONS", "HEAD");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException {
        super.preHandle(request, response, handler);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
