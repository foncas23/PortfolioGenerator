package com.aspy.portfoliogenerator.application.usecase.company;

import com.aspy.portfoliogenerator.domain.annotation.UseCase;
import com.aspy.portfoliogenerator.domain.entity.company.Company;
import com.aspy.portfoliogenerator.domain.iServices.company.CompanyService;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class GetCompanyToIdUseCase {

  private final CompanyService companyService;

  public Company execute(Integer id) {
    return this.companyService.getCompaniesById(id);
  }
}
