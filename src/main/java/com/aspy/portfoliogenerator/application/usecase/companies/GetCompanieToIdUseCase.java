package com.aspy.portfoliogenerator.application.usecase.companies;

import com.aspy.portfoliogenerator.domain.annotation.UseCase;
import com.aspy.portfoliogenerator.domain.entity.companies.Companies;
import com.aspy.portfoliogenerator.domain.services.companies.CompanieService;
import java.util.List;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class GetCompanieToIdUseCase {

  private final CompanieService companieService;

  public List<Companies> execute(Integer id) {
    return this.companieService.getCompaniesById(id);
  }
}
