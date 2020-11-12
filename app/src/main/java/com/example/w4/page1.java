package com.example.w4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sw(View view){
        DecimalFormat nf = new DecimalFormat("0");
        EditText distance1 =(EditText) findViewById(R.id.editTextTextPersonName);
        EditText price1 =(EditText) findViewById(R.id.editTextTextPersonName2);
        EditText Total_distance =(EditText) findViewById(R.id.editTextTextPersonName3);
        TextView result_TV =(TextView) findViewById(R.id.textView7);

        double  distance = Double.parseDouble(distance1.getText().toString());
        double  price = Double.parseDouble(price1.getText().toString());
        double  Total = Double.parseDouble(Total_distance.getText().toString());

        double C = Math.ceil(Total/distance)* price + 75 ;

        result_TV.setText(C+"元");

    }
}