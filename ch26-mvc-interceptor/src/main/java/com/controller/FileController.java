package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
public class FileController {
    public static final String FILE_DIRECTORY = "E:\\data";
    @RequestMapping("/upload")
    public String upload(MultipartFile myfile, HttpServletRequest request){
        //得到上传过来的文件名
        String filename = myfile.getOriginalFilename();
        String path = FILE_DIRECTORY + File.separator + filename;
        File file = new File(path);
        try {
            myfile.transferTo(file);
            request.setAttribute("ok","ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index2";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> download(String filename) throws IOException{
        //separator值为：/
        String fullPath = FILE_DIRECTORY + File.separator + filename;
        File file = new File(fullPath);
        //这个guess方法是依据文件名来得到媒体类型也是mime类型
        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if (mediaType==null){
            //识别不了时，统统用这个，一般用来表示下载二进制数据
            mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        System.out.println("---mediaType="+mediaType);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType(mediaType));


        //attachment:附件的意思，表示告诉浏览器弹出一个另存为窗口来下载文件，
        //inline是直接在浏览器中打开下载的文件
        //需要进行URL编码处理，否则另存为对话框不能显示中文

        httpHeaders.setContentDispositionFormData("attachment",
                URLEncoder.encode(filename,"UTF-8"));
        InputStreamResource isr = new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(isr,httpHeaders, HttpStatus.OK);
    }
}
