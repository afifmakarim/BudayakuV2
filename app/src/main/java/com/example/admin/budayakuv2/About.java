package com.example.admin.budayakuv2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 4/6/2016.
 */
public class About extends AppCompatActivity {

    private Button mBtnBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        //Ambil ID si Button Back
        mBtnBack = (Button) findViewById(R.id.btn_back);

        //Set on CLick si Button Back
        mBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                /*
                kalo untuk memanggil activity baru (yang sifatnya maju) kita pakai Intent
                tapi, kalau kita memanggil Activity yang sebelumnya (1 ACTIVITY DIBELAKANG POSISI SAAT INI) gunakan saja
                onBackPressed()
                 */
            }
        });
    }
}
