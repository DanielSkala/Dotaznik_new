package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen2 extends AppCompatActivity {

    public Button button2;
    public Button button3;
/*
    String Q1;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked)
                    Q1 = "Áno";
                break;
            case R.id.checkBox2:
                if (checked)
                    Q1 = "Nie";
                break;
            case R.id.checkBox3:
                if (checked)
                    Q1 = "Neviem";
                break;
        }
    }
    */

    public void init(){
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen2.this, Screen3.class);
                startActivity(toy);
/*
                Intent i = new Intent(Screen2.this, AllData.class);
                i.putExtra("Sc2", Q1);
                startActivity(i);
                */

            }
        });
    }

    public void BackPressed(){
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen2.this, MainActivity.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        init();
        BackPressed();

    }


}
