package org.kbf.jmshome.model;

import java.util.Date;

public class Story {
    private Integer id;

    private String title;

    private Integer commenttimes;

    private Date texttime;

    private String textbody;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCommenttimes() {
        return commenttimes;
    }

    public void setCommenttimes(Integer commenttimes) {
        this.commenttimes = commenttimes;
    }

    public Date getTexttime() {
        return texttime;
    }

    public void setTexttime(Date texttime) {
        this.texttime = texttime;
    }

    public String getTextbody() {
        return textbody;
    }

    public void setTextbody(String textbody) {
        this.textbody = textbody == null ? null : textbody.trim();
    }
}