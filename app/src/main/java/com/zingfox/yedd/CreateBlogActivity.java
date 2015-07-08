package com.zingfox.yedd;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Zing on 7/3/2015.
 */
public class CreateBlogActivity extends ActionBarActivity {

    private EditText title;
    private EditText story;
    private TextView textCount;
    private Button post;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_blog);

        title = (EditText) findViewById(R.id.title);
        story = (EditText) findViewById(R.id.story);
        textCount = (TextView) findViewById(R.id.text_count);
        post = (Button) findViewById(R.id.post);

        story.addTextChangedListener(textWatcher);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BlogFeedActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            int count = 140 - story.length();

            textCount.setText(String.valueOf(count));

            textCount.setTextColor(Color.GREEN);

            if(count < 10) {
                textCount.setTextColor(Color.RED);
            }else if(count < 20) {
                textCount.setTextColor(Color.YELLOW);
            }
        }
    };
}
