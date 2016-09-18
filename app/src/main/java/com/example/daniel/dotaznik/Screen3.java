package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen3 extends AppCompatActivity {

    public Button button4;
    public Button button5;
    public EditText editText;

    String Q2 = editText.getText().toString();

    public void init(){
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen3.this, Screen4.class);
                startActivity(toy);

                Intent i = new Intent(Screen3.this, AllData.class);
                i.putExtra("Sc3", Q2);
                startActivity(i);

            }

        });
    }

    public void BackPressed(){
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen3.this, Screen2.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        editText = (EditText) findViewById(R.id.editText9);

        init();
        BackPressed();
    }
}
