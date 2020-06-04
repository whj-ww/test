package com.ht.intetceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2019/11/29.
 */
public class MoudelInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //获取用户点击的连接
        String path = httpServletRequest.getServletPath();
        System.out.println("path=   "+path);
        //获取用户拥有的权限
        List<String> moudellist = (List)httpServletRequest.getSession().getAttribute("moudellist");
        System.out.println("是否有权限："+moudellist.contains(path));
        if(moudellist.contains(path)){
            return true;
        }
        httpServletResponse.sendRedirect("/error.jsp");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
