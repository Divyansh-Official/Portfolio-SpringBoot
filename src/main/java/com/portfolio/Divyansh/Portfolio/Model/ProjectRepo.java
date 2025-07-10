package com.portfolio.Divyansh.Portfolio.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.Divyansh.Portfolio.Entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Long>{
    
}
