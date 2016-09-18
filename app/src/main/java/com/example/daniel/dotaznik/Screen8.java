package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen8 extends AppCompatActivity {

    public Button button14;
    public Button button15;
    /*
    String Q7;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox13:
                if (checked)
                    Q7 = "Milan Vtáčnik";
                break;
            case R.id.checkBox14:
                if (checked)
                    Q7 = "Ivo Nesrovnal";
                break;
            case R.id.checkBox15:
                if (checked)
                    Q7 = "Pavol Frešo";
                break;
            case R.id.checkBox16:
                if (checked)
                    Q7 = "Neviem";
                break;
        }
    }
    */

    public void init(){
        button15 = (Button)findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen8.this, Screen9.class);
                startActivity(toy);
/*
                Intent i = new Intent(Screen8.this, AllData.class);
                i.putExtra("Sc8", Q7);
                startActivity(i);
                */

            }
        });
    }

    public void BackPressed(){
        button14 = (Button)findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen8.this, Screen7.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);

        init();
        BackPressed();
    }
}
