package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen19 extends AppCompatActivity {

    public Button button36;
    public Button button37;

    public void init(){
        button37 = (Button)findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen19.this, Screen20.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button36 = (Button)findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen19.this, Screen18.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen19);

        init();
        BackPressed();
    }
}
