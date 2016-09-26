package com.example.daniel.dotaznik;

import android.content.Intent;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import static android.content.Context.MODE_PRIVATE;

public class Screen2 extends AppCompatActivity {

    public Button button2;
    public Button button3;

    String Q1;


    SharedPreferences settings = getSharedPreferences("lol", MODE_PRIVATE);
    SharedPreferences.Editor editor = settings.edit() ;



        public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked)
                    Q1 = "Áno";
                    editor.putString("Q1",Q1);
                    editor.commit();
                break;
            case R.id.checkBox2:
                if (checked)
                    Q1 = "Nie";
                    editor.putString("Q1",Q1);
                    editor.commit();
                break;
            case R.id.checkBox3:
                if (checked)
                    Q1 = "Neviem";
                    editor.putString("Q1",Q1);
                    editor.commit();
                break;
        }

            Intent i = new Intent(Screen2.this, MainActivity.class);
            i.putExtra("Sc2", Q1);
    }



    public void init(){
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen2.this, Screen3.class);
                startActivity(toy);
                finish();
            }
        });
    }

    public void BackPressed(){
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen2.this, MainActivity.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        String restoredText = settings.getString("Q1", null);
        if (restoredText != null) {
            if(restoredText.equals("Áno"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Nie"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox2);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Neviem"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3);
                checkBox.setChecked(true);
            }
        }


        init();
        BackPressed();

    }



}
