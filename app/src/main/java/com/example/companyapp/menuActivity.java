package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menuActivity extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        b1=(Button) findViewById(R.id.addbutt);
        b2=(Button) findViewById(R.id.searchbutt);
        b3=(Button) findViewById(R.id.logoutbutt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplication(),addActivity.class);
                startActivity(ob);
            }
        });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent ob1=new Intent(getApplication(),searchActivity.class);
                 startActivity(ob1);
             }
         });

         b3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent ob2=new Intent(getApplication(),MainActivity.class);
                 startActivity(ob2);
             }
         });

    }
}