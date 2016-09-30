/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.loaderexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pritesh.patel on 2016-09-30, 10:55 AM.
 * ADESA, Canada
 */


public class Article
{

    private List<ArticleList> articleList = new ArrayList<ArticleList>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The articleList
     */
    public List<ArticleList> getArticleList()
    {
        return articleList;
    }

    /**
     * @param articleList The articleList
     */
    public void setArticleList(List<ArticleList> articleList)
    {
        this.articleList = articleList;
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
