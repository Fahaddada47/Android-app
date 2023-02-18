package com.example.loginsingup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    TextView match_1,match_2,match_3,match_4,match_5,match_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        match_1 = findViewById(R.id.match_1);
        match_2 = findViewById(R.id.match_2);
        match_3 = findViewById(R.id.match_3);
        match_4 = findViewById(R.id.match_4);
        match_5 = findViewById(R.id.match_5);
        match_6 = findViewById(R.id.match_6);


        nav = findViewById(R.id.navmenu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);


        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        match_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this,MainActivity1.class);
                startActivity(send);
            }
        });
 match_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(send);
            }
        });
 match_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(send);
            }
        });
 match_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(send);
            }
        });
 match_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(send);
            }
        });

 match_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(send);
            }
        });








        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()){
                    case R.id.menu_home:
                        Toast.makeText(getApplicationContext(),"Home", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;


                    case R.id.menu_logout:logout:
                        Toast.makeText(getApplicationContext(),"Loging Out", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                }

                return true;
            }
        });

        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.fil2,null));
        imageList.add(new SlideModel(R.drawable.fil3,null));
        imageList.add(new SlideModel(R.drawable.fil4,null));
        imageList.add(new SlideModel(R.drawable.fil5,null));
        imageList.add(new SlideModel(R.drawable.fil6,null));

        imageSlider.setImageList(imageList);

    }

    public void logout(MenuItem item) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);

        }


    public void ticket(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), Listofcandidates.class);
        startActivity(intent);
    }




    public void About(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), About.class);
        startActivity(intent);
    }
}