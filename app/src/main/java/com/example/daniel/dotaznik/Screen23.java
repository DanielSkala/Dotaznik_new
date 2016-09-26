package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen23 extends AppCompatActivity {

    public Button button44;
    public Button button45;

    String Q22;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q22",MODE_PRIVATE).edit() ;
        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox161:
                if (checked)
                    Q22 = "Juraj Droba (SaS, OľaNO-NOVA,  KDH)";
                editor.putString("Q22","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox162);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox163);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox164);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox165);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox166);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox167);check1.setChecked(false);
                break;
            case R.id.checkBox162:
                if (checked)
                    Q22 = "Pavol  Frešo  (Nezávislý  )";
                editor.putString("Q22","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox161);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox163);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox164);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox165);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox166);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox167);check1.setChecked(false);
                break;
            case R.id.checkBox163:
                if (checked)
                    Q22 = "Milan  Ftáčnik (SMER-  SD, SNS,  MOST-HÍD)";
                editor.putString("Q22","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox162);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox161);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox164);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox165);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox166);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox167);check1.setChecked(false);
                break;
            case R.id.checkBox164:
                if (checked)
                    Q22 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                editor.putString("Q22","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox162);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox163);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox161);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox165);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox166);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox167);check1.setChecked(false);
                break;
            case R.id.checkBox165:
                if (checked)
                    Q22 = "Nešiel by som voliť";
                editor.putString("Q22","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox162);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox163);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox164);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox161);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox166);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox167);check1.setChecked(false);
                break;
            case R.id.checkBox167:
                if (checked)
                    Q22 = "Nikoho";
                editor.putString("Q22","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox162);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox163);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox164);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox165);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox161);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox167);check1.setChecked(false);
                break;
            case R.id.checkBox166:
                if (checked)
                    Q22 = "Neviem";
                editor.putString("Q22","7");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox162);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox163);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox164);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox165);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox166);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox161);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen23.this, MainActivity.class);
        i.putExtra("Sc23", Q22);
    }


    public void init(){
        button45 = (Button)findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen23.this, Screen24.class);
                startActivity(toy);
                finish();
            }
        });
    }

    public void BackPressed(){
        button44 = (Button)findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen23.this, Screen22.class);
                startActivity(toy);
                finish();




            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen23);

        SharedPreferences settings = getSharedPreferences("Q22",MODE_PRIVATE);
        String restoredText =   settings.getString("Q22", null);


        if (restoredText != null) {
            if (restoredText.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox161);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox162);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox163);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox164);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox165);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox166);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
