package com.example.board.domain.board.domain;

import com.example.board.domain.user.domain.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardTitle;;

    private String boardContents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wirter_id")
    private Member writer;
}
