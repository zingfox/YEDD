package com.zingfox.yedd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Zing on 7/6/2015.
 */
public class RegisterActivity extends ActionBarActivity {

    private EditText username;
    private EditText password;
    private EditText comfirmPaassword;
    private Button signUp;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        comfirmPaassword = (EditText) findViewById(R.id.confirm_password);
        signUp = (Button) findViewById(R.id.sign_up);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
