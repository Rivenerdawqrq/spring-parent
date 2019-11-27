package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
public class FileController {
    public static final String FILE_DIRECTORY = "/start";
/**
 * 处理文件上传的方法,参数类型写上MultipartFile
 * 然后参数名是页面中文件上传控件的名字
 * @param myfile
 * @return
 */

    @PostMapping("/upload")
    public String upload(MultipartFile myfile, HttpServletResponse response){
        String directory = "/org";
        //得到上传过来的文件名
        String filename = myfile.getOriginalFilename();
        String path = directory + File.separator + filename;
        File file = new File(path);
        try {
            myfile.transferTo(file);
            response.getWriter().println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }
}
