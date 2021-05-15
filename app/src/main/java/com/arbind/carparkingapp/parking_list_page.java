package com.arbind.carparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class parking_list_page extends AppCompatActivity {
    TextView Tracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_list_page);

        Tracker = (TextView) findViewById(R.id.Tracker);
        Tracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(parking_list_page.this, bluetooth_page.class);
                startActivity(streamIntent);
            }
        });
    }
}

