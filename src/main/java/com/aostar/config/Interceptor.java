package com.aostar.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 拦截器
 * @Author jzhao
 * @Date 2020-6-4 8:32
 **/
public class Interceptor implements HandlerInterceptor {
    /**
      * @Description: 处理前
      * @params: [request, response, handler]
      * @return: boolean 为‘true’，放行
      * @author: 2020-6-4 8:37 jzhao
      * @reviser and other massage:
      */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("Interceptor ----->  Interceptor ");
        return true;
    }

    /**
      * @Description: 处理后，一般用于日志
      * @params: [request, response, handler, modelAndView]
      * @return: void
      * @author: 2020-6-4 8:37 jzhao
      * @reviser and other massage: 
      */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
      * @Description: 清理
      * @params: [request, response, handler, ex]
      * @return: void
      * @author: 2020-6-4 8:37 jzhao
      * @reviser and other massage:
      */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
