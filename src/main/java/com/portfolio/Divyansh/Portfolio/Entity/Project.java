package com.portfolio.Divyansh.Portfolio.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;
    private String type;

    @ElementCollection
    private List<String> languagesUsed;

    @ElementCollection
    private List<String> frameworksUsed;

    @ElementCollection
    private List<String> technologiesUsed;

    private String link;
    
    @ElementCollection
    private List<String> description;
    
    private String image;
}
