package com.example.menubar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class save extends AppCompatActivity {
    private Button confirm, addmore;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        addmore = (Button) findViewById(R.id.addmore);
        addmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addmoretint = new Intent(save.this, Add_Product.class);
                startActivity(addmoretint);

            }
        });

    }
}