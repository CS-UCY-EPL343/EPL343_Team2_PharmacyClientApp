package com.example.panta.farmakio_client;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class CalendarActivity extends MainActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Button appointmentPhase1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        appointmentPhase1=(Button)findViewById(R.id.appointment);
        appointmentPhase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppointmentPhase1();
            }
        });


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView =  findViewById(R.id.nav_view);
       navigationView.setNavigationItemSelectedListener(this);
    }

    public void openAppointmentPhase1(){
        Intent intent = new Intent(this,appointment1.class);
        startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.home_page:
                Toast.makeText(this,"Home page !!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.calendar:
                Toast.makeText(this,"Calendar",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this, CalendarActivity.class);
                startActivity(intent);
                break;
            case R.id.product:
                Toast.makeText(this,"Product",Toast.LENGTH_SHORT).show();
                break;
            case R.id.services:
                Toast.makeText(this,"Services",Toast.LENGTH_SHORT).show();
                break;
            case R.id.communication:
                Toast.makeText(this,"Communication",Toast.LENGTH_SHORT).show();
                break;
            case R.id.chat:
                Toast.makeText(this,"Chat",Toast.LENGTH_SHORT).show();
                break;
            case R.id.overnight_pharmacies:
                Toast.makeText(this,"Overnight Pharmacies",Toast.LENGTH_SHORT).show();
                break;

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        switch(item.getItemId()){
            case R.id.cart:
                Toast.makeText(this,"Cart",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_account:
                Toast.makeText(this,"Account",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_language:
                Toast.makeText(this,"Language",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
