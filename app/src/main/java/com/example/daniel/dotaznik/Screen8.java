package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen8 extends AppCompatActivity {

    public Button button14;
    public Button button15;

    public void init(){
        button15 = (Button)findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen8.this, Screen9.class);
                startActivity(toy);
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
