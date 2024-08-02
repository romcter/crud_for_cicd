package com.example.crud_for_cicd.config;

import com.example.crud_for_cicd.domain.User;
import com.example.crud_for_cicd.dto.UserDto;
import com.example.crud_for_cicd.dto.UserFullDto;

import java.time.LocalDate;

public class TestEntity {

    public static User user = User.builder()
            .firstName("Test")
            .lastName("Toe")
            .address("Test")
            .birthDate(LocalDate.now().minusYears(19))
            .email("test_toe@gmail.com")
            .phoneNumber("0667492234")
            .build();

    public static UserFullDto userFullDto = UserFullDto.builder()
            .firstName("Test")
            .lastName("Toe")
            .address("Test")
            .birthDate(LocalDate.now().minusYears(19))
            .email("test_toe@gmail.com")
            .phoneNumber("0667492234")
            .build();

    public static UserDto userDto = UserDto.builder()
            .firstName("Test")
            .lastName("Toe")
            .address("Test")
            .phoneNumber("0667492234")
            .build();

}
