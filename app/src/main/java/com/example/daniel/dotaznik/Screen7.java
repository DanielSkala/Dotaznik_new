package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen7 extends AppCompatActivity {

    public Button button12;
    public Button button13;

    String Q6;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q6",MODE_PRIVATE).edit() ;
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox10:
                if (checked)
                    Q6 = "Áno";
                editor.putString("Q6",Q6);
                editor.commit();
                CheckBox check = (CheckBox) findViewById(R.id.checkBox11);check.setChecked(false);
                CheckBox check2 = (CheckBox) findViewById(R.id.checkBox12);check2.setChecked(false);
                break;
            case R.id.checkBox11:
                if (checked)
                    Q6 = "Nie";
                editor.putString("Q6",Q6);
                editor.commit();
                CheckBox check3 = (CheckBox) findViewById(R.id.checkBox10);check3.setChecked(false);
                CheckBox check4 = (CheckBox) findViewById(R.id.checkBox12);check4.setChecked(false);
                break;
            case R.id.checkBox12:
                if (checked)
                    Q6 = "Neviem";
                editor.putString("Q6",Q6);
                editor.commit();
                CheckBox check5 = (CheckBox) findViewById(R.id.checkBox11);check5.setChecked(false);
                CheckBox check6 = (CheckBox) findViewById(R.id.checkBox10);check6.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen7.this, MainActivity.class);
        i.putExtra("Sc7", Q6);
    }



    public void init(){
        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen7.this, Screen8.class);
                startActivity(toy);
                finish();


            }
        });
    }

    public void BackPressed(){
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen7.this, Screen6.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);

        SharedPreferences settings = this.getSharedPreferences("Q6", MODE_PRIVATE);

        String restoredText = settings.getString("Q6", null);
        if (restoredText != null) {
            if(restoredText.equals("Áno"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox10);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Nie"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox11);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Neviem"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox12);
                checkBox.setChecked(true);
            }
        }

        init();
        BackPressed();
    }
}
