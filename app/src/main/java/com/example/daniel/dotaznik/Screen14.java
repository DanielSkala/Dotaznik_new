package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen14 extends AppCompatActivity {

    public Button button26;
    public Button button27;


    public void init(){
        button27 = (Button)findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen14.this, Screen15.class);

                EditText editText = (EditText) findViewById(R.id.editText23);
                String Q13 = editText.getText().toString();
                Intent info = new Intent (Screen14.this, MainActivity.class);
                info.putExtra("sc14", Q13);


                SharedPreferences.Editor editor = getSharedPreferences("Q13",MODE_PRIVATE).edit() ;
                editor.putString("Q13",Q13);
                editor.commit();

                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button26 = (Button)findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen14.this, Screen13.class);


                EditText editText = (EditText) findViewById(R.id.editText23);
                String Q13 = editText.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("Q13",MODE_PRIVATE).edit() ;
                editor.putString("Q13",Q13);
                editor.commit();
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen14);

        SharedPreferences settings = this.getSharedPreferences("Q13", MODE_PRIVATE);
        String restoredText = settings.getString("Q13", null);
        if (restoredText != null) {
            EditText editText = (EditText) findViewById(R.id.editText23);
            editText.setText(restoredText);
        }

        init();
        BackPressed();
    }
}
