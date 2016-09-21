package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen9 extends AppCompatActivity {

    public Button button16;
    public Button button17;
/*
    String Q8;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox17:
                if (checked)
                    Q8 = "Pavol Frešo (SDKÚ-DS)";
                break;
            case R.id.checkBox18:
                if (checked)
                    Q8 = "Monika Flašíková Beňová (SMER-SD)";
                break;
            case R.id.checkBox19:
                if (checked)
                    Q8 = "Daniel Krajcer  (NOVA – D. Lipšic)";
                break;
            case R.id.checkBox20:
                if (checked)
                    Q8 = "Jaroslav Paška  (SNS)";
                break;
            case R.id.checkBox21:
                if (checked)
                    Q8 = "Karol Ondriáš  (KSS)";
                break;
            case R.id.checkBox22:
                if (checked)
                    Q8 = "Peter Marček  (SOSKA)";
                break;
            case R.id.checkBox23:
                if (checked)
                    Q8 = "Roman Ruhig (NOVÝ  PARLAMENT)";
                break;
            case R.id.checkBox24:
                if (checked)
                    Q8 = "Zdenka Beňová  (ĽS-NS – M. Kotleba)";
                break;
            case R.id.checkBox25:
                if (checked)
                    Q8 = "Rastislav Blaško  (Nezávislý)";
                break;
            case R.id.checkBox26:
                if (checked)
                    Q8 = "Anton Čulen  (Magnificant Slovakia)";
                break;
            case R.id.checkBox27:
                if (checked)
                    Q8 = "Oskar Dobrovodský  (Národ a Spravodlivosť)";
                break;
            case R.id.checkBox28:
                if (checked)
                    Q8 = "Gabriel Karácsony  (PRIAMA DEMOKRACIA)";
                break;
            case R.id.checkBox29:
                if (checked)
                    Q8 = "Nikoho";
                break;
            case R.id.checkBox30:
                if (checked)
                    Q8 = "Neviem";
                break;
            case R.id.checkBox31:
                if (checked)
                    Q8 = "Nevolil som";
                break;
        }
    }
*/

    public void init(){
        button17 = (Button)findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen9.this, Screen10.class);
                startActivity(toy);

                //Intent i = new Intent(Screen9.this, MainActivity.class);
                //i.putExtra("Sc9", Q8);


            }
        });
    }

    public void BackPressed(){
        button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen9.this, Screen8.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);

        init();
        BackPressed();
    }
}
