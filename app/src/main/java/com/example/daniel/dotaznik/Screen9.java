package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

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
                    Q8 = "Ján Bajus (Zmena" +
                            "zdola, DÚ Slovenska) ";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox18:
                if (checked)
                    Q8 = "Dorota Bujňáková" +
                            "(NOVÝ PARLAMENT)";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox19:
                if (checked)
                    Q8 = "Ján Hudacký (KDH," +
                            "SDKÚ-DS, MOST-HÍD) ";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox20:
                if (checked)
                    Q8 = "Peter Chudík (SMERSD,\n" +
                            "NÁŠ KRAJ, SMS)";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox21:
                if (checked)
                    Q8 = "Vladimír Klein" +
                            "(ĽSNS)";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox22:
                if (checked)
                    Q8 = "Anton Korba" +
                            "(Nezávislý)";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox23:
                if (checked)
                    Q8 = "Jozef Mihalčin" +
                            "(SĽS) ";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox24:
                if (checked)
                    Q8 = "ZŠtefan Straka" +
                            "(KSS)";
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
                check1 = (CheckBox) findViewById(R.id.checkBox29);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox30);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox31);check1.setChecked(false);
                break;
            case R.id.checkBox25:
                if (checked)
                    Q8 = "Ľubomír Vasilišin (7 STATOČNÝCH)";
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
                CheckBox c2 = (CheckBox)findViewById(R.id.checkBox17);
                CheckBox c3 = (CheckBox)findViewById(R.id.checkBox18);
                CheckBox c4 = (CheckBox)findViewById(R.id.checkBox19);
                CheckBox c1 = (CheckBox)findViewById(R.id.checkBox20);
                CheckBox c5 = (CheckBox)findViewById(R.id.checkBox21);
                CheckBox c6 = (CheckBox)findViewById(R.id.checkBox22);
                CheckBox c7 = (CheckBox)findViewById(R.id.checkBox23);
                CheckBox c8 = (CheckBox)findViewById(R.id.checkBox24);
                CheckBox c9 = (CheckBox)findViewById(R.id.checkBox25);

                CheckBox c13 = (CheckBox)findViewById(R.id.checkBox29);
                CheckBox c14 = (CheckBox)findViewById(R.id.checkBox30);
                CheckBox c15 = (CheckBox)findViewById(R.id.checkBox31);
                if(c1.isChecked() || c2.isChecked() || c3.isChecked() || c4.isChecked() || c5.isChecked() || c6.isChecked() || c7.isChecked()
                        || c8.isChecked() || c9.isChecked() || c13.isChecked()
                        || c14.isChecked() || c15.isChecked()) {
                    startActivity(sendIsChecked(ready));
                    finish();
                }
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

        //When users click on the image, alert dialog will show up
        ImageView imageView = (ImageView) findViewById(R.id.imageView9);
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AbortDialog dialog = new AbortDialog();
                dialog.show(getSupportFragmentManager(), "AbortDialogFragment");
            }
        });

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




      //  toy.getStringExtra("sc9") == null ||  !toy.getStringExtra("sc9").equals(Q8)
        if(Q8 != null)
            ready.putExtra("sc9", Q8);
        else
            ready.putExtra("sc9", toy.getStringExtra("sc9"));
        ready.putExtra("sc2", toy.getStringExtra("sc2"));
        ready.putExtra("sc3", toy.getStringExtra("sc3"));
        ready.putExtra("sc4", toy.getStringExtra("sc4"));
        ready.putExtra("sc5", toy.getStringExtra("sc5"));
        ready.putExtra("sc6", toy.getStringExtra("sc6"));
        ready.putExtra("sc7", toy.getStringExtra("sc7"));
        ready.putExtra("sc8", toy.getStringExtra("sc8"));
        ready.putExtra("sc10", toy.getStringExtra("sc10"));
        ready.putExtra("sc11", toy.getStringExtra("sc11"));
        ready.putExtra("sc12", toy.getStringExtra("sc12"));
        ready.putExtra("sc13", toy.getStringExtra("sc13"));
        ready.putExtra("sc14", toy.getStringExtra("sc14"));
        ready.putExtra("sc15", toy.getStringExtra("sc15"));
        ready.putExtra("sc16-1", toy.getStringExtra("sc16-1"));
        ready.putExtra("sc16-2", toy.getStringExtra("sc16-2"));
        ready.putExtra("sc16-3", toy.getStringExtra("sc16-3"));
        ready.putExtra("sc16-4", toy.getStringExtra("sc16-4"));
        ready.putExtra("sc16-5", toy.getStringExtra("sc16-5"));
        ready.putExtra("sc16-6", toy.getStringExtra("sc16-6"));
        ready.putExtra("sc17", toy.getStringExtra("sc17"));
        ready.putExtra("sc18", toy.getStringExtra("sc18"));
        ready.putExtra("sc18-1", toy.getStringExtra("sc18-1"));
        ready.putExtra("sc18-2", toy.getStringExtra("sc18-2"));
        ready.putExtra("sc18-3", toy.getStringExtra("sc18-3"));
        ready.putExtra("sc18-4", toy.getStringExtra("sc18-4"));
        ready.putExtra("sc18-5", toy.getStringExtra("sc18-5"));
        ready.putExtra("sc19-1", toy.getStringExtra("sc19-1"));
        ready.putExtra("sc19-2", toy.getStringExtra("sc19-2"));
        ready.putExtra("sc19-3", toy.getStringExtra("sc19-3"));
        ready.putExtra("sc19-4", toy.getStringExtra("sc19-4"));
        ready.putExtra("sc19-5", toy.getStringExtra("sc19-5"));
        ready.putExtra("sc19-6", toy.getStringExtra("sc19-6"));
        ready.putExtra("sc20", toy.getStringExtra("sc20"));
        ready.putExtra("sc21", toy.getStringExtra("sc21"));
        ready.putExtra("sc22", toy.getStringExtra("sc22"));
        ready.putExtra("sc23", toy.getStringExtra("sc23"));
        ready.putExtra("sc24", toy.getStringExtra("sc24"));
        ready.putExtra("sc25", toy.getStringExtra("sc25"));
        ready.putExtra("sc26", toy.getStringExtra("sc26"));
        ready.putExtra("sc27", toy.getStringExtra("sc27"));
        ready.putExtra("sc28", toy.getStringExtra("sc28"));
        ready.putExtra("macAddress", toy.getStringExtra("macAddress"));
        ready.putExtra("name", toy.getStringExtra("name"));

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
        ready.putExtra("ksc18",toy.getStringExtra("ksc18"));
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
