package com.zingfox.yedd.model;

import java.util.List;

/**
 * Created by Zing on 7/6/2015.
 */
public class Blog {

    private long id;
    private String title;
    private List<Story> stories;

    public Blog(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
