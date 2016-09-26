package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen27 extends AppCompatActivity {

    public Button button52;
    public Button button53;

    String Q26;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q26",MODE_PRIVATE).edit() ;
        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox180:
                if (checked)
                    Q26 = "Juraj Droba (SaS, OľaNO-NOVA,  KDH)";
                editor.putString("Q26","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox181);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox182);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox183);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox184);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox185);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox186);check1.setChecked(false);
                break;
            case R.id.checkBox181:
                if (checked)
                    Q26 = "Pavol  Frešo  (Nezávislý  )";
                editor.putString("Q26","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox180);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox182);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox183);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox184);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox185);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox186);check1.setChecked(false);
                break;
            case R.id.checkBox182:
                if (checked)
                    Q26 = "Milan  Ftáčnik (SMER-  SD, SNS,  MOST-HÍD)";
                editor.putString("Q26","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox181);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox180);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox183);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox184);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox185);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox186);check1.setChecked(false);
                break;
            case R.id.checkBox183:
                if (checked)
                    Q26 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                editor.putString("Q26","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox181);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox182);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox180);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox184);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox185);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox186);check1.setChecked(false);
                break;
            case R.id.checkBox184:
                if (checked)
                    Q26 = "Nešiel by som voliť";
                editor.putString("Q26","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox181);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox182);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox183);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox180);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox185);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox186);check1.setChecked(false);
                break;
            case R.id.checkBox185:
                if (checked)
                    Q26 = "Nikoho";
                editor.putString("Q26","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox181);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox182);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox183);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox184);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox180);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox186);check1.setChecked(false);
                break;
            case R.id.checkBox186:
                if (checked)
                    Q26 = "Neviem";
                editor.putString("Q26","7");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox181);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox182);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox183);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox184);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox185);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox180);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen27.this, MainActivity.class);
        i.putExtra("Sc27", Q26);
    }


    public void init(){
        button53 = (Button)findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen27.this, FinalScreen.class);
                startActivity(toy);
                finish();



            }
        });
    }

    public void BackPressed(){
        button52 = (Button)findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen27.this, Screen26.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen27);

        SharedPreferences settings = getSharedPreferences("Q26",MODE_PRIVATE);
        String restoredText =   settings.getString("Q26", null);


        if (restoredText != null) {
            if (restoredText.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox180);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox181);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox182);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox183);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox184);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox185);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("7")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox186);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
