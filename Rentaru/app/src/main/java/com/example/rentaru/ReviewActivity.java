package com.example.rentaru;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ReviewActivity extends AppCompatActivity {
WebView web;
Button submitbtn;
AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        //to hide top bar
        getSupportActionBar().hide();

        //Web view
        web=(WebView) findViewById(R.id.web);
        web.loadUrl("https://www.google.com/");

        //Alert box
        submitbtn = findViewById(R.id.submit_btn);
        builder =new AlertDialog.Builder(this);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("Rentaru")
                        .setMessage("Thanks for rating us!!")
                        .setCancelable(true)
                        .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }).show();

            }
        });
    }

    public void change_activity(View view) {
        Intent i_reg = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(i_reg);
    }
}