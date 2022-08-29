package com.example.stella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "기연");
        return "greetings"; // templates/greetings.mustache -> 브라우저로 실행
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "기연");
        return "goodbye"; // templates/greetings.mustache -> 브라우저로 실행
    }
}
