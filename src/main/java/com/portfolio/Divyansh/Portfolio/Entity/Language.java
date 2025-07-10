package com.portfolio.Divyansh.Portfolio.Entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String version;
    private String languageName;
    private String orientation;
    private String proficiency;
    private String experience;
    private String packageManager;
    private String domain;
    
    @ElementCollection
    private List<String> frameworks;

    private String description;
    private String image;
     
}
