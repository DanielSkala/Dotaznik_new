package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen7 extends AppCompatActivity {

    public Button button12;
    public Button button13;
    /*
    String Q6;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox10:
                if (checked)
                    Q6 = "Áno";
                break;
            case R.id.checkBox11:
                if (checked)
                    Q6 = "Nie";
                break;
            case R.id.checkBox12:
                if (checked)
                    Q6 = "Neviem";
                break;
        }
    }
    */

    public void init(){
        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen7.this, Screen8.class);
                startActivity(toy);
/*
                Intent i = new Intent(Screen7.this, AllData.class);
                i.putExtra("Sc7", Q6);
                startActivity(i);
                */

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
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);

        init();
        BackPressed();
    }
}
