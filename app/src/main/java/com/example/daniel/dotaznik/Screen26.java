package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen26 extends AppCompatActivity {

    public Button button50;
    public Button button51;

    String Q25;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q25",MODE_PRIVATE).edit() ;
        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox173:
                if (checked)
                    Q25 = "Juraj Droba (SaS, OľaNO-NOVA,  KDH)";
                editor.putString("Q25","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox174);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox175);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox176);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox177);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox178);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox179);check1.setChecked(false);
                break;
            case R.id.checkBox174:
                if (checked)
                    Q25 = "Pavol  Frešo  (Nezávislý  )";
                editor.putString("Q25","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox173);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox175);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox176);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox177);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox178);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox179);check1.setChecked(false);
                break;
            case R.id.checkBox175:
                if (checked)
                    Q25 = "Milan  Ftáčnik (SMER-  SD, SNS,  MOST-HÍD)";
                editor.putString("Q25","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox174);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox173);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox176);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox177);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox178);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox179);check1.setChecked(false);
                break;
            case R.id.checkBox176:
                if (checked)
                    Q25 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                editor.putString("Q25","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox174);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox175);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox173);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox177);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox178);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox179);check1.setChecked(false);
                break;
            case R.id.checkBox177:
                if (checked)
                    Q25 = "Nešiel by som voliť";
                editor.putString("Q25","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox174);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox175);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox176);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox173);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox178);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox179);check1.setChecked(false);
                break;
            case R.id.checkBox178:
                if (checked)
                    Q25 = "Nikoho";
                editor.putString("Q25","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox174);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox175);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox176);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox177);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox173);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox179);check1.setChecked(false);
                break;
            case R.id.checkBox179:
                if (checked)
                    Q25 = "Neviem";
                editor.putString("Q25","7");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox174);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox175);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox176);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox177);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox178);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox173);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen26.this, MainActivity.class);
        i.putExtra("Sc26", Q25);
    }


    public void init(){
        button51 = (Button)findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen26.this, Screen27.class);
                startActivity(toy);
                finish();



            }
        });
    }

    public void BackPressed(){
        button50 = (Button)findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen26.this, Screen25.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen26);

        SharedPreferences settings = getSharedPreferences("Q25",MODE_PRIVATE);
        String restoredText =   settings.getString("Q25", null);


        if (restoredText != null) {
            if (restoredText.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox173);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox174);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox175);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox176);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox177);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox178);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("7")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox179);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
