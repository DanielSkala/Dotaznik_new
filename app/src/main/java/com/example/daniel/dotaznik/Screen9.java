package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen9 extends AppCompatActivity {

    public Button button16;
    public Button button17;

    public void init(){
        button17 = (Button)findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen9.this, Screen10.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen9.this, Screen8.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);

        init();
        BackPressed();
    }
}
