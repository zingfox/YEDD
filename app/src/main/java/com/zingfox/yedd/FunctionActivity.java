package com.zingfox.yedd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zing on 7/9/2015.
 */
public class FunctionActivity extends ActionBarActivity {

    private Button main;
    private Button create;
    private Button feed;

    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.function_activity);

        main = (Button) findViewById(R.id.main);
        create = (Button) findViewById(R.id.create_blog);
        feed = (Button) findViewById(R.id.feed);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(MainFeedActivity.class);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(CreateBlogActivity.class);
            }
        });

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(ShowBlogList.class);
            }
        });
    }
    private void goTo(Class act) {
        Intent intent = new Intent(context, act);
        startActivity(intent);
        finish();
    }

}