package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelNumber extends AppCompatActivity {

    public Button button62;
    public Button button64;
    //back
    public void BackPressed(){
        button64 = (Button)findViewById(R.id.button64);
        button64.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(TelNumber.this, Screen27.class);
                startActivity(toy);
                finish();
            }
        });
    }

    public void init(){
        button62 = (Button) findViewById(R.id.button62);
        button62.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final Intent toy2 = new Intent(TelNumber.this, FinalScreen.class);
                startActivity(toy2);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel_number);

        BackPressed();
        init();

    }
}
