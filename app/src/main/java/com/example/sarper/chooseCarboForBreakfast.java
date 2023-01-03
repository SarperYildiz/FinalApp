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

public class chooseCarboForBreakfast extends AppCompatActivity {

    Button btn_9,btn_10,btn_11,btn_12,btn_click3;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carboforbreakfast);
        btn_9=(Button)findViewById(R.id.btn_9);
        btn_10=(Button)findViewById(R.id.btn_10);
        btn_11=(Button)findViewById(R.id.btn_11);
        btn_12=(Button)findViewById(R.id.btn_12);

        btn_click3=(Button)findViewById(R.id.btn_pickMeal3);
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
                ClickRandomButton(btn_9);
                btn_9.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_10);
                btn_10.performClick();

                break;
            case 2:
                ClickRandomButton(btn_11);
                btn_11.performClick();
                break;
            case 3:
                ClickRandomButton(btn_12);
                btn_12.performClick();
                break;
        }

    }
    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btn.setText("heyyo");
                if (btn==btn_9){
                    Intent btn=new Intent(chooseCarboForBreakfast.this, choosenCarboMeal1ForBreakfast.class);
                    startActivity(btn);}
                if (btn==btn_10){
                    Intent btn=new Intent(chooseCarboForBreakfast.this, choosenCarboMeal2ForBreakfast.class);
                    startActivity(btn);

                }
                if (btn==btn_11){
                    Intent btn=new Intent(chooseCarboForBreakfast.this, choosenCarboMeal3ForBreakfast.class);
                    startActivity(btn);

                }
                if (btn==btn_12){
                    Intent btn=new Intent(chooseCarboForBreakfast.this, choosenCarboMeal4ForBreakfast.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }
}