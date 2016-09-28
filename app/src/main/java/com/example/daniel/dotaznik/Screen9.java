package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen9 extends AppCompatActivity {

    public Button button16;
    public Button button17;

    String Q8,sChecked;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q8",MODE_PRIVATE).edit() ;
        CheckBox check1;
        sChecked = "true";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox17:
                if (checked)
                    Q8 = "Pavol Frešo (SDKÚ-DS)";
                editor.putString("Q8","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox18:
                if (checked)
                    Q8 = "Monika Flašíková Beňová (SMER-SD)";
                editor.putString("Q8", "2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox19:
                if (checked)
                    Q8 = "Daniel Krajcer  (NOVA – D. Lipšic)";
                editor.putString("Q8", "3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox20:
                if (checked)
                    Q8 = "Jaroslav Paška  (SNS)";
                editor.putString("Q8", "4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox21:
                if (checked)
                    Q8 = "Karol Ondriáš  (KSS)";
                editor.putString("Q8", "5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox22:
                if (checked)
                    Q8 = "Peter Marček  (SOSKA)";
                editor.putString("Q8", "6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox23:
                if (checked)
                    Q8 = "Roman Ruhig (NOVÝ  PARLAMENT)";
                editor.putString("Q8", "7");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox24:
                if (checked)
                    Q8 = "Zdenka Beňová  (ĽS-NS – M. Kotleba)";
                editor.putString("Q8", "8");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox25:
                if (checked)
                    Q8 = "Rastislav Blaško  (Nezávislý)";
                editor.putString("Q8", "9");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox26:
                if (checked)
                    Q8 = "Anton Čulen  (Magnificant Slovakia)";
                editor.putString("Q8", "10");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox27:
                if (checked)
                    Q8 = "Oskar Dobrovodský  (Národ a Spravodlivosť)";
                editor.putString("Q8", "11");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox28:
                if (checked)
                    Q8 = "Gabriel Karácsony  (PRIAMA DEMOKRACIA)";
                editor.putString("Q8", "12");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox29:
                if (checked)
                    Q8 = "Nikoho";
                editor.putString("Q8", "13");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox30:
                if (checked)
                    Q8 = "Neviem";
                editor.putString("Q8", "14");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox31:
                if (checked)
                    Q8 = "Nevolil som";
                editor.putString("Q8", "15");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox18);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox19);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox20);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox21);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox22);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox23);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox24);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox25);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox26);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox27);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox28);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox17);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen9.this, MainActivity.class);
        i.putExtra("Sc9", Q8);

    }


    public void init(){
        button17 = (Button)findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ready = new Intent(Screen9.this, Screen10.class);

                startActivity(sendIsChecked(ready));
                finish();
            }
        });
    }

    public void BackPressed(){
        button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ready = new Intent(Screen9.this, Screen8.class);

                startActivity(sendIsChecked(ready));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc9");
        if (i.getStringExtra("ksc9") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = this.getSharedPreferences("Q8", MODE_PRIVATE);

            String restoredText = settings.getString("Q8", null);
            if (restoredText != null) {
                if (restoredText.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox17);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox18);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox19);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox20);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox21);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox22);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("7")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox23);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("8")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox24);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("9")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox25);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("10")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox26);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("11")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox27);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("12")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox28);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("13")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox30);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("14")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox31);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("15")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox30);
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


        ready.putExtra("sc9", Q8);
        ready.putExtra("ksc2",toy.getStringExtra("ksc2"));
        ready.putExtra("ksc3",toy.getStringExtra("ksc3"));
        ready.putExtra("ksc4",toy.getStringExtra("ksc4"));
        ready.putExtra("ksc5",toy.getStringExtra("ksc5"));
        ready.putExtra("ksc6",toy.getStringExtra("ksc6"));
        ready.putExtra("ksc7",toy.getStringExtra("ksc7"));
        ready.putExtra("ksc8",toy.getStringExtra("ksc8"));
        ready.putExtra("ksc9",sChecked);
        ready.putExtra("ksc10",toy.getStringExtra("ksc10"));
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
