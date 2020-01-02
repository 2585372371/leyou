package com.leyou.upload.service.impl;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.upload.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class UploadServiceImpl implements UploadService {
    private static final List<String> ALLOW_TYPES= Arrays.asList("image/jepg","image/png","image/bmp,image/jpg");

    @Override
    public String uploadImage(MultipartFile file) {
//        准备目标路径


        try {
//           校验文件类型：
            String contentType = file.getContentType();
//            定义允许的文件类型
                if(ALLOW_TYPES.equals(contentType)){
                    throw new LyException(ExceptionEnum.INVALID_FILE_TYPE);
                }
//                校验文件内容,如果返回的不是图片 返回空
            BufferedImage read = ImageIO.read(file.getInputStream());
                if(read==null){
                    throw  new LyException(ExceptionEnum.INVALID_FILE_TYPE);
                }

            File dest=new File("D:\\IdeaProjects\\filepath",file.getOriginalFilename());
//        保存文件到本地
            file.transferTo(dest);
            return "http://image.leyou.com/"+file.getOriginalFilename();
        } catch (IOException e) {
            log.error("上传文件失败",e);
            throw  new LyException(ExceptionEnum.UPLOAD_ERROR);
        }
//        返回路径

    }
}
