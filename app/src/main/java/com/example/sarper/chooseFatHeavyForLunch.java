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

public class chooseFatHeavyForLunch extends AppCompatActivity {

    Button btn_5,btn_6,btn_7,btn_8,btn_click2;

    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fatheavyforlunch);
        btn_5=(Button)findViewById(R.id.btn_5);
        btn_6=(Button)findViewById(R.id.btn_6);
        btn_7=(Button)findViewById(R.id.btn_7);
        btn_8=(Button)findViewById(R.id.btn_8);

        btn_click2=(Button) findViewById(R.id.btn_pickMeal2);

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
                ClickRandomButton(btn_5);
                btn_5.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_6);
                btn_6.performClick();

                break;
            case 2:
                ClickRandomButton(btn_7);
                btn_7.performClick();
                break;
            case 3:
                ClickRandomButton(btn_8);
                btn_8.performClick();
                break;
        }

    }
    public void ClickRandomButton(Button btn2)
    {

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btn2.setText("heyyo");
                if (btn2==btn_5){
                    Intent btn2=new Intent(chooseFatHeavyForLunch.this, choosenFatHeavyMeal1ForLunch.class);
                    startActivity(btn2);}
                if (btn2==btn_6){
                    Intent btn2=new Intent(chooseFatHeavyForLunch.this, choosenFatHeavyMeal2ForLunch.class);
                    startActivity(btn2);

                }
                if (btn2==btn_7){
                    Intent btn2=new Intent(chooseFatHeavyForLunch.this, choosenFatHeavyMeal3ForLunch.class);
                    startActivity(btn2);

                }
                if (btn2==btn_8){
                    Intent btn2=new Intent(chooseFatHeavyForLunch.this, choosenFatHeavyMeal4ForLunch.class);
                    startActivity(btn2);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }

}