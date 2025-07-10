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
@Table(name = "certifications")
public class Certification {

    private Long id;
    private String certificationName;
    private String companyName;
    private String domain;
    private String completionDate;
    private String mode;
    private String link;
    private String description;
    
}
