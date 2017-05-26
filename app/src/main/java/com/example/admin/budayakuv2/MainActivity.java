package com.example.admin.budayakuv2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.sejarahbtn);
        button2 = (Button) findViewById(R.id.kebudbtn);
        button3 = (Button) findViewById(R.id.devbtn);

        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent1 = new Intent(MainActivity.this,
                        Sejarah.class);
                startActivity(myIntent1);
            }
        });

        // Capture button clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(MainActivity.this,
                        ListViewItemBudaya.class);
                startActivity(myIntent2);
            }
        });
        // Capture button clicks
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent3 = new Intent(MainActivity.this,
                        About.class);
                startActivity(myIntent3);
            }
        });
    }
}

