/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsi.springweb.controller;

import com.utsi.springweb.model.User;
import com.utsi.springweb.model.UserProfile;
import com.utsi.springweb.repository.UserProfileRepository;
import com.utsi.springweb.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author utsi
 */
@RestController
@RequestMapping(value = "/")
public class HelloController {
    @Autowired
    UserProfileRepository upr;
    @Autowired
    UserRepository userRepo;
    @RequestMapping(method = RequestMethod.GET)
    public List<User> index(){
        return userRepo.findAll();
    }
}

