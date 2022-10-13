package com.arstudio.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyFirstApp2 extends AppCompatActivity {
    private TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_app2);

        tampil = findViewById(R.id.tampilkan);

        Intent terima = getIntent();
        String terimanama = terima.getStringExtra("amplopuser");

        tampil.setText(terimanama);
    }
}