package com.portfolio.Divyansh.Portfolio.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.Divyansh.Portfolio.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long>{
    
}
