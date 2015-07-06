package com.zingfox.yedd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zing on 7/3/2015.
 */
public class FunctionActivity extends ActionBarActivity{

    private Button createBlog;
    private Button showBlog;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        createBlog = (Button) findViewById(R.id.create_blog);
        showBlog = (Button) findViewById(R.id.show_blog);

        createBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CreateBlogActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
