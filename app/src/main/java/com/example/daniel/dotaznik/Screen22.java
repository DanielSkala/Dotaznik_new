package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen22 extends AppCompatActivity {

    public Button button42;
    public Button button43;


    public void init(){
        button43 = (Button)findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen22.this, Screen23.class);

                EditText editText = (EditText) findViewById(R.id.editText53);
                String Q2 = editText.getText().toString();
                Intent info = new Intent (Screen22.this, MainActivity.class);
                info.putExtra("sc22", Q2);

                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button42 = (Button)findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen22.this, Screen21.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen22);



        init();
        BackPressed();
    }
}
