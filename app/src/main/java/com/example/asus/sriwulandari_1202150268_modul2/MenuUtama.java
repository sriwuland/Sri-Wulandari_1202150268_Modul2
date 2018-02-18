package com.example.asus.sriwulandari_1202150268_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    RadioButton in, away;
    Button btnpesan;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        setTitle("Menu Utama");


        in = findViewById(R.id.radio1);
        away = findViewById(R.id.radio2);
        btnpesan = findViewById(R.id.pesan);
        radioGroup = findViewById(R.id.grup);


    }

   public void button  (View view){
        int radioButton = radioGroup.getCheckedRadioButtonId();
        switch (radioButton){
            case R.id.radio1:
                Toast.makeText(getApplicationContext(), "Dine In ",
                    Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, DineIn.class));
                break;

            case R.id.radio2:
                Toast.makeText(getApplicationContext(), "Take Away ",
                        Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, TakeAway.class));
                break;

                default:break;
        }

    }

}
