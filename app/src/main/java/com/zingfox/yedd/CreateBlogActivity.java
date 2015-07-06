package com.zingfox.yedd;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Zing on 7/3/2015.
 */
public class CreateBlogActivity extends ActionBarActivity {

    EditText title;
    Button save;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_blog);
    }
}
