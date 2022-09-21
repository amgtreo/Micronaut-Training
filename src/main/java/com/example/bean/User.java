package com.example.bean;

import lombok.*;
@Builder
@Data
@MappedEntity
public class User {
    private Long id;
    private String name;
    private String lastName;
    private String email;
}
