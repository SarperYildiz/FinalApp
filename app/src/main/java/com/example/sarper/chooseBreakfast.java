package com.example.sarper;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class chooseBreakfast extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast_choose);

        Button fatBreakfast=(Button)findViewById(R.id.fatBreakfast);
        fatBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fatBreakfast=new Intent(chooseBreakfast.this,chooseFatHeavyForBreakfast.class);
                startActivity(fatBreakfast);

            }
        });
        Button proBreakfast=(Button)findViewById(R.id.proteinBreakfast);
        proBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proBreakfast=new Intent(chooseBreakfast.this,chooseProRichForBreakfast.class);
                startActivity(proBreakfast);

            }
        });
        Button carboBreakfast=(Button)findViewById(R.id.CarboBreakfast);
        carboBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carboBreakfast=new Intent(chooseBreakfast.this,chooseCarboForBreakfast.class);
                startActivity(carboBreakfast);

            }
        });



    }
    @Override
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