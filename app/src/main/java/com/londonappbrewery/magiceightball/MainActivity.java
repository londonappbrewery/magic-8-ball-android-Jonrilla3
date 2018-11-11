package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button PushButton;
       PushButton = (Button) findViewById(R.id.askButton);

       final ImageView Ball = (ImageView) findViewById(R.id.image_eightBall);
       final int[] BallArray = {
               R.drawable.ball1,
               R.drawable.ball2,
               R.drawable.ball3,
               R.drawable.ball4,
               R.drawable.ball5
       };

       PushButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Random randomNumber = new Random();
               int Number = randomNumber.nextInt(5);

               Ball.setImageResource(BallArray[Number]);
           }
       });

    }

}