package com.scannella.quarter3final;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //final Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnClick);

        final MediaPlayer play = MediaPlayer.create(this,R.raw.exclamation);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Display display = getWindowManager().getDefaultDisplay();


                //int newX = new Random().nextInt(metrics.heightPixels - 50);     //number from 0-
                //int newY = new Random().nextInt(metrics.widthPixels - 50);

                //int newX = (int)(Math.random() * display.getWidth() + 1);
                //int newY = (int)(Math.random() * display.getHeight() + 1);


                //button.setX();
                //button.setY();


                play.start();

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.itmSettings) {

            Intent intent = new Intent(MainActivity.this, Settings.class);
            startActivity(intent);

        }



        return super.onOptionsItemSelected(item);
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
