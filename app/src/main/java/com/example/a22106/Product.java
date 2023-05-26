package com.example.a22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Product extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        button = findViewById(R.id.button5);
        button.setOnClickListener(this);
        button = findViewById(R.id.button4);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button5){
            startActivity(new Intent(this, backet.class));
        }
        if(v.getId()==R.id.button4){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 55.56754523, 88.45645343")));
        }

    }

}