package com.example.springpostgre.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Table(name = "tbl_item")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
