package com.zingfox.yedd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.FrameLayout;

public class MainFeedActivity extends ActionBarActivity {

    private FrameLayout rootLayout;
    private FloatingActionButton newBlogBtn;
    private TabLayout tabLayout;
;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_feed);

        new ShowBlogList();

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
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(context, FunctionActivity.class);
        startActivity(intent);
        finish();
    }
}

