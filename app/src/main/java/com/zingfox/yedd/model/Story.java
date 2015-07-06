package com.zingfox.yedd.model;

/**
 * Created by Zing on 7/6/2015.
 */
public class Story {

    private long id;
    private User author;
    private String substance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }
}
