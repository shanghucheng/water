package com.water.entity;

import java.io.Serializable;

public class Specs implements Serializable {
    private Integer id;

    private Integer waterId;

    private Integer guigeId;

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

    public Integer getGuigeId() {
        return guigeId;
    }

    public void setGuigeId(Integer guigeId) {
        this.guigeId = guigeId;
    }
}