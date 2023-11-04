package com.aspy.portfoliogenerator.apirest.controller;

import com.aspy.openapi.api.CompanyApi;
import com.aspy.openapi.model.CompanyDTO;
import com.aspy.portfoliogenerator.apirest.mapper.CompaniesMapper;
import com.aspy.portfoliogenerator.application.usecase.company.GetCompanyToIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CompanyController implements CompanyApi {

  private final GetCompanyToIdUseCase getCompanyToIdUseCase;

  @Override
  public ResponseEntity<CompanyDTO> getCompanyToId(Integer companyId) {

    return ResponseEntity.ok(
        CompaniesMapper.INSTANCE.companiesToCompaniesDTO(
            this.getCompanyToIdUseCase.execute(companyId)));
  }
}
