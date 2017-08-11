package com.atguigu.dd.manager.bean;

public class TSensitive {
    private Integer id;

    private String sensitives;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSensitives() {
        return sensitives;
    }

    public void setSensitives(String sensitives) {
        this.sensitives = sensitives == null ? null : sensitives.trim();
    }
}