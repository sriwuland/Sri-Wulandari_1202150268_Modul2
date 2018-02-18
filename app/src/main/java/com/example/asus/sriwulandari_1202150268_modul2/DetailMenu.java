package com.example.asus.sriwulandari_1202150268_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    ImageView gambarr;
    TextView nama, harga, komposisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        setTitle("Detail Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gambarr = findViewById(R.id.foto);
        nama = findViewById(R.id.detailnama);
        komposisi = findViewById(R.id.detailkomposisi);
        harga = findViewById(R.id.detailhargamenu);

        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
        nama.setText(getIntent().getStringExtra("nama"));
        gambarr.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));
    }
}
