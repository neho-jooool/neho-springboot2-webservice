package com.neho.book.springboot.web;

import com.neho.book.springboot.service.PostsService;
import com.neho.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("api/v1/posts")
    public Long Save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
}
