package com.aspy.portfoliogenerator.infraestructure.repository.company;

import com.aspy.portfoliogenerator.infraestructure.jpa.CompanyJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanieJpaRepository extends JpaRepository<CompanyJpa, Integer> {

  @Query(value = "SELECT c FROM CompanyJpa c " + "WHERE c.id = :companieId")
  CompanyJpa getCompaniesToId(Integer companieId);
}
