package com.example.panta.farmakio_client;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private ImageView prosfora1,prosfora2,prosfora3,prosfora4,prosfora5,prosfora6;
    private ImageView epoxiako1,epoxiako2,epoxiako3,epoxiako4,epoxiako5,epoxiako6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

       // Toolbar toolbar= findViewById(R.id.app_bar);

       prosfora1=(ImageView)findViewById(R.id.prosfora1);
        prosfora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProsfora1();
            }
        });
        prosfora2=(ImageView)findViewById(R.id.prosfora2);
        prosfora2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProsfora2();
            }
        });
        prosfora3=(ImageView)findViewById(R.id.prosfora3);
        prosfora3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProsfora3();
            }
        });
        prosfora4=(ImageView)findViewById(R.id.prosfora4);
        prosfora4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProsfora4();
            }
        });
        prosfora5=(ImageView)findViewById(R.id.prosfora5);
        prosfora5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProsfora5();
            }
        });
        prosfora6=(ImageView)findViewById(R.id.prosfora6);
        prosfora6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProsfora6();
            }
        });

       epoxiako1=(ImageView)findViewById(R.id.epoxiako1);
        epoxiako1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpoxiako1();
            }
        });
        epoxiako2=(ImageView)findViewById(R.id.epoxiako2);
        epoxiako2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpoxiako2();
            }
        });
        epoxiako3=(ImageView)findViewById(R.id.epoxiako3);
        epoxiako3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpoxiako3();
            }
        });
        epoxiako4=(ImageView)findViewById(R.id.epoxiako4);
        epoxiako4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpoxiako4();
            }
        });
        epoxiako5=(ImageView)findViewById(R.id.epoxiako5);
        epoxiako5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpoxiako5();
            }
        });
        epoxiako6=(ImageView)findViewById(R.id.epoxiako6);
        epoxiako6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpoxiako6();
            }
        });

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


    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void openProsfora1(){
        Intent intent = new Intent(this,prosfora1.class);
        startActivity(intent);
    }
    public void openProsfora2(){
        Intent intent = new Intent(this,prosfora2.class);
        startActivity(intent);
    }


    public void openProsfora3(){
        Intent intent = new Intent(this,prosfora3.class);
        startActivity(intent);
    }public void openProsfora4(){
        Intent intent = new Intent(this,prosfora4.class);
        startActivity(intent);
    }
    public void openProsfora5(){
        Intent intent = new Intent(this,prosfora5.class);
        startActivity(intent);
    }
    public void openProsfora6(){
        Intent intent = new Intent(this,prosfora6.class);
        startActivity(intent);
    }
    public void openEpoxiako1(){
        Intent intent = new Intent(this,epoxiako1.class);
        startActivity(intent);
    }
    public void openEpoxiako2(){
        Intent intent = new Intent(this,epoxiako2.class);
        startActivity(intent);
    }
    public void openEpoxiako3(){
        Intent intent = new Intent(this,epoxiako3.class);
        startActivity(intent);
    }
    public void openEpoxiako4(){
        Intent intent = new Intent(this,epoxiako4.class);
        startActivity(intent);
    }
    public void openEpoxiako5(){
        Intent intent = new Intent(this,epoxiako5.class);
        startActivity(intent);
    }
    public void openEpoxiako6(){
        Intent intent = new Intent(this,epoxiako6.class);
        startActivity(intent);
    }
}
