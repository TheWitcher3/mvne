package com.kt.mvne.controller;

import com.kt.mvne.repository.MvnoCodeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvnocodeinfo")
public class MvnoCodeInfoController {

    @Autowired
    MvnoCodeInfoRepository mvnoCodeInfoRepository;

    @GetMapping("/")
    public String init() {
        System.out.println("여기");
        return "/mvnocodeinfo/test";
    }

    @GetMapping("/list")
    public String list(Model model) {
        System.out.println("리스트 출력");
        model.addAttribute("mvnocodeinfo", mvnoCodeInfoRepository.findAll());
        return "/mvnocodeinfo/list";
    }





}

















