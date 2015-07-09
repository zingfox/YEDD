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
    private List<Blog> blogs;
    private ViewHolder viewHolder;
    private Blog blog;

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

            convertView = inflater.inflate(R.layout.blog, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.blog_title);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        blog = blogs.get(position);

        viewHolder.title.setText(blog.getTitle());

        return convertView;
    }

    private static class ViewHolder {
        TextView title;
    }
}
