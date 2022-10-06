package com.example.springs3.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Feed {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_id")
    private Long id;

    private String title;

    private String content;

    private String contentImgUrl;
    @Builder
    public Feed(String title, String content, String contentImgUrl) {
        this.title = title;
        this.content = content;
        this.contentImgUrl = contentImgUrl;
    }
}
