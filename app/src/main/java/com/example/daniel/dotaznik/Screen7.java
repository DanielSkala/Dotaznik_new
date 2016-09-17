package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen7 extends AppCompatActivity {

    public Button button12;
    public Button button13;

    public void init(){
        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen7.this, Screen8.class);
                startActivity(toy);
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
