package com.user.registation.system.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userID;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true)
    private String mobileNumber;
    private String city;
    private LocalDate dob;
}
