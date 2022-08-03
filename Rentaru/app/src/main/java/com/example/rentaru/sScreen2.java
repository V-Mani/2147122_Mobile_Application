package com.example.rentaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class sScreen2 extends AppCompatActivity {
    private Thread run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sscreen2);
        getSupportActionBar().hide();

        Thread thread = new  Thread(){
            public void run(){

                try {
                    sleep (4000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(sScreen2.this,LoginActivity.class);
                    startActivity(i);
                }
            }
        };thread.start();
    }
}