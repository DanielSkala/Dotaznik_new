package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen23 extends AppCompatActivity {

    public Button button44;
    public Button button45;

    public void init(){
        button45 = (Button)findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen23.this, Screen24.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button44 = (Button)findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen23.this, Screen22.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen23);

        init();
        BackPressed();
    }
}
