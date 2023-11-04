package com.aspy.portfoliogenerator.domain.services.companies;

import com.aspy.portfoliogenerator.domain.entity.companies.Companies;
import java.util.List;

public interface CompanieService {

  List<Companies> getCompaniesById(Integer id);
}
