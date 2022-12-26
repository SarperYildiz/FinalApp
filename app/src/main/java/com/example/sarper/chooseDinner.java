package com.example.sarper;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class chooseDinner extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinner_choose);



        Button carboDinner=(Button)findViewById(R.id.CarboBreakfast);
        carboDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carboDinner=new Intent(chooseDinner.this,chooseCarboForDinner.class);
                startActivity(carboDinner);

            }
        });
        Button proteinDinner=(Button)findViewById(R.id.proteinBreakfast);
        proteinDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proteinDinner=new Intent(chooseDinner.this,chooseProRichForDinner.class);
                startActivity(proteinDinner);

            }
        });
        Button fatDinner=(Button)findViewById(R.id.fatBreakfast);
        fatDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fatDinner=new Intent(chooseDinner.this,chooseFatHeavyForDinner.class);
                startActivity(fatDinner);

            }
        });



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
}