package com.example.suivieparenatl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Login extends AppCompatActivity {


    ImageButton back ;
    Button login;

    TextView signup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        back = findViewById(R.id.back);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Login.this, Mainparent.class);
                startActivity(intent);
            }
        });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new signup1();
                FragmentTransaction  fragmenttansaction = getSupportFragmentManager().beginTransaction();
                fragmenttansaction.replace(R.id.loginmain,fragment).commit();
            }
        });
    }
}