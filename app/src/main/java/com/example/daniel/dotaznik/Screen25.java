package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen25 extends AppCompatActivity {

    public Button button48;
    public Button button49;
    String Q24;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox168:
                if (checked)
                    Q24 = "Definitívne";
                break;
            case R.id.checkBox169:
                if (checked)
                    Q24 = "Skôr definitívne";
                break;
            case R.id.checkBox170:
                if (checked)
                    Q24 = "Skôr nie je definitívne";
                break;
            case R.id.checkBox171:
                if (checked)
                    Q24 = "Nie je definitívne";
                break;
            case R.id.checkBox172:
                if (checked)
                    Q24 = "Neviem";
                break;
        }
    }

    public void init(){
        button49 = (Button)findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen25.this, Screen26.class);
                startActivity(toy);

                Intent i = new Intent(Screen25.this, AllData.class);
                i.putExtra("Sc25", Q24);
                startActivity(i);

            }
        });
    }

    public void BackPressed(){
        button48 = (Button)findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen25.this, Screen24.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen25);

        init();
        BackPressed();
    }
}
