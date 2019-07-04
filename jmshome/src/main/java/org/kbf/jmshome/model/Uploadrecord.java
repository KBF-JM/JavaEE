package org.kbf.jmshome.model;

import java.util.Date;

public class Uploadrecord {
    private String id;

    private String filename;

    private String fileid;

    private String uploadpath;

    private Integer filetype;

    private String uploaduserid;

    private Date uploadtime;

    private Integer checkstatu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getUploadpath() {
        return uploadpath;
    }

    public void setUploadpath(String uploadpath) {
        this.uploadpath = uploadpath == null ? null : uploadpath.trim();
    }

    public Integer getFiletype() {
        return filetype;
    }

    public void setFiletype(Integer filetype) {
        this.filetype = filetype;
    }

    public String getUploaduserid() {
        return uploaduserid;
    }

    public void setUploaduserid(String uploaduserid) {
        this.uploaduserid = uploaduserid == null ? null : uploaduserid.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Integer getCheckstatu() {
        return checkstatu;
    }

    public void setCheckstatu(Integer checkstatu) {
        this.checkstatu = checkstatu;
    }
}