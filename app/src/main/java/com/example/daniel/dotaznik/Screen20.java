package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen20 extends AppCompatActivity {

    public Button button38;
    public Button button39;

    public void init(){
        button39 = (Button)findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen20.this, Screen21.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button38 = (Button)findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen20.this, Screen19.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen20);

        init();
        BackPressed();
    }
}
