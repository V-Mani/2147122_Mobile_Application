package com.example.rentaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        getSupportActionBar().hide();
    }

    public void btn_action(View view) {
        switch (view.getId()){
            case R.id.map_btn:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jl.+Gombel+Permai+V,+Ngesrep,+Kec.+Banyumanik,+Kota+Semarang,+Jawa+Tengah+50261/@-7.0366459,110.4246365,507m/data=!3m1!1e3!4m5!3m4!1s0x2e708bf52e8b8c55:0x54d0a23e4a2ad47b!8m2!3d-7.0368474!4d110.4247197?hl=id"));
                startActivity(i1);
                break;

            case R.id.phone_btn:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+919876543210"));
                startActivity(i2);
                break;

            case R.id.mail_btn:
                Intent i3 = new Intent(Intent.ACTION_SEND);
                i3.setType("plain/text");
                i3.putExtra(Intent.EXTRA_EMAIL, new String[] { "mani.bharathy@mca.christuniversity.in" });
                i3.putExtra(Intent.EXTRA_SUBJECT, "");
                i3.putExtra(Intent.EXTRA_TEXT, "");
                startActivity(Intent.createChooser(i3, "Email me :)"));
                break;
        }
    }
}