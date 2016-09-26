package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
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
        SharedPreferences.Editor editor = getSharedPreferences("Q4",MODE_PRIVATE).edit() ;
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox6:
                if (checked)
                    Q4 = "Základné";
                editor.putString("Q4",Q4);
                editor.commit();
                CheckBox check = (CheckBox) findViewById(R.id.checkBox7);check.setChecked(false);
                CheckBox check2 = (CheckBox) findViewById(R.id.checkBox8);check2.setChecked(false);
                CheckBox check3 = (CheckBox) findViewById(R.id.checkBox9);check3.setChecked(false);
                break;
            case R.id.checkBox7:
                if (checked)
                    Q4 = "Stredoškolské bez maturity";
                editor.putString("Q4",Q4);
                editor.commit();
                CheckBox check4 = (CheckBox) findViewById(R.id.checkBox6);check4.setChecked(false);
                CheckBox check5 = (CheckBox) findViewById(R.id.checkBox8);check5.setChecked(false);
                CheckBox check6 = (CheckBox) findViewById(R.id.checkBox9);check6.setChecked(false);
                break;
            case R.id.checkBox8:
                if (checked)
                    Q4 = "Stredoškolské s maturitou";
                editor.putString("Q4",Q4);
                editor.commit();
                CheckBox check7 = (CheckBox) findViewById(R.id.checkBox7);check7.setChecked(false);
                CheckBox check8 = (CheckBox) findViewById(R.id.checkBox6);check8.setChecked(false);
                CheckBox check9 = (CheckBox) findViewById(R.id.checkBox9);check9.setChecked(false);
                break;
            case R.id.checkBox9:
                if (checked)
                    Q4 = "Vysokoškolské";
                editor.putString("Q4",Q4);
                editor.commit();
                CheckBox check10 = (CheckBox) findViewById(R.id.checkBox7);check10.setChecked(false);
                CheckBox check11 = (CheckBox) findViewById(R.id.checkBox8);check11.setChecked(false);
                CheckBox check12 = (CheckBox) findViewById(R.id.checkBox6);check12.setChecked(false);
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
        SharedPreferences settings = this.getSharedPreferences("Q4", MODE_PRIVATE);

        String restoredText = settings.getString("Q4", null);
        if (restoredText != null) {
            if(restoredText.equals("Základné"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox6);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Stredoškolské bez maturity"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox7);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Stredoškolské s maturitou"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox8);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Vysokoškolské"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox9);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
