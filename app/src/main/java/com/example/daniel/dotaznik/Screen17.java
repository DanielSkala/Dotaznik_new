package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
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
        SharedPreferences.Editor editor = getSharedPreferences("Q16",MODE_PRIVATE).edit() ;
        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox90:
                if (checked)
                    Q16 = "Spokojný";
                editor.putString("Q16","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox91);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox92);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox93);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox94);check1.setChecked(false);
                break;
            case R.id.checkBox91:
                if (checked)
                    Q16 = "Skôr spokojný";
                editor.putString("Q16","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox90);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox92);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox93);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox94);check1.setChecked(false);
                break;
            case R.id.checkBox92:
                if (checked)
                    Q16 = "Skôr nespokojný";
                editor.putString("Q16","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox91);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox90);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox93);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox94);check1.setChecked(false);
                break;
            case R.id.checkBox93:
                if (checked)
                    Q16 = "Nespokojný";
                editor.putString("Q16","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox91);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox92);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox90);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox94);check1.setChecked(false);
                break;
            case R.id.checkBox94:
                if (checked)
                    Q16 = "Neviem";
                editor.putString("Q16","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox91);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox92);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox93);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox90);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen17.this, AllData.class);
        i.putExtra("Sc17", Q16);
    }


    public void init(){
        button33 = (Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen17.this, Screen18.class);
                startActivity(toy);
                finish();



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
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen17);

        SharedPreferences settings = this.getSharedPreferences("Q16", MODE_PRIVATE);

        String restoredText = settings.getString("Q16", null);
        if (restoredText != null) {
            if(restoredText.equals("1"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox90);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("2"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox91);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("3"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox92);
                checkBox.setChecked(true);
            }

            if(restoredText.equals("4"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox93);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("5"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox94);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
