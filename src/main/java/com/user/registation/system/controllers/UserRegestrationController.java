package com.user.registation.system.controllers;

import com.user.registation.system.dtos.UserDTO;
import com.user.registation.system.services.UserRegestrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registrations")
public class UserRegestrationController {
    @Autowired
    private UserRegestrationService userRegestrationService;

   @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO)
    {
        this.userRegestrationService.createUser(userDTO);
        return ResponseEntity.ok("User has been Created");
    }
}
