package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
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

                SharedPreferences.Editor editor = getSharedPreferences("Q12",MODE_PRIVATE).edit() ;
                editor.putString("Q12",Q12);
                editor.commit();

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


                EditText editText = (EditText) findViewById(R.id.editText20);
                String Q12 = editText.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("Q12",MODE_PRIVATE).edit() ;
                editor.putString("Q12",Q12);
                editor.commit();
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen13);


        SharedPreferences settings = this.getSharedPreferences("Q12", MODE_PRIVATE);
        String restoredText = settings.getString("Q12", null);
        if (restoredText != null) {
            EditText editText = (EditText) findViewById(R.id.editText20);
            editText.setText(restoredText);
        }

        init();
        BackPressed();
    }
}
