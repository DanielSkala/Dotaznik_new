package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen17 extends AppCompatActivity {

    public Button button32;
    public Button button33;
    String Q16;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox90:
                if (checked)
                    Q16 = "Spokojný";
                break;
            case R.id.checkBox91:
                if (checked)
                    Q16 = "Skôr spokojný";
                break;
            case R.id.checkBox92:
                if (checked)
                    Q16 = "Skôr nespokojný";
                break;
            case R.id.checkBox93:
                if (checked)
                    Q16 = "Nespokojný";
                break;
            case R.id.checkBox94:
                if (checked)
                    Q16 = "Neviem";
                break;
        }
    }

    public void init(){
        button33 = (Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen17.this, Screen18.class);
                startActivity(toy);

                Intent i = new Intent(Screen17.this, AllData.class);
                i.putExtra("Sc17", Q16);
                startActivity(i);

            }
        });
    }

    public void BackPressed(){
        button32 = (Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen17.this, Screen16.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen17);

        init();
        BackPressed();
    }
}
