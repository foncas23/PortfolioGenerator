package com.aspy.portfoliogenerator.infraestructure.repository.companies;

import com.aspy.portfoliogenerator.infraestructure.jpa.CompaniesJpa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanieJpaRepository extends JpaRepository<CompaniesJpa, Integer> {

  @Query(value = "SELECT c FROM CompaniesJpa c " + "WHERE c.id = :companieId")
  List<CompaniesJpa> getCompaniesToId(Integer companieId);
}
