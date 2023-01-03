package com.example.sarper;



import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import java.util.ArrayList;
public class chooseLunch extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunch_choose);

        Button fatLunch=(Button)findViewById(R.id.fatBreakfast);
        fatLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fatLunch=new Intent(chooseLunch.this,chooseFatHeavyForLunch.class);
                startActivity(fatLunch);

            }
        });
        Button carboLunch=(Button)findViewById(R.id.CarboBreakfast);
        carboLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carboLunch=new Intent(chooseLunch.this,chooseCarboForLunch.class);
                startActivity(carboLunch);

            }
        });
        Button proteinLunch=(Button)findViewById(R.id.proteinBreakfast);
        proteinLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proteinLunch=new Intent(chooseLunch.this,chooseCarboForLunch.class);
                startActivity(proteinLunch);

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