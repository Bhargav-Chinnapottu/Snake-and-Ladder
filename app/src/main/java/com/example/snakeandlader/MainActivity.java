package com.example.snakeandlader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] myDices={
        R.drawable.five,
                R.drawable.four,
                R.drawable.one,
                R.drawable.six,
                R.drawable.three,
                R.drawable.two
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollTapped(View view) {

        Random ran=new Random();
        int Randomnumber=ran.nextInt(6);
        ImageView dice=(ImageView)findViewById(R.id.dice);
        dice.setImageResource(myDices[Randomnumber]);

    }
}