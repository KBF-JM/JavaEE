package org.kbf.jmshome.model;

import java.util.Date;

public class Downloadrecord {
    private String id;

    private String filename;

    private String fileid;

    private String filepath;

    private String downloaduserid;

    private Date downloadtime;

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

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getDownloaduserid() {
        return downloaduserid;
    }

    public void setDownloaduserid(String downloaduserid) {
        this.downloaduserid = downloaduserid == null ? null : downloaduserid.trim();
    }

    public Date getDownloadtime() {
        return downloadtime;
    }

    public void setDownloadtime(Date downloadtime) {
        this.downloadtime = downloadtime;
    }
}