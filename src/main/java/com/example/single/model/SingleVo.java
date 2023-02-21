package com.example.single.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "single")
public class SingleVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private int cnt = 0;
    private String rmk;
}
