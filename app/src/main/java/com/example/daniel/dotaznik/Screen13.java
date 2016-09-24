package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen13 extends AppCompatActivity {

    public Button button24;
    public Button button25;

    public void init(){
        button25 = (Button)findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen13.this, Screen14.class);

                EditText editText = (EditText) findViewById(R.id.editText20);
                String Q12 = editText.getText().toString();
                Intent info = new Intent (Screen13.this, MainActivity.class);
                info.putExtra("sc13", Q12);

                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button24 = (Button)findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen13.this, Screen12.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen13);



        init();
        BackPressed();
    }
}
