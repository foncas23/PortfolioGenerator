package com.aspy.portfoliogenerator.apirest.mapper;

import com.aspy.openapi.model.CompaniesDTO;
import com.aspy.portfoliogenerator.domain.entity.companies.Companies;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompaniesMapper {

  CompaniesMapper INSTANCE = Mappers.getMapper(CompaniesMapper.class);

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
  List<CompaniesDTO> companiesToCompaniesDTO(List<Companies> listCompanies);

  Companies companiesDTOToCompanies(CompaniesDTO companiesDTO);
}
