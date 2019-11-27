package com.contorller;

import com.entity.Dept;
import com.service.DeptService;
import com.uitl.ApplicationContextUtil;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
        ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext(req);
        DeptService deptService = applicationContext.getBean("deptService", DeptService.class);
        List<Dept> list =  deptService.getAll();
        req.setAttribute("list",list);
        req.getRequestDispatcher("aaa.jsp").forward(req,resp);
    }
}
