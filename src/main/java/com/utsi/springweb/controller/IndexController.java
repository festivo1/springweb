/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsi.springweb.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author utsi
 */
public class IndexController implements ErrorController{
private static final String PATH="/error";
    @Override
    public String getErrorPath() {
        return PATH;
    }
    @RequestMapping(PATH)
    public String error(){
        return " No mapping available";
    }
    
}
