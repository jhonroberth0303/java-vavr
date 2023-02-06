package com.study.vavr.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonDTO {
    private Integer dni;
    private String name;
    private Integer age;
}
