package com.controller;

import com.entity.Dept;
import com.github.pagehelper.PageInfo;
import com.service.impl.DeptServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/aaa")
public class ListDeptServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        DeptServiceImpl deptService = context.getBean("deptService", DeptServiceImpl.class);
        int pageNum = Integer.parseInt(req.getParameter("pageNum"));
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));
        List<Dept> depts = deptService.getAll(pageNum,pageSize);
        PageInfo<Dept> pageInfo = new PageInfo<Dept>(depts,2);
        req.setAttribute("pageInfo",pageInfo);
        req.getRequestDispatcher("/aaa.jsp").forward(req,resp);


    }
}
