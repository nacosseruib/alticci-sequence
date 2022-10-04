package com.example.alticcisequence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebPageController {

    //@RequestMapping("/")
    @GetMapping({"/"})
    public ModelAndView homePage(Model model) {
        AlticciSequenceController AlticciSequenceController = new AlticciSequenceController();
        model.addAttribute("result", AlticciSequenceController.mapAlticci(6));
        return new ModelAndView("index");

//        AlticciSequenceController AlticciSequenceController = new AlticciSequenceController();
//        ModelAndView model = new ModelAndView("/index");
//        model.addObject("result", AlticciSequenceController.mapAlticci(6));
//        return model;

    }

}
