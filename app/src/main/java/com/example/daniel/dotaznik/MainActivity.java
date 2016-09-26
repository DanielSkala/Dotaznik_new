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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity implements LocationListener{

    public Button button;

    //Chronometer chrono;
    //long time = 0;

    //NOVE

    public void init() {
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chrono.setBase(SystemClock.elapsedRealtime() + time);
                //chrono.start();

                final Intent toy = new Intent(MainActivity.this, Screen2.class);
                startActivity(toy);

            }
        });
    }

    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent ready = getIntent();

        final TreeMap<Integer, Dotaznik_info> map = new TreeMap<Integer, Dotaznik_info>();
        int iCounter = 0;
        if(ready.getStringExtra("end").equals("1"))
        {
            map.put(iCounter,new Dotaznik_info(ready.getStringExtra("sc2"),
                    ready.getStringExtra("sc2"),
                    ready.getStringExtra("sc3"),
                    ready.getStringExtra("sc4"),
                    ready.getStringExtra("sc5"),
                    ready.getStringExtra("sc6"),
                    ready.getStringExtra("sc7"),
                    ready.getStringExtra("sc8"),
                    ready.getStringExtra("sc9"),
                    ready.getStringExtra("sc10"),
                    ready.getStringExtra("sc11"),
                    ready.getStringExtra("sc12"),
                    ready.getStringExtra("sc13"),
                    ready.getStringExtra("sc14"),
                    ready.getStringExtra("sc15"),
                    ready.getStringExtra("sc16-1"),
                    ready.getStringExtra("sc16-2"),
                    ready.getStringExtra("sc16-3"),
                    ready.getStringExtra("sc16-4"),
                    ready.getStringExtra("sc16-5"),
                    ready.getStringExtra("sc16-6"),
                    ready.getStringExtra("sc17"),
                    ready.getStringExtra("sc18-1"),
                    ready.getStringExtra("sc18-2"),
                    ready.getStringExtra("sc18-3"),
                    ready.getStringExtra("sc18-4"),
                    ready.getStringExtra("sc18-5"),
                    ready.getStringExtra("sc19-1"),
                    ready.getStringExtra("sc19-2"),
                    ready.getStringExtra("sc19-3"),
                    ready.getStringExtra("sc19-4"),
                    ready.getStringExtra("sc19-5"),
                    ready.getStringExtra("sc19-6"),
                    ready.getStringExtra("sc20"),
                    ready.getStringExtra("sc21"),
                    ready.getStringExtra("sc22"),
                    ready.getStringExtra("sc23"),
                    ready.getStringExtra("sc24"),
                    ready.getStringExtra("sc25"),
                    ready.getStringExtra("sc26"),
                    ready.getStringExtra("sc27")));

            iCounter++;
                String s = null;
                ready.putExtra("end", "z");
        }

        if (fileExistance("data1.txt"))//----------------------------------------------------////////////////
        {
            try {
                FileInputStream fis1 = openFileInput("data1.txt"); //opens file
                InputStreamReader isr1 = new InputStreamReader(fis1);
                BufferedReader bufferedReader1 = new BufferedReader(isr1);
                String data;

                while ((data = bufferedReader1.readLine()) != null)
                {
                    String get[]= data.split("\t");
                    map.put(iCounter,new Dotaznik_info( get[0], get[1], get[2], get[3], get[4], get[5], get[6], get[7], get[8], get[9], get[10],
                                                                get[11],get[12],get[13],get[14],get[15],get[16],get[17],get[18],get[19],get[20],
                                                                get[21],get[22],get[23],get[24],get[25],get[26],get[27],get[28],get[29],get[30],
                                                                get[31],get[32],get[33],get[34],get[35],get[36],get[37],get[38],get[39],get[40]));
                    iCounter++;

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //-------------------------------------------------------------------------------------------------------------------------------
        // !Writing into File!
        //-------------------------------------------------------------------------------------------------------------------------------



            try {
                FileOutputStream fos = openFileOutput("data1.txt", MODE_PRIVATE);

                for (int i = 0; i < iCounter; i++) {
                    if (map.get(i) != null)
                        fos.write(map.get(i).toString().getBytes());
                }
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        //-------------------------------------------------------------------------------------------------------------------------------
        //
        //-------------------------------------------------------------------------------------------------------------------------------




        //chrono = (Chronometer) findViewById(R.id.chronometer);

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

    public boolean fileExistance(String fname){
        File file = getBaseContext().getFileStreamPath(fname);
        return file.exists();
    }
}


