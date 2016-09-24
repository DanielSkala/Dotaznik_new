package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen23 extends AppCompatActivity {

    public Button button44;
    public Button button45;

    String Q22;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox161:
                if (checked)
                    Q22 = "Juraj Droba (SaS, OľaNO-NOVA,  KDH)";
                break;
            case R.id.checkBox162:
                if (checked)
                    Q22 = "Pavol  Frešo  (Nezávislý  )";
                break;
            case R.id.checkBox163:
                if (checked)
                    Q22 = "Milan  Ftáčnik (SMER-  SD, SNS,  MOST-HÍD)";
                break;
            case R.id.checkBox164:
                if (checked)
                    Q22 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                break;
            case R.id.checkBox165:
                if (checked)
                    Q22 = "Nešiel by som voliť";
                break;
            case R.id.checkBox167:
                if (checked)
                    Q22 = "Nikoho";
                break;
            case R.id.checkBox166:
                if (checked)
                    Q22 = "Neviem";
                break;
        }
        Intent i = new Intent(Screen23.this, MainActivity.class);
        i.putExtra("Sc23", Q22);
    }


    public void init(){
        button45 = (Button)findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen23.this, Screen24.class);
                startActivity(toy);
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
                startActivity(toy);
                finish();




            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen23);

        init();
        BackPressed();
    }
}
