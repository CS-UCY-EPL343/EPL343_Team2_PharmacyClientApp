package com.example.panta.farmakio_client;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class appointment1 extends AppCompatActivity {
    private Button appointmentPhase2;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment1);


        appointmentPhase2=(Button)findViewById(R.id.sendRequest);
        appointmentPhase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppointmentPhase2();
            }
        });


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView =  findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);
    }
    public void openAppointmentPhase2(){
        Intent intent = new Intent(this,appointmenPhase2.class);
        startActivity(intent);
    }
}
