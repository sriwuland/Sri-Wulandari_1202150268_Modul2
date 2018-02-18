package com.example.asus.sriwulandari_1202150268_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.BreakIterator;

public class DineIn extends AppCompatActivity {

    Spinner spinn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        setTitle("Dine In");
        spinn = findViewById(R.id.spinner);
    }

    public void pilihPesanan(View view) {
        Toast.makeText(DineIn.this, spinn.getSelectedItem().toString() + " dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DineIn.this,DaftarMenu.class));
        finish();
    }
}
