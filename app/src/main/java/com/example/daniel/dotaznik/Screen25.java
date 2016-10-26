package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class Screen25 extends AppCompatActivity {

    public Button button48;
    public Button button49;

    String Q24,sChecked;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q24",MODE_PRIVATE).edit() ;
        CheckBox check1;
        sChecked = "true";
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox79:
                if (checked)
                    Q24 = "Peter Chudík  (SMER-SD)";
                editor.putString("Q24","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                break;
            case R.id.checkBox78:
                if (checked)
                    Q24 = "Jozef Lukáč (OĽaNO –  NOVA, SaS)";
                editor.putString("Q24","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                break;
            case R.id.checkBox68:
                if (checked)
                    Q24 = "Jozef Mihalčin (ĽS Naše Slovensko strana  Mariana Kotlebu";
                editor.putString("Q24","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                break;
            case R.id.checkBox77:
                if (checked)
                    Q24 = "Peter Pčolinský (SME  RODINA – Boris Kollár)";
                editor.putString("Q24","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                break;
            case R.id.checkBox73:
                if (checked)
                    Q24 = "Jaroslav Regec  (SNS)";
                editor.putString("Q24","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                break;
            case R.id.checkBox76:
                if (checked)
                    Q24 = "Andrea Turčanová  (KDH)";
                editor.putString("Q24","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                break;
            case R.id.checkBox81:
                if (checked)
                    Q24 = "Neviem";
                editor.putString("Q24","7");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                break;
            case R.id.checkBox80:
                if (checked)
                    Q24 = "Nikoho";
                editor.putString("Q24","8");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen25.this, MainActivity.class);
        i.putExtra("Sc24", Q24);
    }

    public void init(){
        button49 = (Button)findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen25.this, Screen26.class);
                CheckBox c1 = (CheckBox)findViewById(R.id.checkBox79);
                CheckBox c2 = (CheckBox)findViewById(R.id.checkBox78);
                CheckBox c3 = (CheckBox)findViewById(R.id.checkBox68);
                CheckBox c4 = (CheckBox)findViewById(R.id.checkBox77);
                CheckBox c5 = (CheckBox)findViewById(R.id.checkBox73);
                CheckBox c6 = (CheckBox)findViewById(R.id.checkBox76);
                CheckBox c7 = (CheckBox)findViewById(R.id.checkBox81);
                CheckBox c8 = (CheckBox)findViewById(R.id.checkBox80);

                if(c1.isChecked() || c2.isChecked() || c3.isChecked() || c4.isChecked() || c5.isChecked() || c6.isChecked() || c7.isChecked() || c8.isChecked()) {
                    startActivity(sendIsChecked(toy));
                    finish();
                }
            }
        });
    }

    public void BackPressed(){
        button48 = (Button)findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen25.this, Screen24.class);
                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen25);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc24");

        //When users click on the image, alert dialog will show up
        ImageView imageView = (ImageView) findViewById(R.id.imageView25);
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AbortDialog dialog = new AbortDialog();
                dialog.show(getSupportFragmentManager(), "AbortDialogFragment");
            }
        });

        if (i.getStringExtra("ksc24") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = this.getSharedPreferences("Q24", MODE_PRIVATE);
            String restoredText = settings.getString("Q24", null);
            if (restoredText != null) {
                if (restoredText.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox79);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox78);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox68);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox77);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox73);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox76);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("7")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox81);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("8")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox80);
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




//toy.getStringExtra("sc24") == null ||  !toy.getStringExtra("sc24").equals(Q24)
        if(Q24!=null)

            ready.putExtra("sc24", Q24);
        else
            ready.putExtra("sc24", toy.getStringExtra("sc24"));
        ready.putExtra("sc3", toy.getStringExtra("sc3"));
        ready.putExtra("sc2", toy.getStringExtra("sc2"));
        ready.putExtra("sc4", toy.getStringExtra("sc4"));
        ready.putExtra("sc5", toy.getStringExtra("sc5"));
        ready.putExtra("sc6", toy.getStringExtra("sc6"));
        ready.putExtra("sc7", toy.getStringExtra("sc7"));
        ready.putExtra("sc8", toy.getStringExtra("sc8"));
        ready.putExtra("sc9", toy.getStringExtra("sc9"));
        ready.putExtra("sc10", toy.getStringExtra("sc10"));
        ready.putExtra("sc11", toy.getStringExtra("sc11"));
        ready.putExtra("sc12", toy.getStringExtra("sc12"));
        ready.putExtra("sc13", toy.getStringExtra("sc13"));
        ready.putExtra("sc14", toy.getStringExtra("sc14"));
        ready.putExtra("sc15", toy.getStringExtra("sc15"));
        ready.putExtra("sc16", toy.getStringExtra("sc16"));
        ready.putExtra("sc17", toy.getStringExtra("sc17"));
        ready.putExtra("sc18", toy.getStringExtra("sc18"));
        ready.putExtra("sc18-1", toy.getStringExtra("sc18-1"));
        ready.putExtra("sc20", toy.getStringExtra("sc20"));
        ready.putExtra("sc21", toy.getStringExtra("sc21"));
        ready.putExtra("sc22", toy.getStringExtra("sc22"));
        ready.putExtra("sc23", toy.getStringExtra("sc23"));
        //ready.putExtra("sc24", toy.getStringExtra("sc24"));
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
        ready.putExtra("ksc9",toy.getStringExtra("ksc9"));
        ready.putExtra("ksc10",toy.getStringExtra("ksc10"));
        ready.putExtra("ksc11",toy.getStringExtra("ksc11"));
        ready.putExtra("ksc12",toy.getStringExtra("ksc12"));
        ready.putExtra("ksc13",toy.getStringExtra("ksc13"));
        ready.putExtra("ksc14",toy.getStringExtra("ksc14"));
        ready.putExtra("ksc15",toy.getStringExtra("ksc15"));
        ready.putExtra("ksc16",toy.getStringExtra("ksc16"));
        ready.putExtra("ksc17",toy.getStringExtra("ksc17"));
        ready.putExtra("ksc18",toy.getStringExtra("ksc18"));
        ready.putExtra("ksc18-1",toy.getStringExtra("ksc18-1"));
        ready.putExtra("ksc20",toy.getStringExtra("ksc20"));
        ready.putExtra("ksc21",toy.getStringExtra("ksc21"));
        ready.putExtra("ksc22",toy.getStringExtra("ksc22"));
        ready.putExtra("ksc23",toy.getStringExtra("ksc23"));
        ready.putExtra("ksc24",sChecked);
        ready.putExtra("ksc25",toy.getStringExtra("ksc25"));

        return ready;
    }
}

