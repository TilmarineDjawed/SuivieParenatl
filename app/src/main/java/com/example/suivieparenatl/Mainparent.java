package com.example.suivieparenatl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Mainparent extends AppCompatActivity {

    CardView homework;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mainparent);
        homework = findViewById(R.id.contributeCard1);
        homework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new signup1();
                FragmentTransaction fragmenttansaction = getSupportFragmentManager().beginTransaction();
                fragmenttansaction.replace(R.id.main,fragment).commit();
            }
        });



    }
}