package com.word.voca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VocaController {

    @GetMapping("/board")
    public String board(){

        return "/voca/board.html";
    }

    @GetMapping("/voca")
    public String voca(){
        return "/voca/voca.html";
    }

    @GetMapping("/qna")
    public String qna(){
        return "/voca/qna.html";
    }
}
