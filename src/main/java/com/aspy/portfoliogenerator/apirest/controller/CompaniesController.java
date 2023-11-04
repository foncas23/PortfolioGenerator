package com.aspy.portfoliogenerator.apirest.controller;

import com.aspy.openapi.api.CompaniesApi;
import com.aspy.openapi.model.CompaniesDTO;
import com.aspy.portfoliogenerator.apirest.mapper.CompaniesMapper;
import com.aspy.portfoliogenerator.application.usecase.companies.GetCompanieToIdUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CompaniesController implements CompaniesApi {

  private final GetCompanieToIdUseCase getCompanieToIdUseCase;

  @Override
  public ResponseEntity<List<CompaniesDTO>> getCompaniesToId(Integer companiesId) {

    return ResponseEntity.ok(
        CompaniesMapper.INSTANCE.companiesToCompaniesDTO(
            this.getCompanieToIdUseCase.execute(companiesId)));
  }
}
