package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1;
    String getName,getPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.username);
        et2=(EditText) findViewById(R.id.password);
        b1=(Button) findViewById(R.id.loginbutt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=et1.getText().toString();
                getPass=et2.getText().toString();

                if(getName.equals("admin")&&
                getPass.equals("1234")){
                    Intent ob=new Intent(getApplication(),menuActivity.class);
                    startActivity(ob);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();;
                }
            }
        });
    }
}