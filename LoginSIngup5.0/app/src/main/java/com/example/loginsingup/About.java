package com.example.loginsingup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {
    TextView linked1,linked2,git1,git2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        linked1 =  findViewById(R.id.linked1);
        linked2 =  findViewById(R.id.linked2);
        git1 =  findViewById(R.id.git1);
        git2 =  findViewById(R.id.git2);




        linked1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.linkedin.com/in/fahad-islam-b96a81241/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });







        git1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://github.com/Fahaddada47";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        git2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://github.com/Shoeb1989";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });




        linked2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.linkedin.com/in/shoebsikder/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



    }
}