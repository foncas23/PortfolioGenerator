package com.aspy.portfoliogenerator.domain.entity.company;

import com.aspy.portfoliogenerator.domain.entity.company.Enum.CompanieTypeEnum;
import java.time.LocalDateTime;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Company {

  private Integer id;
  private String name;
  private String address;
  private String phoneNumber;
  private String email;
  private LocalDateTime createDate;
  private CompanieTypeEnum companieType;
  private String state;
  private Integer technicalId;
}
