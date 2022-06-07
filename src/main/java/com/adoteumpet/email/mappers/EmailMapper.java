package com.adoteumpet.email.mappers;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.adoteumpet.email.dtos.EmailDto;
import com.adoteumpet.email.entities.Email;


@Mapper(componentModel = "spring")
public interface EmailMapper {

	@Mapping(target="id", ignore=true) 
	@BeanMapping(
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, 
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    public Email toEntity(EmailDto dto, @MappingTarget Email entity);
	
	public EmailDto toDTO(Email entity);

    public List<EmailDto> toDTOList(List<Email> entity);
}
