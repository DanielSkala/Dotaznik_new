package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen26 extends AppCompatActivity {

    public Button button50;
    public Button button51;

    public void init(){
        button51 = (Button)findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen26.this, Screen27.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button50 = (Button)findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen26.this, Screen25.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen26);

        init();
        BackPressed();
    }
}
