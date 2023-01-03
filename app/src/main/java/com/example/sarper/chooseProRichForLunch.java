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

public class chooseProRichForLunch extends AppCompatActivity {

    Button btn_21,btn_22,btn_23,btn_24,btn_click6;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prorichforlunch);
        btn_21=(Button)findViewById(R.id.btn_21);
        btn_22=(Button)findViewById(R.id.btn_22);
        btn_23=(Button)findViewById(R.id.btn_23);
        btn_24=(Button)findViewById(R.id.btn_24);

        btn_click6=(Button)findViewById(R.id.btn_pickMeal6);
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
                ClickRandomButton(btn_21);
                btn_21.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_22);
                btn_22.performClick();

                break;
            case 2:
                ClickRandomButton(btn_23);
                btn_23.performClick();
                break;
            case 3:
                ClickRandomButton(btn_24);
                btn_24.performClick();
                break;
        }

    }
    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (btn==btn_21){
                    Intent btn=new Intent(chooseProRichForLunch.this, choosenProteinMeal1ForLunch.class);
                    startActivity(btn);}
                if (btn==btn_22){
                    Intent btn=new Intent(chooseProRichForLunch.this, choosenProteinMeal2ForLunch.class);
                    startActivity(btn);

                }
                if (btn==btn_23){
                    Intent btn=new Intent(chooseProRichForLunch.this, choosenProteinMeal3ForLunch.class);
                    startActivity(btn);

                }
                if (btn==btn_24){
                    Intent btn=new Intent(chooseProRichForLunch.this, choosenProteinMeal4ForLunch.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }
}