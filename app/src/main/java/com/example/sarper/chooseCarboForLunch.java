package com.example.sarper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import java.util.Random;

public class chooseCarboForLunch extends AppCompatActivity {

    Button btn_17,btn_18,btn_19,btn_20,btn_click5;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carbolunch);
        btn_17=(Button)findViewById(R.id.btn_17);
        btn_18=(Button)findViewById(R.id.btn_18);
        btn_19=(Button)findViewById(R.id.btn_19);
        btn_20=(Button)findViewById(R.id.btn_20);

        btn_click5=(Button)findViewById(R.id.btn_pickMeal5);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void click_pickMeal(View view)
    {
        //random bir sayı seçer
        Random random=new Random();
        int number=random.nextInt(4);

        System.out.println(number);

        //seçtiği random sayı ile button seçme
        switch (number)
        {

            //seçilen butona tıkla
            case 0:
                ClickRandomButton(btn_17);
                btn_17.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_18);
                btn_18.performClick();

                break;
            case 2:
                ClickRandomButton(btn_19);
                btn_19.performClick();
                break;
            case 3:
                ClickRandomButton(btn_20);
                btn_20.performClick();
                break;
        }

    }
    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (btn==btn_17){
                    Intent btn=new Intent(chooseCarboForLunch.this, choosenCarboMeal1ForLunch.class);
                    startActivity(btn);}
                if (btn==btn_18){
                    Intent btn=new Intent(chooseCarboForLunch.this, choosenCarboMeal2ForLunch.class);
                    startActivity(btn);

                }
                if (btn==btn_19){
                    Intent btn=new Intent(chooseCarboForLunch.this, choosenCarboMeal3ForLunch.class);
                    startActivity(btn);

                }
                if (btn==btn_20){
                    Intent btn=new Intent(chooseCarboForLunch.this, choosenCarboMeal4ForLunch.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }
}