package com.word.voca.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BoardDto {

    private int board_no; // 게시물 번호
    private String title; // 게시물 제목
    private String content; // 게시물 내용
    private String writer; // 게시물 작성자
    private Date reg_date; // 게시물 등록시간
    private int hit; // 조회수

}
