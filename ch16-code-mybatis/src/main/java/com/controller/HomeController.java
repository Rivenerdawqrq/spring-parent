package com.controller;

import com.entity.UserInfo;
import com.github.pagehelper.PageInfo;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/page")
public class HomeController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        UserService service = context.getBean(UserService.class);
        int pageNum = ServletRequestUtils.getIntParameter(req,"pageNum",1);
        int pageSize = ServletRequestUtils.getIntParameter(req,"pageSize",2);
        List<UserInfo> all = service.getAll(pageNum, pageSize);
        PageInfo<UserInfo> userInfoPageInfo = new PageInfo<UserInfo>(all, 2);

        req.setAttribute("pageInfo",userInfoPageInfo);
        req.getRequestDispatcher("page.jsp").forward(req,resp);
    }
}
