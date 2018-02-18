package com.example.asus.sriwulandari_1202150268_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void buttonPemesan(View view){
        startActivity(new Intent(TakeAway.this,DaftarMenu.class));
        finish();

    }
}
