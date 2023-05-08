package com.word.voca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VocaController {

    @GetMapping("/board")
    public String board(){

        return "/voca/board/board.html";
    }

    @GetMapping("/voca")
    public String voca(){

        return "/voca/voca/voca.html";
    }

    @GetMapping("/qna")
    public String qna(){

        return "/voca/qna/qna.html";
    }

    @GetMapping("/boardWrite") // 게시판 글쓰기
    public String boardWrtie(){
        return "/voca/board/boardWrite.html";
    }
}
