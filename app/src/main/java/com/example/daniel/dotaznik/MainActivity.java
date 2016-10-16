package com.example.daniel.dotaznik;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.TreeMap;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity implements LocationListener {

    public Button button;
    public String address;
    public String name;
    int i;
    String getGps;
    String gTime;

    public void init() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                name = ((EditText) findViewById(R.id.editText2)).getText().toString();
                Intent toy = new Intent(MainActivity.this, Screen2.class);
                for (int i = 1; i <= 27; i++) {
                    if (i != 16 || i != 19) {
                        SharedPreferences.Editor editor = getSharedPreferences("Q" + i, MODE_PRIVATE).edit();
                        editor.putString("Q" + i, null);
                        editor.commit();
                    }
                }

                for (int i = 1; i <= 6; i++) {


                    SharedPreferences.Editor editor = getSharedPreferences("Q15_" + i, MODE_PRIVATE).edit();
                    editor.putString("Q15_" + i, null);
                    editor.commit();

                    editor = getSharedPreferences("Q19_" + i, MODE_PRIVATE).edit();
                    editor.putString("Q19_" + i, null);
                    editor.commit();

                    name = ((EditText) findViewById(R.id.editText2)).getText().toString();
                    editor = getSharedPreferences("name", MODE_PRIVATE).edit();
                    editor.putString("name", name);
                    editor.commit();

                    if (i < 6) {
                        editor = getSharedPreferences("Q18_" + i, MODE_PRIVATE).edit();
                        editor.putString("Q18_" + i, null);
                        editor.commit();

                    }

                }

                SharedPreferences.Editor editor = getSharedPreferences("telNum" , MODE_PRIVATE).edit();
                editor.putString("telNum", null);
                editor.commit();

                try {
                    AudioRecorder.start(address + Calendar.getInstance().getTime() + ".3gp");
                    gTime = Calendar.getInstance().getTime().toString();
                } catch (Exception e) {
                    //Handle exception
                }
                name = ((EditText) findViewById(R.id.editText2)).getText().toString();
                SharedPreferences.Editor editor3 = getSharedPreferences("name",MODE_PRIVATE).edit() ;
                if(name!= null || !name.equals("")) {
                    editor.putString("name", name);
                    editor.commit();
                }

                if (name.equals("")){
                    name = "noName";
                }

                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    private LocationManager locationManager;

    public Intent sendIsChecked(Intent ready) {
        Calendar c = Calendar.getInstance();
        String sDate = c.get(Calendar.YEAR) + "-"
                + c.get(Calendar.MONTH)
                + "-" + c.get(Calendar.DAY_OF_MONTH)
                + " at " + c.get(Calendar.HOUR_OF_DAY)
                + ":" + c.get(Calendar.MINUTE);

        boolean isChecked;
        Intent get = getIntent();
        if (get.getStringExtra("isChecked") == null)
            isChecked = true;
        else {
            if (get.getStringExtra("isChecked").equals("true"))
                isChecked = true;
            else
                isChecked = false;
        }



        if (isChecked) {
            ready.putExtra("sc27", getGps);
            ready.putExtra("sc28", gTime);
            ready.putExtra("ksc2", "false");
            ready.putExtra("ksc2", "false");
            ready.putExtra("ksc3", "false");
            ready.putExtra("ksc4", "false");
            ready.putExtra("ksc5", "false");
            ready.putExtra("ksc6", "false");
            ready.putExtra("ksc7", "false");
            ready.putExtra("ksc8", "false");
            ready.putExtra("ksc9", "false");
            ready.putExtra("ksc10", "false");
            ready.putExtra("ksc11", "false");
            ready.putExtra("ksc12", "false");
            ready.putExtra("ksc13", "false");
            ready.putExtra("ksc14", "false");
            ready.putExtra("ksc15", "false");
            ready.putExtra("ksc16-1", "false");
            ready.putExtra("ksc16-2", "false");
            ready.putExtra("ksc16-3", "false");
            ready.putExtra("ksc16-4", "false");
            ready.putExtra("ksc16-5", "false");
            ready.putExtra("ksc16-6", "false");
            ready.putExtra("ksc17", "false");
            ready.putExtra("ksc18", "false");
            ready.putExtra("ksc18-1", "false");
            ready.putExtra("ksc18-2", "false");
            ready.putExtra("ksc18-3", "false");
            ready.putExtra("ksc18-4", "false");
            ready.putExtra("ksc18-5", "false");
            ready.putExtra("ksc19-1", "false");
            ready.putExtra("ksc19-2", "false");
            ready.putExtra("ksc19-3", "false");
            ready.putExtra("ksc19-4", "false");
            ready.putExtra("ksc19-5", "false");
            ready.putExtra("ksc19-6", "false");
            ready.putExtra("ksc20", "false");
            ready.putExtra("ksc21", "false");
            ready.putExtra("ksc22", "false");
            ready.putExtra("ksc23", "false");
            ready.putExtra("ksc24", "false");
            ready.putExtra("ksc25", "false");
            ready.putExtra("ksc26", "false");
            ready.putExtra("ksc27", "false");
            ready.putExtra("macAddress", address);
            ready.putExtra("name", name);
        }
        return ready;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView QNum = (TextView) findViewById(R.id.textView129);
        QNum.setText("Počet ukončených dotazníkov: " + getQNum());

        WifiManager manager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = manager.getConnectionInfo();
        address = info.getMacAddress();
        init();

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000, 10, this);

        init();


    }



    @Override
    public void onLocationChanged(Location location) {

        while (i == 0) {
            String myLocation = "Location changed...\n\nYou are located at: " + "\nLatitude: " + location.getLatitude()
                    + "\nLongitude: " + location.getLongitude();
            i++;
            getGps = location.getLatitude() + " " + location.getLongitude();
        }
        //Toast.makeText(getApplicationContext(), myLocation, Toast.LENGTH_LONG).show();
        if (locationManager != null && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED)
            locationManager.removeUpdates(this);
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

    public boolean fileExistance(String fname) {
        File file = getBaseContext().getFileStreamPath(fname);
        return file.exists();
    }

    public int getQNum() {

        final TreeMap<Integer, Dotaznik_info> map = new TreeMap<Integer, Dotaznik_info>();
        int iCounter = 0;

        File root1 = android.os.Environment.getExternalStorageDirectory();
        File dir1 = new File(root1.getAbsolutePath() + "/download");
        File file1 = new File(dir1, "myData1.txt");


            try {

                BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "UTF-8"), 8192);
                String data;
                while ((data = bufferedReader1.readLine()) != null) {
                    String get[] = data.split("\t");
                    map.put(iCounter, new Dotaznik_info(get[0], get[1], get[2], get[3], get[4], get[5], get[6], get[7], get[8], get[9], get[10],
                            get[11], get[12], get[13], get[14], get[15], get[16], get[17], get[18], get[19], get[20],
                            get[21], get[22], get[23], get[24], get[25], get[26], get[27], get[28], get[29], get[30],
                            get[31], get[32], get[33], get[34], get[35], get[36], get[37], get[38], get[39], get[40], get[41], get[42], get[43], get[44], get[45]));
                    iCounter++;

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        return map.size();
    }
}


