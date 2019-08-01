package com.maitrongnghia.restapi.controller;

import com.maitrongnghia.restapi.dao.UserRepository;
import com.maitrongnghia.restapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControler {
    @Autowired
    private UserRepository repository;

    @RequestMapping(path="/get",method = RequestMethod.GET)
    public List<User> getUserByRole(){
        return repository.findUserByRole(1);
    }
}
