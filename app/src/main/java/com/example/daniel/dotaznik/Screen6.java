package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen6 extends AppCompatActivity {

    public Button button10;
    public Button button11;

    //public EditText editText;

    //String Q5 = editText.getText().toString();


    public void init(){
        button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen6.this, Screen7.class);
                startActivity(toy);

                //Intent i = new Intent(Screen6.this, MainActivity.class);
                //i.putExtra("Sc6", Q5);


            }
        });
    }

    public void BackPressed(){
        button10 = (Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen6.this, Screen5.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);

        //editText = (EditText) findViewById(R.id.editText50);

        init();
        BackPressed();
    }
}
