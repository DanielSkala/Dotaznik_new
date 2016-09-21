package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen10 extends AppCompatActivity {

    public Button button18;
    public Button button19;

    String Q9;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox32:
                if (checked)
                    Q9 = "KDH";
                break;
            case R.id.checkBox33:
                if (checked)
                    Q9 = "KSS";
                break;
            case R.id.checkBox34:
                if (checked)
                    Q9 = "ĽS Naše Slovenskostrana Mariana Kotlebu";
                break;
            case R.id.checkBox35:
                if (checked)
                    Q9 = "MOST-HÍD";
                break;
            case R.id.checkBox36:
                if (checked)
                    Q9 = "OĽANO-NOVA";
                break;
            case R.id.checkBox37:
                if (checked)
                    Q9 = "SaS";
                break;
            case R.id.checkBox38:
                if (checked)
                    Q9 = "SDKÚ-DS";
                break;
            case R.id.checkBox39:
                if (checked)
                    Q9 = "SIEŤ";
                break;
            case R.id.checkBox40:
                if (checked)
                    Q9 = "SKOK";
                break;
            case R.id.checkBox41:
                if (checked)
                    Q9 = "SMER-SD";
                break;
            case R.id.checkBox42:
                if (checked)
                    Q9 = "SMK-MKP";
                break;
            case R.id.checkBox43:
                if (checked)
                    Q9 = "SME RODINA Boris Kollár";
                break;
            case R.id.checkBox44:
                if (checked)
                    Q9 = "SNS";
                break;
            case R.id.checkBox48:
                if (checked)
                    Q9 = "Nešiel by som voliť";
                break;
            case R.id.checkBox46:
                if (checked)
                    Q9 = "Žiadnu";
                break;
            case R.id.checkBox47:
                if (checked)
                    Q9 = "Neviem";
                break;

        }
    }


    public void init(){
        button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen10.this, Screen11.class);
                startActivity(toy);

                Intent i = new Intent(Screen10.this, MainActivity.class);
                i.putExtra("Sc10", Q9);


            }
        });
    }

    public void BackPressed(){
        button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen10.this, Screen9.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen10);

        init();
        BackPressed();
    }
}
