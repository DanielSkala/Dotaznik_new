package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen12 extends AppCompatActivity {

    public Button button22;
    public Button button23;
    public EditText editText;

    String Q11 = editText.getText().toString();

    public void init(){
        button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen12.this, Screen13.class);
                startActivity(toy);

                Intent i = new Intent(Screen12.this, AllData.class);
                i.putExtra("Sc12", Q11);
                startActivity(i);

            }
        });
    }

    public void BackPressed(){
        button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen12.this, Screen11.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen12);

        editText = (EditText) findViewById(R.id.editText17);

        init();
        BackPressed();
    }
}
