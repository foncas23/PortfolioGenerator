package com.aspy.portfoliogenerator.domain.entity.company;

import java.time.LocalDateTime;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CompanyRequest {

  private Integer id;
  private String name;
  private String address;
  private String phoneNumber;
  private String email;
  private LocalDateTime createDate;
  private String companieType;
  private boolean state;
  private Integer technicalId;
}
