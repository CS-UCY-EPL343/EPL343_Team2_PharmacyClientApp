package com.example.ioann.contact;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ActivityContact extends AppCompatActivity {

    private ImageView facebookbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_activity_main);

        facebookbutton =(ImageView) findViewById(R.id.facebook1);
        facebookbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openfb();
            }
        });
        ImageButton map = (ImageButton) findViewById(R.id.xartis);
       map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openmap();
            }
        });
    }
    public void openfb () {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/%CE%A6%CE%B1%CF%81%CE%BC%CE%B1%CE%BA%CE%B5%CE%AF%CE%BF-%CE%93%CE%B5%CF%89%CF%81%CE%B3%CE%AF%CE%B1-%CE%93%CE%B5%CF%89%CF%81%CE%B3%CE%AF%CE%BF%CF%85-1634633696810798/"));
        startActivity(browserIntent);

    }
    public void openmap () {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%CE%9A%CF%85%CF%81%CE%B9%CE%AC%CE%BA%CE%BF%CF%85+%CE%9C%CE%AC%CF%84%CF%83%CE%B7,+%CE%91%CF%81%CE%B1%CE%B4%CE%AF%CF%80%CF%80%CE%BF%CF%85,+%CE%9A%CF%8D%CF%80%CF%81%CE%BF%CF%82/@34.9410208,33.5983345,17z/data=!3m1!4b1!4m5!3m4!1s0x14de27f26c555459:0x5e95a7c1a6bdf23a!8m2!3d34.9410164!4d33.6005232"));
        startActivity(browserIntent);
    }


}
