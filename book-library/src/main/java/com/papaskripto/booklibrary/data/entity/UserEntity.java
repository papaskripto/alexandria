package com.papaskripto.booklibrary.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "USERS")

public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    @Column (name = "ID")
    private UUID id;

    @Column (name = "FIRST_NAME")
    private String firstName;

    @Column (name = "MIDDLE_NAME")
    private String middleName;

    @Column (name = "LAST_NAME")
    private String lastName;

    @Column (name = "EMAIL")
    private String email;

    @Column (name = "PHONE")
    private String phone;

    @Column (name = "PASSWORD_HASH")
    private String passwordHash;

    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private UserRole role = UserRole.MEMBER;

    @Column (name = "IS_ACTIVE")
    private boolean isActive = true;

    @CreationTimestamp
    @Column (name = "CREATED_AT", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column (name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    @Column (name = "DELETED_AT")
    private LocalDateTime deletedAt;
}
