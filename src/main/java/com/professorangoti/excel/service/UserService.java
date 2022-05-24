package com.professorangoti.excel.service;

import java.util.List;

import javax.transaction.Transactional;

import com.professorangoti.excel.model.User;
import com.professorangoti.excel.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> listAll() {
        return repo.findAll(Sort.by("email").ascending());
    }

}