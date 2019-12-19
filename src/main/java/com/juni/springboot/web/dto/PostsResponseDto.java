package com.juni.springboot.web.dto;

import com.juni.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts Entity){
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
