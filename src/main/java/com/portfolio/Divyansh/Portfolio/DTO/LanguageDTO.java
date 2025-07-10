package com.portfolio.Divyansh.Portfolio.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDTO {

    private Long id;
    private String version;
    private String languageName;
    private String orientation;
    private String proficiency;
    private String experience;
    private String packageManager;
    private String domain;
    private List<String> frameworks;
    private String description;
    private String image;
    
}
