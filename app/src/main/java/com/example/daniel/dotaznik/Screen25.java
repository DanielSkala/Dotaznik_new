package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen25 extends AppCompatActivity {

    public Button button48;
    public Button button49;

    String Q24;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q24",MODE_PRIVATE).edit() ;
        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox168:
                if (checked)
                    Q24 = "Definitívne";
                editor.putString("Q24","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox169);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox170);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox171);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox172);check1.setChecked(false);
                break;
            case R.id.checkBox169:
                if (checked)
                    Q24 = "Skôr definitívne";
                editor.putString("Q24","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox168);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox170);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox171);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox172);check1.setChecked(false);
                break;
            case R.id.checkBox170:
                if (checked)
                    Q24 = "Skôr nie je definitívne";
                editor.putString("Q24","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox169);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox168);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox171);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox172);check1.setChecked(false);
                break;
            case R.id.checkBox171:
                if (checked)
                    Q24 = "Nie je definitívne";
                editor.putString("Q24","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox169);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox170);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox168);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox172);check1.setChecked(false);
                break;
            case R.id.checkBox172:
                if (checked)
                    Q24 = "Neviem";
                editor.putString("Q24","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox169);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox170);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox171);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox168);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen25.this, MainActivity.class);
        i.putExtra("Sc25", Q24);

    }


    public void init(){
        button49 = (Button)findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen25.this, Screen26.class);
                startActivity(toy);
                finish();


            }
        });
    }

    public void BackPressed(){
        button48 = (Button)findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen25.this, Screen24.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen25);

        SharedPreferences settings = getSharedPreferences("Q24",MODE_PRIVATE);
        String restoredText =   settings.getString("Q24", null);


        if (restoredText != null) {
            if (restoredText.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox168);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox169);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox170);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox171);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox172);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
