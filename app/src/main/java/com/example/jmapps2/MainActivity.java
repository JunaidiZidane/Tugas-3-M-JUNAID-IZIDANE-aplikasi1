package com.example.jmapps2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jmapps.RumahSakit;

public class MainActivity extends AppCompatActivity {

    private Intent x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indexhome);
    }

    public void clickRumahSakit (View view) {
        //ketika anda mengklik Pict Rumah Sakit
        Intent x = new Intent(this, RumahSakit.class);
        startActivity(x);
    }
}