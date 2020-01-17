package com.water.entity;

import java.io.Serializable;

public class WaterInfoImageurl implements Serializable {
    private Integer id;

    private Integer waterId;

    private String url;

    private String defalut;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWaterId() {
        return waterId;
    }

    public void setWaterId(Integer waterId) {
        this.waterId = waterId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDefalut() {
        return defalut;
    }

    public void setDefalut(String defalut) {
        this.defalut = defalut;
    }
}