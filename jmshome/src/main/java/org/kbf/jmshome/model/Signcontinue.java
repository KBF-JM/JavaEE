package org.kbf.jmshome.model;

public class Signcontinue {
    private String id;

    private String userid;

    private Integer continueday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getContinueday() {
        return continueday;
    }

    public void setContinueday(Integer continueday) {
        this.continueday = continueday;
    }
}