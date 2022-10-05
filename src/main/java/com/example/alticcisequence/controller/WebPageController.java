package com.example.alticcisequence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebPageController {

    @GetMapping({"/"})
    public ModelAndView homePage(Model model) {
        return new ModelAndView("index");
    }

}
