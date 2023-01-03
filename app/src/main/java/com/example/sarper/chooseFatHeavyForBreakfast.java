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

public class chooseFatHeavyForBreakfast extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_click;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fatheavyforbreakfast);
        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
        btn_4=(Button)findViewById(R.id.btn_4);

        btn_click=(Button)findViewById(R.id.btn_pickMeal);

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
                ClickRandomButton(btn_1);
                btn_1.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_2);
                btn_2.performClick();

                break;
            case 2:
                ClickRandomButton(btn_3);
                btn_3.performClick();
                break;
            case 3:
                ClickRandomButton(btn_4);
                btn_4.performClick();
                break;
        }

    }

    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btn.setText("heyyo");
                if (btn==btn_1){
                Intent btn=new Intent(chooseFatHeavyForBreakfast.this, choosenFatHeavyMeal1ForBreakfast.class);
                startActivity(btn);}
                if (btn==btn_2){
                    Intent btn=new Intent(chooseFatHeavyForBreakfast.this, choosenFatHeavyMeal2ForBreakfast.class);
                    startActivity(btn);

                }
                if (btn==btn_3){
                    Intent btn=new Intent(chooseFatHeavyForBreakfast.this, choosenFatHeavyMeal3ForBreakfast.class);
                    startActivity(btn);

                }
                if (btn==btn_4){
                    Intent btn=new Intent(chooseFatHeavyForBreakfast.this, choosenFatHeavyMeal4ForBreakfast.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }



}