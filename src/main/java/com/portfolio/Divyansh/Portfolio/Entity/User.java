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
@Table(name = "user_details")
public class User {

    private String name;
    private String email;
    private String age;
    private String image;
    private String occupation;
    private String graduationStartDate;
    private String graduationEndDate;
    private String currentCompany;
    private String currentDesignation;
    private String currentPosting;
    private String linkedinProfile;
    private String githubProfile;
    private String instagramProfile;
    private String twitterProfile;
    private String desciption;

    private Long contactDetails;

    private String resume;


}
