package com.word.voca.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BoardDTO {

    private int board_no; // 게시물 번호료
    private String title; // 게시물 제목
    private String content; // 게시물 내용
    private String writer; // 게시물 작성자
    private Date reg_date; // 게시물 등록시간
    private int hit; // 조회수

    public int getBoard_no() {
        return board_no;
    }

    public void setBoard_no(int board_no) {
        this.board_no = board_no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
