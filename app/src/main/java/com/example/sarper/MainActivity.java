package com.example.sarper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button ikincisayfayagec=(Button)findViewById(R.id.Breakfast);
        ikincisayfayagec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikincisayfagec=new Intent(MainActivity.this, chooseBreakfast.class);
                startActivity(ikincisayfagec);

            }
        });
        Button lunch=(Button)findViewById(R.id.Lunch);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lunch=new Intent(MainActivity.this,chooseLunch.class);
                startActivity(lunch);

            }
        });
        Button dinner=(Button)findViewById(R.id.Dinner);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dinner=new Intent(MainActivity.this,chooseDinner.class);
                startActivity(dinner);

            }
        });


    }
}