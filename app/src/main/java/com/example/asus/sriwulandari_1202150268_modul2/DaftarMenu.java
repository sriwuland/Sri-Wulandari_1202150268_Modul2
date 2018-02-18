package com.example.asus.sriwulandari_1202150268_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {
     RecyclerView rv;
    Adapter adapter;
    List<pilihanMenu> daftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        setTitle("Menu");

        daftarmenu = new ArrayList<>();
        rv = findViewById(R.id.daftarmenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        inidata();
    }

    private void inidata() {
        daftarmenu.add(new pilihanMenu(R.drawable.cheeseburger, "Cheeseburger", 25000, "Roti burger, daging sapi, keju, saus tomat, acar, potongan bawang dan mustard"));
        daftarmenu.add(new pilihanMenu(R.drawable.chicken_snack, "Chicken Snack", 13500, "Daging ayam renyah dalam lapisan roti tortilla lembut, dilengkapi potongan selada segar dan saus istimewa"));
        daftarmenu.add(new pilihanMenu(R.drawable.iced_coffe, "Iced Coffe", 15000, "Kopi dingin ditambah krim dan bubuk cokelat."));
        daftarmenu.add(new pilihanMenu(R.drawable.fish_bites, "Fish Bites", 13000, "Fillet ikan pilihan dalam balutan tepung roti yang digoreng renyah"));
        daftarmenu.add(new pilihanMenu(R.drawable.mcflurry, "McFlurry", 10000, "Es krim vanilla lembut dengan campuran bubuk biskuit Oreo"));
        daftarmenu.add(new pilihanMenu(R.drawable.mcspicy_chicken, "McSpicy Chicken", 20000, "Daging ayam goreng renyah dengan sensasi pedas"));
        adapter = new Adapter(this,daftarmenu);
        rv.setAdapter(adapter);
    }

}