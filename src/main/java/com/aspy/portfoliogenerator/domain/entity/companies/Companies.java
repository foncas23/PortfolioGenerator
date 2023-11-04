package com.aspy.portfoliogenerator.domain.entity.companies;

import com.aspy.portfoliogenerator.domain.entity.companies.Enum.CompanieTypeEnum;
import java.time.LocalDateTime;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Companies {

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
