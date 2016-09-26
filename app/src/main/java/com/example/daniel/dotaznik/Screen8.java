package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen8 extends AppCompatActivity {

    public Button button14;
    public Button button15;

    String Q7;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q7",MODE_PRIVATE).edit() ;
        // Check which checkbox was clicked
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox13:
                if (checked)
                    Q7 = "Milan Vtáčnik";
                editor.putString("Q7",Q7);
                editor.commit();
                CheckBox check = (CheckBox) findViewById(R.id.checkBox14);check.setChecked(false);
                CheckBox check2 = (CheckBox) findViewById(R.id.checkBox15);check2.setChecked(false);
                CheckBox check3 = (CheckBox) findViewById(R.id.checkBox16);check3.setChecked(false);
                break;
            case R.id.checkBox14:
                if (checked)
                    Q7 = "Ivo Nesrovnal";
                editor.putString("Q7",Q7);
                editor.commit();
                CheckBox check4 = (CheckBox) findViewById(R.id.checkBox13);check4.setChecked(false);
                CheckBox check5 = (CheckBox) findViewById(R.id.checkBox15);check5.setChecked(false);
                CheckBox check6 = (CheckBox) findViewById(R.id.checkBox16);check6.setChecked(false);
                break;
            case R.id.checkBox15:
                if (checked)
                    Q7 = "Pavol Frešo";
                editor.putString("Q7",Q7);
                editor.commit();
                CheckBox check7 = (CheckBox) findViewById(R.id.checkBox14);check7.setChecked(false);
                CheckBox check8 = (CheckBox) findViewById(R.id.checkBox13);check8.setChecked(false);
                CheckBox check9 = (CheckBox) findViewById(R.id.checkBox16);check9.setChecked(false);
                break;
            case R.id.checkBox16:
                if (checked)
                    Q7 = "Neviem";
                editor.putString("Q7",Q7);
                editor.commit();
                CheckBox check10 = (CheckBox) findViewById(R.id.checkBox14);check10.setChecked(false);
                CheckBox check11 = (CheckBox) findViewById(R.id.checkBox15);check11.setChecked(false);
                CheckBox check12 = (CheckBox) findViewById(R.id.checkBox13);check12.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen8.this, MainActivity.class);
        i.putExtra("Sc8", Q7);
    }

    public void init(){
        button15 = (Button)findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen8.this, Screen9.class);
                startActivity(toy);




            }
        });
    }

    public void BackPressed(){
        button14 = (Button)findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen8.this, Screen7.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);

        SharedPreferences settings = this.getSharedPreferences("Q7", MODE_PRIVATE);

        String restoredText = settings.getString("Q7", null);
        if (restoredText != null) {
            if(restoredText.equals("Milan Vtáčnik"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox13);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Ivo Nesrovnal"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox14);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Pavol Frešo"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox15);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Neviem"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox16);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
