package com.aspy.portfoliogenerator.infraestructure.mapper.company;

import com.aspy.portfoliogenerator.domain.entity.company.Company;
import com.aspy.portfoliogenerator.infraestructure.jpa.CompanyJpa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompanyJpaMapper {

  CompanyJpaMapper INSTANCE = Mappers.getMapper(CompanyJpaMapper.class);

  @Mappings({
    @Mapping(source = "id", target = "id"),
    @Mapping(source = "name", target = "name"),
    @Mapping(source = "address", target = "address"),
    @Mapping(source = "phoneNumber", target = "phoneNumber"),
    @Mapping(source = "email", target = "email"),
    @Mapping(source = "createDate", target = "createDate"),
    @Mapping(source = "companieType", target = "companieType"),
    @Mapping(source = "state", target = "state"),
    @Mapping(source = "technicalId", target = "technicalId"),
  })
  Company toCompanies(CompanyJpa companyJpa);
}
