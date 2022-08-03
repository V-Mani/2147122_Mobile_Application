package com.example.rentaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

    }

    public void loggedin(View v) {
        Intent intent_home = new Intent(this,MainActivity.class);
        EditText usName = (EditText) findViewById(R.id.User_Name);
        String username = usName.getText().toString();
        intent_home.putExtra("UserName",username);
        startActivity(intent_home);
        finish();
    }

    public void reg_in(View view) {
        Intent i_reg = new Intent(this,RegisterActivity.class);
        startActivity(i_reg);
        finish();
    }
}