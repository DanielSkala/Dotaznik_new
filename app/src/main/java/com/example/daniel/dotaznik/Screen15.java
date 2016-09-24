package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen15 extends AppCompatActivity {

    public Button button28;
    public Button button29;


    public void init(){
        button29 = (Button)findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen15.this, Screen16.class);

                EditText editText = (EditText) findViewById(R.id.editText26);
                String Q14 = editText.getText().toString();
                Intent info = new Intent (Screen15.this, MainActivity.class);
                info.putExtra("sc15", Q14);

                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button28 = (Button)findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen15.this, Screen14.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen15);



        init();
        BackPressed();
    }
}
