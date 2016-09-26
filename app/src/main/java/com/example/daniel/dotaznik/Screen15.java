package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
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

                SharedPreferences.Editor editor = getSharedPreferences("Q14",MODE_PRIVATE).edit() ;
                editor.putString("Q14",Q14);
                editor.commit();


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


                EditText editText = (EditText) findViewById(R.id.editText26);
                String Q14 = editText.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("Q14",MODE_PRIVATE).edit() ;
                editor.putString("Q14",Q14);
                editor.commit();
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen15);

        SharedPreferences settings = this.getSharedPreferences("Q14", MODE_PRIVATE);
        String restoredText = settings.getString("Q14", null);
        if (restoredText != null) {
            EditText editText = (EditText) findViewById(R.id.editText26);
            editText.setText(restoredText);
        }

        init();
        BackPressed();
    }
}
