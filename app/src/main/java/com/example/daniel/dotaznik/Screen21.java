package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen21 extends AppCompatActivity {

    public Button button40;
    public Button button41;


    public void init(){
        button41 = (Button)findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen21.this, Screen22.class);

                EditText editText = (EditText) findViewById(R.id.editText51);
                String Q2 = editText.getText().toString();
                Intent info = new Intent (Screen21.this, MainActivity.class);
                info.putExtra("sc21", Q2);

                startActivity(toy);
                finish();
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
                finish();
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
