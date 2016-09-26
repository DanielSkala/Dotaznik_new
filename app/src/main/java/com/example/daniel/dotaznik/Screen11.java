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

    String Q10;

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
                startActivity(toy);
                finish();




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
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen11);

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
        init();
        BackPressed();
    }
}
