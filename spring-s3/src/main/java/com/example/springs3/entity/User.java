package com.example.springs3.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotNull
    private String accountId;

    @NotNull
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Feed> feeds = new ArrayList<>();
    @Builder
    public User(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
    }
}
