package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen18 extends AppCompatActivity {

    public Button button34;
    public Button button35;
    /*
    public EditText editText;

    String Q17 = editText.getText().toString();
    */

    public void init(){
        button35 = (Button)findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen18.this, Screen19.class);

                EditText editText = (EditText) findViewById(R.id.editText43);
                String Q17 = editText.getText().toString();
                Intent info = new Intent (Screen18.this, MainActivity.class);
                info.putExtra("sc18", Q17);

                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button34 = (Button)findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen18.this, Screen17.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen18);


        init();
        BackPressed();
    }
}
