package com.example.daniel.dotaznik;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.TreeMap;

public class FinalScreen extends AppCompatActivity {

    public Button button54;
    /*
    public EditText editText4,editText5,editText6;

    */
String getName,getVek;
    public void init() {
        button54 = (Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AudioRecorder.stop();

                Intent ready = getIntent();

                final TreeMap<Integer, Dotaznik_info> map = new TreeMap<Integer, Dotaznik_info>();
                int iCounter = 0;

                map.put(iCounter,new Dotaznik_info(
                        ready.getStringExtra("macAddress") + "__" + ready.getStringExtra("sc28"),
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
                        /*TODO: vymazat sc16-1 az sc16-6 a zamenit len za sc16*/
                        ready.getStringExtra("sc16-1"),
                        ready.getStringExtra("sc16-2"),
                        ready.getStringExtra("sc16-3"),
                        ready.getStringExtra("sc16-4"),
                        ready.getStringExtra("sc16-5"),
                        ready.getStringExtra("sc16-6"),
                        ready.getStringExtra("sc17"),
                        ready.getStringExtra("sc18"),
                        /*TODO: to iste s tymito*/
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
                        ready.getStringExtra("sc26"),//vymazat
                        ready.getStringExtra("sc27"),//gps
                        ready.getStringExtra("sc28"), //start time
                        Calendar.getInstance().getTime().toString(),//end time
                        ready.getStringExtra("sTelNum"), //telNum
                        getName                      //name
                       ));
                iCounter++;

                File root1 = android.os.Environment.getExternalStorageDirectory();
                File dir1 = new File (root1.getAbsolutePath() + "/download");
                File file1 = new File(dir1, "myData1.txt");

                //if(file1.exists()) {
                    try {

                        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "UTF-8"), 8192);
                        String data;
                        while ((data = bufferedReader1.readLine()) != null) {
                            String get[] = data.split("\t");
                            /*TODO: upravit podla dat v dotaznik_info*/
                            map.put(iCounter, new Dotaznik_info(get[0], get[1], get[2], get[3], get[4], get[5], get[6], get[7], get[8], get[9], get[10],
                                    get[11], get[12], get[13], get[14], get[15], get[16], get[17], get[18], get[19], get[20],
                                    get[21], get[22], get[23], get[24], get[25], get[26], get[27], get[28], get[29], get[30],
                                    get[31], get[32], get[33], get[34], get[35], get[36], get[37], get[38], get[39], get[40],
                                    get[41], get[42], get[43], get[44], get[45]));
                            iCounter++;

                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                //}
                File root = android.os.Environment.getExternalStorageDirectory();


                // See http://stackoverflow.com/questions/3551821/android-write-to-sd-card-folder

                File dir = new File (root.getAbsolutePath() + "/download");
                dir.mkdirs();
                File file = new File(dir, "myData1.txt");

                try {

                    //FileOutputStream f = new FileOutputStream(file), "utf8"),8192);
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"),8192);

                    for (int i = 0; i < iCounter; i++) {
                        if (map.get(i) != null)
                            bw.write(map.get(i).toString());

                    }


                    bw.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();

                } catch (IOException e) {
                    e.printStackTrace();
                }



            //-------------------------------------------------------------------------------------------------------------------------------
                // !Writing into File!
                //-------------------------------------------------------------------------------------------------------------------------------

/*

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


*/


                Intent info = new Intent (FinalScreen.this, MainActivity.class);
                info.putExtra("isChecked","true");

                //info.putExtra("Den2", info6);
               // info.putExtra("Datum2", info5);
                //info.putExtra("Cas2", info4);
                //info.putExtra("end", "1");

                /*File sharedPreferenceFile = new File("/data/data/"+ getPackageName()+ "/shared_prefs/");
                File[] listFiles = sharedPreferenceFile.listFiles();
                for (File file : listFiles) {
                    file.delete();
                }*/
                info.putExtra("shpf","0");
                startActivity(info);
                finish();





            }
        });
    }
    public static void setDefaults(String key, String value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }
    public void clear()
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
    }
    public static String getDefaults(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(key, null);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
        SharedPreferences settings = this.getSharedPreferences("name", MODE_PRIVATE);
        getName = settings.getString("name", null);

        settings = this.getSharedPreferences("vek", MODE_PRIVATE);
        getVek = settings.getString("vek", null);
        init();
    }
    public boolean fileExistance(String fname){
        File file = getBaseContext().getFileStreamPath(fname);
    return file.exists();
}
}
