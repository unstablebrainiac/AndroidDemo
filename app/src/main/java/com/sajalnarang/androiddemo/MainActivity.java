package com.sajalnarang.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.login_button);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switch activities
                EditText usernameEditText = (EditText) findViewById(R.id.username);
                EditText passwordEditText = (EditText) findViewById(R.id.password);
                String username = String.valueOf(usernameEditText.getText());
                String password = String.valueOf(passwordEditText.getText());
                if (username.equals("foo") && password.equals("bar")) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra(Constants.KEY_USERNAME, username);
                    intent.putExtra(Constants.KEY_PASSWORD, password);
                    startActivity(intent);
                }
            }
        };
        loginButton.setOnClickListener(onClickListener);
    }
}
