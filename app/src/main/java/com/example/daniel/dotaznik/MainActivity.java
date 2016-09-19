package com.example.daniel.dotaznik;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LocationListener{

    public Button button;

    public EditText editText,editText2,editText3;
    //Chronometer chrono;
    //long time = 0;

    //NOVE

    public void init() {
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String info = editText.getText().toString();
                final String info2 = editText2.getText().toString();
                final String info3 = editText3.getText().toString();
                //nefunguje

                //chrono.setBase(SystemClock.elapsedRealtime() + time);
                //chrono.start();

                Intent toy = new Intent(MainActivity.this, Screen2.class);
                startActivity(toy);

                //NOVE

/*
                Intent i = new Intent(MainActivity.this, AllData.class);
                i.putExtra("Den1", info);
                i.putExtra("Datum1", info2);
                i.putExtra("Cas1", info3);
                startActivity(i);
                */

            }
        });
    }

    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //chrono = (Chronometer) findViewById(R.id.chronometer);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);



        init();


        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000, 10, this);

    }

    //TODO hodit do podmienky funkciu onLocationChanged

    @Override
    public void onLocationChanged(Location location) {

        String myLocation ="Location changed...\n\nYou are located at: " + "\nLatitude: " + location.getLatitude()
                + "\nLongitude: " + location.getLongitude();

        Toast.makeText(getApplicationContext(), myLocation, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onProviderDisabled(String provider) {

        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Gps is turned off... ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderEnabled(String provider) {

        Toast.makeText(getApplicationContext(), "Gps is turned on... ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

}


