package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen11 extends AppCompatActivity {

    public Button button20;
    public Button button21;
    String Q10;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox48:
                if (checked)
                    Q10 = "Juraj Droba (SaS,  OľaNO-NOVA, KDH)";
                break;
            case R.id.checkBox49:
                if (checked)
                    Q10 = "Pavol Frešo  (Nezávislý)";
                break;
            case R.id.checkBox50:
                if (checked)
                    Q10 = "Milan Ftáčnik (SMER-  SD, SNS, MOST-HÍD)";
                break;
            case R.id.checkBox51:
                if (checked)
                    Q10 = "Boris Kollár (SME  RODINA – Boris Kollár)";
                break;
            case R.id.checkBox52:
                if (checked)
                    Q10 = "Nikoho";
                break;
            case R.id.checkBox53:
                if (checked)
                    Q10 = "Neviem";
                break;
        }
    }

    public void init(){
        button21 = (Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen11.this, Screen12.class);
                startActivity(toy);

                Intent i = new Intent(Screen11.this, AllData.class);
                i.putExtra("Sc11", Q10);
                startActivity(i);

            }
        });
    }

    public void BackPressed(){
        button20 = (Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen11.this, Screen10.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen11);

        init();
        BackPressed();
    }
}
