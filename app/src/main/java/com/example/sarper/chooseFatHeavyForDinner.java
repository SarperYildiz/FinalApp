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

public class chooseFatHeavyForDinner extends AppCompatActivity {

    Button btn_25,btn_26,btn_27,btn_28,btn_click7;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fatheavyfordinner);
        btn_25=(Button)findViewById(R.id.btn_25);
        btn_26=(Button)findViewById(R.id.btn_26);
        btn_27=(Button)findViewById(R.id.btn_27);
        btn_28=(Button)findViewById(R.id.btn_28);

        btn_click7=(Button)findViewById(R.id.btn_pickMeal7);

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
                ClickRandomButton(btn_25);
                btn_25.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_26);
                btn_26.performClick();

                break;
            case 2:
                ClickRandomButton(btn_27);
                btn_27.performClick();
                break;
            case 3:
                ClickRandomButton(btn_28);
                btn_28.performClick();
                break;
        }

    }

    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (btn==btn_25){
                    Intent btn=new Intent(chooseFatHeavyForDinner.this, choosenFatHeavyMeal1ForDinner.class);
                    startActivity(btn);}
                if (btn==btn_26){
                    Intent btn=new Intent(chooseFatHeavyForDinner.this, choosenFatHeavyMeal2ForDinner.class);
                    startActivity(btn);

                }
                if (btn==btn_27){
                    Intent btn=new Intent(chooseFatHeavyForDinner.this, choosenFatHeavyMeal3ForDinner.class);
                    startActivity(btn);

                }
                if (btn==btn_28){
                    Intent btn=new Intent(chooseFatHeavyForDinner.this, choosenFatHeavyMeal4ForDinner.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }



}