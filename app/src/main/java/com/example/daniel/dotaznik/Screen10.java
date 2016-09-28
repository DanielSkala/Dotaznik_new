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

    String Q9,sChecked;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q9",MODE_PRIVATE).edit() ;
        CheckBox check1;
        sChecked = "true";
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
                Intent ready = new Intent(Screen10.this, Screen11.class);

                startActivity(sendIsChecked(ready));
                finish();
            }
        });
    }

    public void BackPressed(){
        button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ready = new Intent(Screen10.this, Screen9.class);

                startActivity(sendIsChecked(ready));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen10);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc10");
        if (i.getStringExtra("ksc10") == null)
            s = "true";
        if(s.equals("true")) {

            SharedPreferences settings = this.getSharedPreferences("Q9", MODE_PRIVATE);

            String restoredText = settings.getString("Q9", null);
            if (restoredText != null) {
                if (restoredText.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox32);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox33);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox34);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox35);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox36);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox37);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("7")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox38);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("8")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox39);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("9")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox40);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("10")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox41);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("11")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox42);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("12")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox43);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("13")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox44);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("14")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox48);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("15")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox46);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("16")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox47);
                    checkBox.setChecked(true);
                }
            }
        }
        init();
        BackPressed();
    }
    public Intent sendIsChecked(Intent ready)
    {
        Intent toy = getIntent();
        boolean isChecked;


        ready.putExtra("sc10", Q9);
        ready.putExtra("ksc2",toy.getStringExtra("ksc2"));
        ready.putExtra("ksc3",toy.getStringExtra("ksc3"));
        ready.putExtra("ksc4",toy.getStringExtra("ksc4"));
        ready.putExtra("ksc5",toy.getStringExtra("ksc5"));
        ready.putExtra("ksc6",toy.getStringExtra("ksc6"));
        ready.putExtra("ksc7",toy.getStringExtra("ksc7"));
        ready.putExtra("ksc8",toy.getStringExtra("ksc8"));
        ready.putExtra("ksc9",toy.getStringExtra("ksc9"));
        ready.putExtra("ksc10",sChecked);
        ready.putExtra("ksc11",toy.getStringExtra("ksc11"));
        ready.putExtra("ksc12",toy.getStringExtra("ksc12"));
        ready.putExtra("ksc13",toy.getStringExtra("ksc13"));
        ready.putExtra("ksc14",toy.getStringExtra("ksc14"));
        ready.putExtra("ksc15",toy.getStringExtra("ksc15"));
        ready.putExtra("ksc16-1",toy.getStringExtra("ksc16-1"));
        ready.putExtra("ksc16-2",toy.getStringExtra("ksc16-2"));
        ready.putExtra("ksc16-3",toy.getStringExtra("ksc16-3"));
        ready.putExtra("ksc16-4",toy.getStringExtra("ksc16-4"));
        ready.putExtra("ksc16-5",toy.getStringExtra("ksc16-5"));
        ready.putExtra("ksc16-6",toy.getStringExtra("ksc16-6"));
        ready.putExtra("ksc17",toy.getStringExtra("ksc17"));
        ready.putExtra("ksc18-1",toy.getStringExtra("ksc18-1"));
        ready.putExtra("ksc18-2",toy.getStringExtra("ksc18-2"));
        ready.putExtra("ksc18-3",toy.getStringExtra("ksc18-3"));
        ready.putExtra("ksc18-4",toy.getStringExtra("ksc18-4"));
        ready.putExtra("ksc18-5",toy.getStringExtra("ksc18-5"));
        ready.putExtra("ksc19-1",toy.getStringExtra("ksc19-1"));
        ready.putExtra("ksc19-2",toy.getStringExtra("ksc19-2"));
        ready.putExtra("ksc19-3",toy.getStringExtra("ksc19-3"));
        ready.putExtra("ksc19-4",toy.getStringExtra("ksc19-4"));
        ready.putExtra("ksc19-5",toy.getStringExtra("ksc19-5"));
        ready.putExtra("ksc19-6",toy.getStringExtra("ksc19-6"));
        ready.putExtra("ksc20",toy.getStringExtra("ksc20"));
        ready.putExtra("ksc21",toy.getStringExtra("ksc21"));
        ready.putExtra("ksc22",toy.getStringExtra("ksc22"));
        ready.putExtra("ksc23",toy.getStringExtra("ksc23"));
        ready.putExtra("ksc24",toy.getStringExtra("ksc24"));
        ready.putExtra("ksc25",toy.getStringExtra("ksc25"));
        ready.putExtra("ksc26",toy.getStringExtra("ksc26"));
        ready.putExtra("ksc27",toy.getStringExtra("ksc27"));

        return ready;
    }
}
