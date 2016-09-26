package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen10 extends AppCompatActivity {

    public Button button18;
    public Button button19;

    String Q9;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q9",MODE_PRIVATE).edit() ;
        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox32:
                if (checked)
                    Q9 = "KDH";
                editor.putString("Q9","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox33:
                if (checked)
                    Q9 = "KSS";
                editor.putString("Q9","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox34:
                if (checked)
                    Q9 = "ĽS Naše Slovenskostrana Mariana Kotlebu";
                editor.putString("Q9","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox35:
                if (checked)
                    Q9 = "MOST-HÍD";
                editor.putString("Q9","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox36:
                if (checked)
                    Q9 = "OĽANO-NOVA";
                editor.putString("Q9","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox37:
                if (checked)
                    Q9 = "SaS";
                editor.putString("Q9","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox38:
                if (checked)
                    Q9 = "SDKÚ-DS";
                editor.putString("Q9","7");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox39:
                if (checked)
                    Q9 = "SIEŤ";
                editor.putString("Q9","8");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox40:
                if (checked)
                    Q9 = "SKOK";
                editor.putString("Q9","9");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox41:
                if (checked)
                    Q9 = "SMER-SD";
                editor.putString("Q9","10");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox42:
                if (checked)
                    Q9 = "SMK-MKP";
                editor.putString("Q9","11");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox43:
                if (checked)
                    Q9 = "SME RODINA Boris Kollár";
                editor.putString("Q9","12");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox44:
                if (checked)
                    Q9 = "SNS";
                editor.putString("Q9","13");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox48:
                if (checked)
                    Q9 = "Nešiel by som voliť";
                editor.putString("Q9","14");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                break;
            case R.id.checkBox46:
                if (checked)
                    Q9 = "Žiadnu";
                editor.putString("Q9","15");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox47);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
            case R.id.checkBox47:
                if (checked)
                    Q9 = "Neviem";
                editor.putString("Q9","16");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox33);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox34);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox35);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox36);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox37);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox38);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox39);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox40);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox41);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox42);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox43);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox44);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox46);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox32);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;

        }
        Intent i = new Intent(Screen10.this, MainActivity.class);
        i.putExtra("Sc10", Q9);
    }

    public void init(){
        button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen10.this, Screen11.class);
                startActivity(toy);
                finish();




            }
        });
    }

    public void BackPressed(){
        button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen10.this, Screen9.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen10);

        SharedPreferences settings = this.getSharedPreferences("Q9", MODE_PRIVATE);

        String restoredText = settings.getString("Q9", null);
        if (restoredText != null) {
            if(restoredText.equals("1"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox32);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("2"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox33);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("3"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox34);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("4"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox35);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("5"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox36);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("6"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox37);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("7"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox38);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("8"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox39);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("9"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox40);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("10"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox41);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("11"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox42);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("12"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox43);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("13"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox44);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("14"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox48);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("15"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox46);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("16"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox47);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
