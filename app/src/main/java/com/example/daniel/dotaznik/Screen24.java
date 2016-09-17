package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen24 extends AppCompatActivity {

    public Button button46;
    public Button button47;

    public void init(){
        button47 = (Button)findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen24.this, Screen25.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button46 = (Button)findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen24.this, Screen23.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen24);

        init();
        BackPressed();
    }
}
