package com.arbind.carparkingapp;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    FirebaseAuth mAuth;

    private TextView drawerUsername, drawerAccount;
    private View headerView;
    ImageView parking_detail,tracker,parking_list, imageView5, imageView6, imageView3,bluetooth,feedback,parking_status,p_manual,Location_Area,parking1,parking2;

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bluetooth = (ImageView) findViewById(R.id.bluetooth);
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, bluetooth_page.class);
                startActivity(streamIntent);
            }
        });

        parking_detail = (ImageView) findViewById(R.id.parking_detail);
        parking_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, userdetail.class);
                startActivity(streamIntent);
            }
        });

        p_manual = (ImageView) findViewById(R.id.p_manual);
        p_manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, parking_manual.class);
                startActivity(streamIntent);
            }
        });

        parking1 = (ImageView) findViewById(R.id.parking1);
        parking1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, parking_pages.class);
                startActivity(streamIntent);
            }
        });

        parking2 = (ImageView) findViewById(R.id.parking2);
        parking2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, parking_list_page.class);
                startActivity(streamIntent);
            }
        });


        Location_Area = (ImageView) findViewById(R.id.Location_Area);
        Location_Area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, location_area.class);
                startActivity(streamIntent);
            }
        });



        feedback = (ImageView) findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, support_contact.class);
                startActivity(streamIntent);
            }
        });

        parking_status = (ImageView) findViewById(R.id.parking_status);
        parking_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, parking_status_page.class);
                startActivity(streamIntent);
            }
        });


        // setup UI
        coordinatorLayout = findViewById(R.id.coordinatorLayout);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAuth = FirebaseAuth.getInstance();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mAuth = FirebaseAuth.getInstance();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        headerView = navigationView.getHeaderView(0);
        drawerUsername = headerView.findViewById(R.id.drawer_name);
        drawerAccount = headerView.findViewById(R.id.drawer_email);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.Booking_in) {
            Intent paymentIntent = new Intent(HomeActivity.this, booking.class);
            startActivity(paymentIntent);

        } else if (id == R.id.Booking_detail) {
            Intent paymentIntent = new Intent(HomeActivity.this, deatil.class);
            startActivity(paymentIntent);

        } else if (id == R.id.Location) {
            Intent paymentIntent = new Intent(HomeActivity.this, location_area.class);
            startActivity(paymentIntent);


        } else if (id == R.id.nav_support_contact) {
            Intent paymentIntent = new Intent(HomeActivity.this, test.class);
            startActivity(paymentIntent);


        } else if (id == R.id.nav_share) {

            Intent shareintent = new Intent();
            shareintent.setAction(Intent.ACTION_SEND);
            shareintent.putExtra(Intent.EXTRA_TEXT, "your application link");
            shareintent.setType("text/plain");
            startActivity(Intent.createChooser(shareintent, " Share Parking App"));

        } else if (id == R.id.nav_logout)
            mAuth.signOut();
        if (mAuth.getCurrentUser() == null) {
            startActivity(new Intent(getApplicationContext(), LoginandregisterActivity.class));
            finish();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }
}
