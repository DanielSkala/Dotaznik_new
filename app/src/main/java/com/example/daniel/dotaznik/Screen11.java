package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen11 extends AppCompatActivity {

    public Button button20;
    public Button button21;

    String Q10,sChecked;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q10",MODE_PRIVATE).edit() ;
        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox48:
                if (checked)
                    Q10 = "Juraj Droba (SaS,  OľaNO-NOVA, KDH)";
                editor.putString("Q10","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox49);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox50);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox51);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox52);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox53);check1.setChecked(false);
                break;
            case R.id.checkBox49:
                if (checked)
                    Q10 = "Pavol Frešo  (Nezávislý)";
                editor.putString("Q10","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox50);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox51);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox52);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox53);check1.setChecked(false);
                break;
            case R.id.checkBox50:
                if (checked)
                    Q10 = "Milan Ftáčnik (SMER-  SD, SNS, MOST-HÍD)";
                editor.putString("Q10","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox49);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox51);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox52);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox53);check1.setChecked(false);
                break;
            case R.id.checkBox51:
                if (checked)
                    Q10 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                editor.putString("Q10","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox49);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox50);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox52);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox53);check1.setChecked(false);
                break;
            case R.id.checkBox52:
                if (checked)
                    Q10 = "Nikoho";
                editor.putString("Q10","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox49);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox50);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox51);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox53);check1.setChecked(false);
                break;
            case R.id.checkBox53:
                if (checked)
                    Q10 = "Neviem";
                editor.putString("Q10","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox49);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox50);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox51);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox52);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox48);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen11.this, MainActivity.class);
        i.putExtra("Sc11", Q10);
    }


    public void init(){
        button21 = (Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen11.this, Screen12.class);
                CheckBox c2 = (CheckBox)findViewById(R.id.checkBox48);
                CheckBox c3 = (CheckBox)findViewById(R.id.checkBox49);
                CheckBox c4 = (CheckBox)findViewById(R.id.checkBox50);
                CheckBox c1 = (CheckBox)findViewById(R.id.checkBox51);
                CheckBox c5 = (CheckBox)findViewById(R.id.checkBox52);
                CheckBox c6 = (CheckBox)findViewById(R.id.checkBox53);

                if(c1.isChecked() || c2.isChecked() || c3.isChecked() || c4.isChecked() || c5.isChecked() || c6.isChecked()) {
                    startActivity(sendIsChecked(toy));
                    finish();
                }


            }
        });
    }

    public void BackPressed(){
        button20 = (Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen11.this, Screen10.class);
                startActivity(sendIsChecked(toy));
                finish();;
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen11);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc11");
        if (i.getStringExtra("ksc11") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = this.getSharedPreferences("Q10", MODE_PRIVATE);

            String restoredText = settings.getString("Q10", null);
            if (restoredText != null) {
                if (restoredText.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox48);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox49);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox50);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox51);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox52);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox53);
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
//toy.getStringExtra("sc11") == null ||  !toy.getStringExtra("sc11").equals(Q10)
        if(Q10 != null)
            ready.putExtra("sc11", Q10);
        else
            ready.putExtra("sc11", toy.getStringExtra("sc11"));
        ready.putExtra("sc2", toy.getStringExtra("sc2"));
        ready.putExtra("sc3", toy.getStringExtra("sc3"));
        ready.putExtra("sc4", toy.getStringExtra("sc4"));
        ready.putExtra("sc5", toy.getStringExtra("sc5"));
        ready.putExtra("sc6", toy.getStringExtra("sc6"));
        ready.putExtra("sc7", toy.getStringExtra("sc7"));
        ready.putExtra("sc8", toy.getStringExtra("sc8"));
        ready.putExtra("sc9", toy.getStringExtra("sc9"));
        ready.putExtra("sc10", toy.getStringExtra("sc10"));
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



        ready.putExtra("ksc2",toy.getStringExtra("ksc2"));
        ready.putExtra("ksc3",toy.getStringExtra("ksc3"));
        ready.putExtra("ksc4",toy.getStringExtra("ksc4"));
        ready.putExtra("ksc5",toy.getStringExtra("ksc5"));
        ready.putExtra("ksc6",toy.getStringExtra("ksc6"));
        ready.putExtra("ksc7",toy.getStringExtra("ksc7"));
        ready.putExtra("ksc8",toy.getStringExtra("ksc8"));
        ready.putExtra("ksc9",toy.getStringExtra("ksc9"));
        ready.putExtra("ksc10",toy.getStringExtra("ksc10"));
        ready.putExtra("ksc11",sChecked);
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
