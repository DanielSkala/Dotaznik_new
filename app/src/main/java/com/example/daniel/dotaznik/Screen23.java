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

    String Q22,sChecked;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q22",MODE_PRIVATE).edit() ;
        CheckBox check1;
        sChecked = "true";
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
        i.putExtra("Sc22", Q22);
    }


    public void init(){
        button45 = (Button)findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen23.this, Screen24.class);
                startActivity(sendIsChecked(toy));
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
                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen23);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc22");
        if (i.getStringExtra("ksc22") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = getSharedPreferences("Q22", MODE_PRIVATE);
            String restoredText = settings.getString("Q22", null);


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
        }
        init();
        BackPressed();
    }
    public Intent sendIsChecked(Intent ready)
    {
        Intent toy = getIntent();
        boolean isChecked;


        ready.putExtra("sc22", Q22);
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
        ready.putExtra("ksc22",sChecked);
        ready.putExtra("ksc23",toy.getStringExtra("ksc23"));
        ready.putExtra("ksc24",toy.getStringExtra("ksc24"));
        ready.putExtra("ksc25",toy.getStringExtra("ksc25"));
        ready.putExtra("ksc26",toy.getStringExtra("ksc26"));
        ready.putExtra("ksc27",toy.getStringExtra("ksc27"));

        return ready;
    }
}
