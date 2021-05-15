package com.arbind.carparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class parking_status_page extends AppCompatActivity {
    ImageView car11,car12,car13,car14,car15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_status_page);

        car11 = (ImageView)findViewById(R.id.car11);
        car11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(parking_status_page.this, booking.class);
                startActivity(streamIntent);
            }
        });

        car12 = (ImageView)findViewById(R.id.car12);
        car12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(parking_status_page.this, booking.class);
                startActivity(streamIntent);
            }
        });

        car13 = (ImageView)findViewById(R.id.car13);
        car13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(parking_status_page.this, booking.class);
                startActivity(streamIntent);
            }
        });

        car14 = (ImageView)findViewById(R.id.car14);
        car14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(parking_status_page.this, booking.class);
                startActivity(streamIntent);
            }
        });

        car15 = (ImageView)findViewById(R.id.car15);
        car15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(parking_status_page.this, booking.class);
                startActivity(streamIntent);
            }
        });
    }
}