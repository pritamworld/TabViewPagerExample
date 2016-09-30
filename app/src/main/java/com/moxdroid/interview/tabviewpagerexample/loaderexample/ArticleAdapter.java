/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.loaderexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.moxdroid.interview.tabviewpagerexample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pritesh.patel on 2016-09-30, 12:18 PM.
 * ADESA, Canada
 */

public class ArticleAdapter extends BaseAdapter
{
    private LayoutInflater inflater;
    private List<Article> articleList = new ArrayList<Article>();

    public ArticleAdapter(Context context, List<Article> articleList)
    {
        this.articleList = articleList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return articleList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return articleList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        Article article = (Article) getItem(position);
        if (view == null)
        {
            view = inflater.inflate(R.layout.article_data, null);
        }
        TextView articleTitle = (TextView) view.findViewById(R.id.articleTitle);
        articleTitle.setText(article.getTitle());
        TextView articleUrl = (TextView) view.findViewById(R.id.articleUrl);
        articleUrl.setText(article.getUrl());
        return view;
    }

    public void setArticleList(List<Article> data)
    {
        articleList.addAll(data);
        notifyDataSetChanged();
    }

}
