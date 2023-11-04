package com.aspy.portfoliogenerator.domain.entity.companies.Enum;

public enum CompanieTypeEnum {
  PEQUE_A("Pequeña"),
  MEDIANA("Mediana"),
  GRANDE("Grande");

  private String value;

  CompanieTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static CompanieTypeEnum fromValue(String value) {
    for (CompanieTypeEnum b : CompanieTypeEnum.values()) {
      if (b.value.equalsIgnoreCase(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
