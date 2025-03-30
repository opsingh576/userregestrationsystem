package com.user.registation.system.services.impl;

import com.user.registation.system.dtos.UserDTO;
import com.user.registation.system.entities.UserEntity;
import com.user.registation.system.repostiories.UserRepository;
import com.user.registation.system.services.UserRegestrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegestrationServiceImpl implements UserRegestrationService {
    @Autowired
   private UserRepository userRepository;
    @Override
    public void createUser(UserDTO userDTO) {

       /* UserEntity userEntity=new UserEntity();
        userEntity.setCity(userDTO.getCity());
        userEntity.setDob(userDTO.getDob());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setMobileNumber(userDTO.getMobileNumber());
        userRepository.save(userEntity);*/

        UserEntity userEntity=UserEntity.builder()
                .email(userDTO.getEmail())
                .city(userDTO.getCity())
                .dob(userDTO.getDob())
                .mobileNumber(userDTO.getMobileNumber())
                .build();
        this.userRepository.save(userEntity);
    }
}
