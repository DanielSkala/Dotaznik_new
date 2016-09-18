package com.example.daniel.dotaznik;

import android.content.Intent;
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
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox173:
                if (checked)
                    Q25 = "Juraj Droba (SaS, OľaNO-NOVA,  KDH)";
                break;
            case R.id.checkBox174:
                if (checked)
                    Q25 = "Pavol  Frešo  (Nezávislý  )";
                break;
            case R.id.checkBox175:
                if (checked)
                    Q25 = "Milan  Ftáčnik (SMER-  SD, SNS,  MOST-HÍD)";
                break;
            case R.id.checkBox176:
                if (checked)
                    Q25 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                break;
            case R.id.checkBox177:
                if (checked)
                    Q25 = "Nešiel by som voliť";
                break;
            case R.id.checkBox178:
                if (checked)
                    Q25 = "Nikoho";
                break;
            case R.id.checkBox179:
                if (checked)
                    Q25 = "Neviem";
                break;
        }
    }

    public void init(){
        button51 = (Button)findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen26.this, Screen27.class);
                startActivity(toy);

                Intent i = new Intent(Screen26.this, AllData.class);
                i.putExtra("Sc26", Q25);
                startActivity(i);

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
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen26);

        init();
        BackPressed();
    }
}
