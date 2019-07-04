package org.kbf.jmshome.model;

public class Video {
    private String id;

    private String name;

    private String path;

    private Integer type;

    private String keydescription;

    private Integer downloadtimes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKeydescription() {
        return keydescription;
    }

    public void setKeydescription(String keydescription) {
        this.keydescription = keydescription == null ? null : keydescription.trim();
    }

    public Integer getDownloadtimes() {
        return downloadtimes;
    }

    public void setDownloadtimes(Integer downloadtimes) {
        this.downloadtimes = downloadtimes;
    }
}