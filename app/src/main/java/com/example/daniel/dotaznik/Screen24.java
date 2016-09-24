package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen24 extends AppCompatActivity {

    public Button button46;
    public Button button47;
    /*
    public EditText editText;

    String Q23 = editText.getText().toString();
    */

    public void init(){
        button47 = (Button)findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen24.this, Screen25.class);

                EditText editText = (EditText) findViewById(R.id.editText59);
                String Q2 = editText.getText().toString();
                Intent info = new Intent (Screen24.this, MainActivity.class);
                info.putExtra("sc24", Q2);

                startActivity(toy);
                finish();
            }
        });
    }

    public void BackPressed(){
        button46 = (Button)findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen24.this, Screen23.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen24);

        //editText = (EditText) findViewById(R.id.editText59);

        init();
        BackPressed();
    }
}
