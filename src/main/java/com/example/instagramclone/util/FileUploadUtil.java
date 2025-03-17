package com.example.instagramclone.util;

import com.example.instagramclone.config.FileUploadConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Component
public class FileUploadUtil {

    private final FileUploadConfig fileUploadConfig;


}
