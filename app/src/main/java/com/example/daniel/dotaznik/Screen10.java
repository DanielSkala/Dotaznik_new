package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen10 extends AppCompatActivity {

    public Button button18;
    public Button button19;

    public void init(){
        button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen10.this, Screen11.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen10.this, Screen9.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen10);

        init();
        BackPressed();
    }
}
