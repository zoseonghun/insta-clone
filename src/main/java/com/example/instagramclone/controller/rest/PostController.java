package com.example.instagramclone.controller.rest;

import com.example.instagramclone.repository.PostRepository;
import com.example.instagramclone.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    
}
