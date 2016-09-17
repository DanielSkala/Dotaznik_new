package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen21 extends AppCompatActivity {

    public Button button40;
    public Button button41;

    public void init(){
        button41 = (Button)findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen21.this, Screen22.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button40 = (Button)findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen21.this, Screen20.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen21);

        init();
        BackPressed();
    }
}
