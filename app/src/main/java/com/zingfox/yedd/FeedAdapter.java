package com.zingfox.yedd;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zingfox.yedd.model.Blog;

import java.util.List;

/**
 * Created by Zing on 7/8/2015.
 */
public class FeedAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    List<Blog> blogs;
    TextView title;

    public FeedAdapter(Activity activity, List<Blog> blogs) {
        inflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.blogs = blogs;
    }

    @Override
    public int getCount() {
        return blogs.size();
    }

    @Override
    public Object getItem(int position) {
        return blogs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {

            convertView = inflater.inflate(R.layout.activity_blog_feed, parent, false);

            //title = (TextView) convertView.findViewById(R.id.blog);

            convertView.setTag(title);
        }else {
            title = (TextView) convertView.getTag();
        }

        return convertView;
    }

}
