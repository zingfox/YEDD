package com.zingfox.yedd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.zingfox.yedd.model.Blog;

import java.util.List;

public class BlogFeedActivity extends ActionBarActivity {

    private FrameLayout rootLayout;
    private FloatingActionButton newBlogBtn;
    private TabLayout tabLayout;

    private ListView blogListView;
    private List<Blog> blogs;
    //private FeedAdapter feedAdapter;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_feed);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Feed"));
        tabLayout.addTab(tabLayout.newTab().setText("Noti"));
        tabLayout.addTab(tabLayout.newTab().setText("Friend"));
        tabLayout.addTab(tabLayout.newTab().setText("Fav"));

        rootLayout = (FrameLayout) findViewById(R.id.rootLayout);

        newBlogBtn = (FloatingActionButton) findViewById(R.id.newBlogBtn);
        newBlogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CreateBlogActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //blogListView = (ListView) findViewById(R.id.listView);

        //inputBlog();
        //feedAdapter = new FeedAdapter(this, blogs);
        //blogListView.setAdapter(feedAdapter);
    }

    private void inputBlog() {
        blogs.add(new Blog("TEST"));
        blogs.add(new Blog("YEDD"));
        blogs.add(new Blog("NOOO"));
    }

}

