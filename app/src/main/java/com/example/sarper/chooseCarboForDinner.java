package com.example.sarper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import java.util.Random;

public class chooseCarboForDinner extends AppCompatActivity {

    Button btn_29,btn_30,btn_31,btn_32,btn_click8;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carbofordinner);
        btn_29=(Button)findViewById(R.id.btn_29);
        btn_30=(Button)findViewById(R.id.btn_30);
        btn_31=(Button)findViewById(R.id.btn_31);
        btn_32=(Button)findViewById(R.id.btn_32);

        btn_click8=(Button)findViewById(R.id.btn_pickMeal8);

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
                ClickRandomButton(btn_29);
                btn_29.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_30);
                btn_30.performClick();

                break;
            case 2:
                ClickRandomButton(btn_31);
                btn_31.performClick();
                break;
            case 3:
                ClickRandomButton(btn_32);
                btn_32.performClick();
                break;
        }

    }

    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btn.setText("heyyo");
                if (btn==btn_29){
                    Intent btn=new Intent(chooseCarboForDinner.this, choosenCarboMeal1ForDinner.class);
                    startActivity(btn);}
                if (btn==btn_30){
                    Intent btn=new Intent(chooseCarboForDinner.this, choosenCarboMeal2ForDinner.class);
                    startActivity(btn);

                }
                if (btn==btn_31){
                    Intent btn=new Intent(chooseCarboForDinner.this, choosenCarboMeal3ForDinner.class);
                    startActivity(btn);

                }
                if (btn==btn_32){
                    Intent btn=new Intent(chooseCarboForDinner.this, choosenCarboMeal4ForDinner.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }



}