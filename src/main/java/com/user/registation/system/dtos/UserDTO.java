package com.user.registation.system.dtos;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class UserDTO {
    private String email;
    private String mobileNumber;
    private String city;
    private LocalDate dob;
}
