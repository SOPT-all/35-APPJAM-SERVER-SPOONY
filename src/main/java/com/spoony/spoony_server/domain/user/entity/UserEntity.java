package com.spoony.spoony_server.domain.user.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userImage;
    private Integer regionId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}