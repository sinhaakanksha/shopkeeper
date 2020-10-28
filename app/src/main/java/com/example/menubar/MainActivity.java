package com.example.menubar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button catalog, manage;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= findViewById(R.id.toolbar);
        catalog = (Button) findViewById(R.id.catalog);

        catalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Catint = new Intent(MainActivity.this, catalog.class);
                startActivity(Catint);

            }
        });




        setSupportActionBar(toolbar);
    }
}