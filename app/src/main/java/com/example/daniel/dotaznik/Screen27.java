package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen27 extends AppCompatActivity {

    public Button button52;
    public Button button53;

    public void init(){
        button53 = (Button)findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen27.this, FinalScreen.class);
                startActivity(toy);
            }
        });
    }

    public void BackPressed(){
        button52 = (Button)findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen27.this, Screen26.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen27);

        init();
        BackPressed();
    }
}
