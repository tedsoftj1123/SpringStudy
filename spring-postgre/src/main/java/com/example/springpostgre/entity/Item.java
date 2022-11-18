package com.example.springpostgre.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Table(name = "tbl_item")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;
}
