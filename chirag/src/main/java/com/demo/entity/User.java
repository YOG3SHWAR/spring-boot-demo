package com.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document("users")
public class User {
    @Id
    String id;
    @Field("first_name")
    String firstName;
    String email;
    double udhar;
}
