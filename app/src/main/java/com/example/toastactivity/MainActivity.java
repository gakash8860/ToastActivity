package com.example.toastactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b;
    ImageButton ib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button2);
        ib=findViewById(R.id.imageButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Simple Toast", Toast.LENGTH_SHORT).show();
            }
        });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
            }
        });

    } void fun(){
        View view = getLayoutInflater().inflate(R.layout.customlayout,(ViewGroup)findViewById(R.id.custoast));
        ImageView i;
        i=view.findViewById(R.id.imageView);
        Random rn = new Random();
        int max=6,min=1;
        int num=rn.nextInt(max-min)+min;
        switch (num){
            case 0 : i.setImageDrawable(getDrawable(R.drawable.burger));break;
            case 1 : i.setImageDrawable(getDrawable(R.drawable.chilli));break;
            case 2 : i.setImageDrawable(getDrawable(R.drawable.chole));break;
            case 3 : i.setImageDrawable(getDrawable(R.drawable.dahi));break;
            case 4 : i.setImageDrawable(getDrawable(R.drawable.lassi));break;
            case 5 : i.setImageDrawable(getDrawable(R.drawable.pani));break;

        } Toast t = new Toast(MainActivity.this);
        t.setDuration(Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER_VERTICAL,0,0);
        t.setView(view);
        t.show();
    }

}