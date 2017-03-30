package com.example.tomer.univacancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.tomer.univacancy.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private TextView university_mail_suffix;
    private EditText password;
    private Button login_button;
    private Button go_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.enterEmail);
        university_mail_suffix = (TextView) findViewById(R.id.bguMail);
        password = (EditText) findViewById(R.id.enter_password);
        login_button = (Button) findViewById(R.id.login_button);
        go_register = (Button) findViewById(R.id.goRegister_button);

        go_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent register_intent = new Intent(MainActivity.this, Register.class);
                startActivity(register_intent);
            }
        });


    }
}
