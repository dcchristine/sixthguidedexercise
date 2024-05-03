package com.example.sixthguidedexercise;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox red,yellow,blue;
    TextView title;
    Button enter,clear,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.redChk);
        yellow = findViewById(R.id.yellowChk);
        blue= findViewById(R.id.blueChk);
        title=findViewById(R.id.titleTxt);
        enter=findViewById(R.id.enterBtn);
        clear=findViewById(R.id.clearBtn);
        exit=findViewById(R.id.exitBtn);

        showResult();

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red.setChecked(false);
                yellow.setChecked(false);
                blue.setChecked(false);

                title.setText("Checkbox and TextColor");  // Set text to empty string
                title.setTextColor(Color.BLACK);  // Set text color to black
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);  // Set background to white
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void showResult(){
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yellow.isChecked() && blue.isChecked() && red.isChecked()) {
                    title.setTextColor(Color.parseColor("#282921"));
                    title.setText("The color selected is BROWN");
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#282921"));
                } else if (red.isChecked() && yellow.isChecked()) {
                    title.setTextColor(Color.parseColor("#FFA500"));
                    title.setText("The color selected is ORANGE");
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFA500"));
                } else if (red.isChecked() && blue.isChecked()) {
                    title.setTextColor(Color.parseColor("#7F00FF"));
                    title.setText("The color selected is VIOLET");
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#7F00FF"));
                } else if (yellow.isChecked() && blue.isChecked()) {
                    title.setTextColor(Color.parseColor("#8A9A5B"));
                    title.setText("The color selected is GREEN");
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#8A9A5B"));
                }  else if(red.isChecked()){
                    title.setTextColor(Color.RED);
                    title.setText("The color selected is RED");
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                } else if (yellow.isChecked()) {
                    title.setTextColor(Color.YELLOW);
                    title.setText("The color selected is YELLOW");
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                } else if (blue.isChecked()) {
                    title.setTextColor(Color.BLUE);
                    title.setText("The color selected is BLUE");
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}
