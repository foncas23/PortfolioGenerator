package com.aspy.portfoliogenerator.infraestructure.jpa;

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
@Table(name = "TECNICOS")
public class Technicians {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Id
  @Column(name = "NOMBRE")
  private String name;

  @Id
  @Column(name = "APELLIDO")
  private String lastName;

  @Id
  @Column(name = "FECHA_NACIMIENTO")
  private LocalDateTime birthDate;

  @Id
  @Column(name = "DIRECCION")
  private String address;

  @Id
  @Column(name = "TELEFONO")
  private String phone;

  @Id
  @Column(name = "CORREO_ELECTRONICO")
  private String email;

  @Id
  @Column(name = "ESPECIALIDAD")
  private String speciality;

  @Id
  @Column(name = "EXPERIENCIA")
  private String experience;

  @Id
  @Column(name = "CERTIFICADO")
  private String certificate;
}
