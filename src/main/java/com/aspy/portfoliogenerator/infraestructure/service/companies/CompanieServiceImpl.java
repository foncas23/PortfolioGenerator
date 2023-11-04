package com.aspy.portfoliogenerator.infraestructure.service.companies;

import com.aspy.portfoliogenerator.domain.entity.companies.Companies;
import com.aspy.portfoliogenerator.domain.services.companies.CompanieService;
import com.aspy.portfoliogenerator.infraestructure.jpa.CompaniesJpa;
import com.aspy.portfoliogenerator.infraestructure.mapper.companies.CompaniesJpaMapper;
import com.aspy.portfoliogenerator.infraestructure.repository.companies.CompanieJpaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanieServiceImpl implements CompanieService {

  private final CompanieJpaRepository companieJpaRepository;

  @Override
  public List<Companies> getCompaniesById(Integer id) {
    List<CompaniesJpa> companiesJpaList = companieJpaRepository.getCompaniesToId(id);

    return CompaniesJpaMapper.INSTANCE.toCompanies(companiesJpaList);
  }
}
