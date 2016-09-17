package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen25 extends AppCompatActivity {

    public Button button48;
    public Button button49;

    public void init(){
        button49 = (Button)findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen25.this, Screen26.class);
                startActivity(toy);
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
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen25);

        init();
        BackPressed();
    }
}
