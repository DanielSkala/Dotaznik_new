package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen5 extends AppCompatActivity {

    public Button button8;
    public Button button9;

    String Q4;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox6:
                if (checked)
                    Q4 = "Základné";
                break;
            case R.id.checkBox7:
                if (checked)
                    Q4 = "Stredoškolské bez maturity";
                break;
            case R.id.checkBox8:
                if (checked)
                    Q4 = "Stredoškolské s maturitou";
                break;
            case R.id.checkBox9:
                if (checked)
                    Q4 = "Vysokoškolské";
                break;
        }
        Intent i = new Intent(Screen5.this, MainActivity.class);
        i.putExtra("Sc5", Q4);
    }



    public void init(){
        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen5.this, Screen6.class);
                startActivity(toy);
                finish();



            }
        });
    }

    public void BackPressed(){
        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen5.this, Screen4.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);

        init();
        BackPressed();
    }
}
