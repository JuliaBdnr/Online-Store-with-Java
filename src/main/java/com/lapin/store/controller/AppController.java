package com.lapin.store.controller;

import com.lapin.store.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Denys Lapin on 19.11.2014.
 */
@Controller
@ComponentScan(basePackages = "com.lapin.store.dao")

public class AppController {
    @Autowired
    CategoryDao categoryDao;
    @RequestMapping("/")
    public String getJsp(ModelMap model){
        //List<Category> list = categoryDao.findAll();

       // model.addAttribute("categories", list);
        return "index";
    }
}
