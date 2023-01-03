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

public class chooseProRichForBreakfast extends AppCompatActivity {

    Button btn_13,btn_14,btn_15,btn_16,btn_click4;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prorichforbreakfast);
        btn_13=(Button)findViewById(R.id.btn_13);
        btn_14=(Button)findViewById(R.id.btn_14);
        btn_15=(Button)findViewById(R.id.btn_15);
        btn_16=(Button)findViewById(R.id.btn_16);

        btn_click4=(Button)findViewById(R.id.btn_pickMeal4);
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
                ClickRandomButton(btn_13);
                btn_13.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_14);
                btn_14.performClick();

                break;
            case 2:
                ClickRandomButton(btn_15);
                btn_15.performClick();
                break;
            case 3:
                ClickRandomButton(btn_16);
                btn_16.performClick();
                break;
        }

    }
    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (btn==btn_13){
                    Intent btn=new Intent(chooseProRichForBreakfast.this, choosenProteinMeal1ForBreakfast.class);
                    startActivity(btn);}
                if (btn==btn_14){
                    Intent btn=new Intent(chooseProRichForBreakfast.this, choosenProteinMeal2ForBreakfast.class);
                    startActivity(btn);

                }
                if (btn==btn_15){
                    Intent btn=new Intent(chooseProRichForBreakfast.this, choosenProteinMeal3ForBreakfast.class);
                    startActivity(btn);

                }
                if (btn==btn_16){
                    Intent btn=new Intent(chooseProRichForBreakfast.this, choosenProteinMeal4ForBreakfast.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }
}