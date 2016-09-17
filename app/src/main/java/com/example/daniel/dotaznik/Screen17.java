package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen17 extends AppCompatActivity {

    public Button button32;
    public Button button33;

    public void init(){
        button33 = (Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen17.this, Screen18.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button32 = (Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen17.this, Screen16.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen17);

        init();
        BackPressed();
    }
}
