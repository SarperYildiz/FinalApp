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

public class chooseProRichForDinner extends AppCompatActivity {

    Button btn_33,btn_34,btn_35,btn_36,btn_click9;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prorichfordinner);
        btn_33=(Button)findViewById(R.id.btn_33);
        btn_34=(Button)findViewById(R.id.btn_34);
        btn_35=(Button)findViewById(R.id.btn_35);
        btn_36=(Button)findViewById(R.id.btn_36);

        btn_click9=(Button)findViewById(R.id.btn_pickMeal9);

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
                ClickRandomButton(btn_33);
                btn_33.performClick();
                break;
            case 1:
                //btn_2.performClick();
                ClickRandomButton(btn_34);
                btn_34.performClick();

                break;
            case 2:
                ClickRandomButton(btn_35);
                btn_35.performClick();
                break;
            case 3:
                ClickRandomButton(btn_36);
                btn_36.performClick();
                break;
        }

    }

    public void ClickRandomButton(Button btn)
    {

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                btn.setText("heyyo");
                if (btn==btn_33){
                    Intent btn=new Intent(chooseProRichForDinner.this, choosenProteinMeal1ForDinner.class);
                    startActivity(btn);}
                if (btn==btn_34){
                    Intent btn=new Intent(chooseProRichForDinner.this, choosenProteinMeal2ForDinner.class);
                    startActivity(btn);

                }
                if (btn==btn_35){
                    Intent btn=new Intent(chooseProRichForDinner.this, choosenProteinMeal3ForDinner.class);
                    startActivity(btn);

                }
                if (btn==btn_36){
                    Intent btn=new Intent(chooseProRichForDinner.this, choosenProteinMeal4ForDinner.class);
                    startActivity(btn);

                }


                //butona tıklandığında yapılması gereken neyse o

            }
        });
    }



}