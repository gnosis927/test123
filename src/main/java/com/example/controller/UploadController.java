package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller

public class UploadController {

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("userpic") MultipartFile file) {

        if (file != null && file.getOriginalFilename() != null) {
            //获取文件扩展名
            String originalFilename = file.getOriginalFilename();

            //获取扩展名
            String extend = originalFilename.substring(originalFilename.lastIndexOf("."));

            //重新生成唯一的文件名
            String newName = UUID.randomUUID().toString();
//            File file1 = new File("D:" + File.separator + "upload", extend + newName);
            File file1 = new File("/home/starno01" + File.separator + "imgnginx", extend + newName);
            try {
                file.transferTo(file1);
                return file1.getAbsolutePath();

            } catch (IOException e) {
                e.printStackTrace();
            }



        }
        return "upload";
    }
}
