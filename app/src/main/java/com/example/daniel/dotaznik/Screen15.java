package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen15 extends AppCompatActivity {

    public Button button28;
    public Button button29;
    /*
    public EditText editText;

    String Q14 = editText.getText().toString();
    */

    public void init(){
        button29 = (Button)findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen15.this, Screen16.class);
                startActivity(toy);
/*
                Intent i = new Intent(Screen15.this, AllData.class);
                i.putExtra("Sc15", Q14);
                startActivity(i);
                */

            }
        });
    }

    public void BackPressed(){
        button28 = (Button)findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen15.this, Screen14.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen15);

        //editText = (EditText) findViewById(R.id.editText26);

        init();
        BackPressed();
    }
}
