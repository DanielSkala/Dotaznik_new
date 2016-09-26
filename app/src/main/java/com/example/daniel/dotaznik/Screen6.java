package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen6 extends AppCompatActivity {

    public Button button10;
    public Button button11;



    public void init(){
        button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen6.this, Screen7.class);


                EditText editText = (EditText) findViewById(R.id.editText50);
                String Q5 = editText.getText().toString();
                Intent info = new Intent (Screen6.this, MainActivity.class);
                info.putExtra("sc6", Q5);

                SharedPreferences.Editor editor = getSharedPreferences("Q5",MODE_PRIVATE).edit() ;
                editor.putString("Q5",Q5);
                editor.commit();

                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button10 = (Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen6.this, Screen5.class);

                EditText editText = (EditText) findViewById(R.id.editText50);
                String Q5 = editText.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("Q5",MODE_PRIVATE).edit() ;
                editor.putString("Q5",Q5);
                editor.commit();
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);
        SharedPreferences settings = this.getSharedPreferences("Q5", MODE_PRIVATE);
        String restoredText = settings.getString("Q5", null);
        if (restoredText != null) {
            EditText editText = (EditText) findViewById(R.id.editText50);
            editText.setText(restoredText);
        }



        init();
        BackPressed();
    }
}
