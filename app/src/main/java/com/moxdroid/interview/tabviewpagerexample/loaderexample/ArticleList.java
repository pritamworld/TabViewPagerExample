/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.loaderexample;

/**
 * Created by pritesh.patel on 2016-09-30, 10:56 AM.
 * ADESA, Canada
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArticleList
{

    private String title;
    private String url;
    private List<String> categories = new ArrayList<String>();
    private List<String> tags = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * @return The url
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url)
    {
        this.url = url;
    }

    /**
     * @return The categories
     */
    public List<String> getCategories()
    {
        return categories;
    }

    /**
     * @param categories The categories
     */
    public void setCategories(List<String> categories)
    {
        this.categories = categories;
    }

    /**
     * @return The tags
     */
    public List<String> getTags()
    {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(List<String> tags)
    {
        this.tags = tags;
    }

    public Map<String, Object> getAdditionalProperties()
    {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value)
    {
        this.additionalProperties.put(name, value);
    }

}
