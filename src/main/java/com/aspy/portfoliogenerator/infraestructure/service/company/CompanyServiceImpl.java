package com.aspy.portfoliogenerator.infraestructure.service.company;

import com.aspy.portfoliogenerator.domain.entity.company.Company;
import com.aspy.portfoliogenerator.domain.services.company.CompanyService;
import com.aspy.portfoliogenerator.infraestructure.jpa.CompanyJpa;
import com.aspy.portfoliogenerator.infraestructure.mapper.company.CompanyJpaMapper;
import com.aspy.portfoliogenerator.infraestructure.repository.company.CompanieJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

  private final CompanieJpaRepository companieJpaRepository;

  @Override
  public Company getCompaniesById(Integer id) {
    CompanyJpa companyJpa = companieJpaRepository.getCompaniesToId(id);

    return CompanyJpaMapper.INSTANCE.toCompanies(companyJpa);
  }
}
