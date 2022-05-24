package com.professorangoti.excel.repository;

import com.professorangoti.excel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
