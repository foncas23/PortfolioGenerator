package com.aspy.portfoliogenerator.infraestructure.jpa;

import com.aspy.portfoliogenerator.domain.entity.companies.Enum.CompanieTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "EMPRESAS")
public class CompaniesJpa {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "NOMBRE")
  private String name;

  @Column(name = "DIRECCION")
  private String address;

  @Column(name = "TELEFONO")
  private String phoneNumber;

  @Column(name = "CORREO_ELECTRONICO")
  private String email;

  @Column(name = "FECHA_CREACION")
  private LocalDateTime createDate;

  @Column(name = "TIPO_EMPRESA")
  private CompanieTypeEnum companieType;

  @Column(name = "ESTADO")
  private String state;

  @Column(name = "TECNICO_ID")
  private Integer technicalId;
}
