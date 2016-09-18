package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen27 extends AppCompatActivity {

    public Button button52;
    public Button button53;
    /*
    String Q26;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox180:
                if (checked)
                    Q26 = "Juraj Droba (SaS, OľaNO-NOVA,  KDH)";
                break;
            case R.id.checkBox181:
                if (checked)
                    Q26 = "Pavol  Frešo  (Nezávislý  )";
                break;
            case R.id.checkBox182:
                if (checked)
                    Q26 = "Milan  Ftáčnik (SMER-  SD, SNS,  MOST-HÍD)";
                break;
            case R.id.checkBox183:
                if (checked)
                    Q26 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                break;
            case R.id.checkBox184:
                if (checked)
                    Q26 = "Nešiel by som voliť";
                break;
            case R.id.checkBox185:
                if (checked)
                    Q26 = "Nikoho";
                break;
            case R.id.checkBox186:
                if (checked)
                    Q26 = "Neviem";
                break;
        }
    }
    */

    public void init(){
        button53 = (Button)findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen27.this, FinalScreen.class);
                startActivity(toy);
/*
                Intent i = new Intent(Screen27.this, AllData.class);
                i.putExtra("Sc27", Q26);
                startActivity(i);
                */

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
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen27);

        init();
        BackPressed();
    }
}
