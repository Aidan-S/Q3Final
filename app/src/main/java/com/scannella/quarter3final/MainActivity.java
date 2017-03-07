package com.scannella.quarter3final;

import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //final Handler handler = new Handler();
    Display display = getWindowManager().getDefaultDisplay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnClick);

        Point size = new Point();
        display.getSize(size);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                //int newX = new Random().nextInt(metrics.heightPixels - 50);     //number from 0-
                //int newY = new Random().nextInt(metrics.widthPixels - 50);

                int newX = (int)(Math.random() * display.getWidth() + 1);
                int newY = (int)(Math.random() * display.getHeight() + 1);


                button.setX(newX);
                button.setY(newY);
            }
        });


        /*handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                *//*Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);*//*

            }
        }, 5000);*/


    }

    /*private void setButtonRandomPosition(Button button){
        int newX = new Random().nextInt(getDisplaySize(this).x);     //number from 0-
        int newY = new Random().nextInt(getDisplaySize(this).y);

        button.setX(newX);
        button.setY(newY);
    }*/

    /*private void startRandomButton(Button button) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                setButtonRandomPosition(button);
            }
        }, 0, 1000);//Update button every second
    }

*/


}
