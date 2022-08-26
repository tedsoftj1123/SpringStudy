package com.example.board.domain.user.domain;

import com.example.board.domain.board.domain.Board;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_nickname", length = 10)
    private String nickname;

    @Column(name = "member_password", length = 60)
    private String password;


    @OneToMany

    private List<Board> boards;


    @Builder
    public Member(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }
}
