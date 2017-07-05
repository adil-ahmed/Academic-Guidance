package com.example.adil.academic_guidance;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class LauncherPage extends AppCompatActivity{

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    //private View fullColorView, halfalphaColorView, //alphaColorView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_page);
        //alphaColorView = (View) findViewById(R.id.alphaColorView);









        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(getApplicationContext(), HomePage.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();



    }


    }





