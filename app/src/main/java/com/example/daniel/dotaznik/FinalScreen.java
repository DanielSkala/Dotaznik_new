package com.example.daniel.dotaznik;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;

public class FinalScreen extends AppCompatActivity {

    public Button button54;
    /*
    public EditText editText4,editText5,editText6;


    */

    public void init() {
        button54 = (Button) findViewById(R.id.button54);

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





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
/*


*/
        init();

    }
}
