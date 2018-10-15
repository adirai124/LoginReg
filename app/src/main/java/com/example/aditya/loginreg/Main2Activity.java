package com.example.aditya.loginreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button signin;
    EditText id,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        id = (EditText)findViewById(R.id.id);
        pass = (EditText)findViewById(R.id.pass);
        signin = (Button)findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home();
            }
        });
    }
    public void home(){
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
