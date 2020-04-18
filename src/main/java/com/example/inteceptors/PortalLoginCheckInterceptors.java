package com.example.inteceptors;

import com.example.common.Const;
import com.example.common.ResponseCode;
import com.example.entity.User;
import com.example.utils.ServerResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@Component
public class PortalLoginCheckInterceptors implements HandlerInterceptor {




    /**在请求到达controller之前
     @return ture :不拦截请求  false：拦截请求
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.print("=========preHandle======");

        HttpSession session=request.getSession();
        User user=(User)session.getAttribute(Const.CURRENT_USER);
        if(user!=null)
        {
            //已经登陆


            return true;
        }
        try {

            response.reset();
            response.addHeader("Content-Type","application/json;charset=utf-8");
            PrintWriter printWriter = response.getWriter();
            ServerResponse serverResponse = ServerResponse.createSRByFail(ResponseCode.NO_LOGIN.getCode(),ResponseCode.NO_LOGIN.getMsg());
            ObjectMapper objectMapper=new ObjectMapper();
            String info=objectMapper.writeValueAsString(serverResponse);
            printWriter.write(info);
            printWriter.flush();
            printWriter.close();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return false;
    }


    ///在请求处理完成后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.print("=========postHandle======");

    }


    ///客户端接收到相应之后
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.print("=========afterCompletion======");

    }
}
