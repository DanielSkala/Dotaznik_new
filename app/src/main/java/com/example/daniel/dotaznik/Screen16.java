package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen16 extends AppCompatActivity {

    public Button button30;
    public Button button31;

    public void init(){
        button31 = (Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen16.this, Screen17.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button30 = (Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen16.this, Screen15.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen16);

        init();
        BackPressed();
    }
}
