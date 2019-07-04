package org.kbf.jmshome.model;

public class Computerpicture {
    private Integer id;

    private String name;

    private String path;

    private String type;

    private String keydescription;

    private Integer downloadtimes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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