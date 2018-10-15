package com.example.aditya.loginreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton register;
    private EditText name1 ,mobile1,email1,password1,passcheck1;
    private String name,mobile,email,password,passcheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = (EditText)findViewById(R.id.name);
        mobile1 = (EditText)findViewById(R.id.mobile);
        email1 = (EditText)findViewById(R.id.email);
        password1 = (EditText)findViewById(R.id.password);
        passcheck1 = (EditText)findViewById(R.id.passcheck);
        register = (ImageButton) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ini();
            }
        });
    }
    public void ini(){
        registeration();
        validate();
    }
    public void registeration(){
        name=name1.getText().toString().trim();
        email = email1.getText().toString().trim();
        mobile = mobile1.getText().toString().trim();
        password = password1.getText().toString().trim();
        passcheck = passcheck1.getText().toString().trim();
    }
    public void validate(){
        boolean value = true;
        if(name.isEmpty()||email.isEmpty()||mobile.isEmpty()||password.isEmpty()||passcheck.isEmpty()){
            Toast.makeText(this,"Fields Cannot Be Empty!",Toast.LENGTH_SHORT).show();
            value = false;
        }else if (!(password.equals(passcheck))){
            Toast.makeText(this,"Password Does Not Matched!",Toast.LENGTH_SHORT).show();
            value = false;
        }
        if(value){
            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
    }
}
