package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen12 extends AppCompatActivity {

    public Button button22;
    public Button button23;



    public void init(){
        button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen12.this, Screen13.class);

                SharedPreferences.Editor editor = getSharedPreferences("Q11",MODE_PRIVATE).edit() ;


                EditText editText = (EditText) findViewById(R.id.editText17);
                String Q11 = editText.getText().toString();
                Intent info = new Intent (Screen12.this, MainActivity.class);
                info.putExtra("sc12", Q11);



                editor.putString("Q11",Q11);
                editor.commit();


                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen12.this, Screen11.class);


                EditText editText = (EditText) findViewById(R.id.editText17);
                String Q11 = editText.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("Q11",MODE_PRIVATE).edit() ;
                editor.putString("Q11",Q11);
                editor.commit();
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen12);

        SharedPreferences settings = this.getSharedPreferences("Q11", MODE_PRIVATE);
        String restoredText = settings.getString("Q11", null);
        if (restoredText != null) {
            EditText editText = (EditText) findViewById(R.id.editText17);
            editText.setText(restoredText);
        }

        init();
        BackPressed();
    }
}
