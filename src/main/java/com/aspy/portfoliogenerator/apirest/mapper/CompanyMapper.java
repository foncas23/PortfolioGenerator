package com.aspy.portfoliogenerator.apirest.mapper;

import com.aspy.openapi.model.CompanyDTO;
import com.aspy.portfoliogenerator.domain.entity.company.Company;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

  CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

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
  CompanyDTO companiesToCompaniesDTO(Company listCompany);

  Company companiesDTOToCompanies(CompanyDTO companiesDTO);
}
