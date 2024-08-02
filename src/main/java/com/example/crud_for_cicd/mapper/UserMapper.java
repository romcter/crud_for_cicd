package com.example.crud_for_cicd.mapper;

import com.example.crud_for_cicd.domain.User;
import com.example.crud_for_cicd.dto.UserDto;
import com.example.crud_for_cicd.dto.UserFullDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = "spring")
public interface UserMapper {
    User dtoToEntity(UserFullDto dto);
    User dtoToEntity(UserDto dto);
    UserFullDto entityToDto(User entity);
    List<UserFullDto> entityToDto(List<User> entity);
}
