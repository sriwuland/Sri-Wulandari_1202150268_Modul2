package com.example.asus.sriwulandari_1202150268_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        Toast.makeText(SplashScreen.this,"Sri Wulandari_1202150268",Toast.LENGTH_SHORT).show();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), SplashScreen.class));
                finish();

                Intent intent = new Intent(SplashScreen.this,MenuUtama.class);
                startActivity(intent);
            }
        }, 3000L); //3000 L = 3 detik

    }

}
