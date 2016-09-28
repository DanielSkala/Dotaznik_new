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

    String Q16,sChecked;

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
                startActivity(sendIsChecked(toy));
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
                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen17);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc17");
        if (i.getStringExtra("ksc17") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = this.getSharedPreferences("Q16", MODE_PRIVATE);

            String restoredText = settings.getString("Q16", null);
            if (restoredText != null) {
                if (restoredText.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox90);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox91);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox92);
                    checkBox.setChecked(true);
                }

                if (restoredText.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox93);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox94);
                    checkBox.setChecked(true);
                }
            }
        }
        init();
        BackPressed();
    }
    public Intent sendIsChecked(Intent ready)
    {
        Intent toy = getIntent();
        boolean isChecked;


        ready.putExtra("sc17", Q16);
        ready.putExtra("ksc2",toy.getStringExtra("ksc2"));
        ready.putExtra("ksc3",toy.getStringExtra("ksc3"));
        ready.putExtra("ksc4",toy.getStringExtra("ksc4"));
        ready.putExtra("ksc5",toy.getStringExtra("ksc5"));
        ready.putExtra("ksc6",toy.getStringExtra("ksc6"));
        ready.putExtra("ksc7",toy.getStringExtra("ksc7"));
        ready.putExtra("ksc8",toy.getStringExtra("ksc8"));
        ready.putExtra("ksc9",toy.getStringExtra("ksc9"));
        ready.putExtra("ksc10",toy.getStringExtra("ksc10"));
        ready.putExtra("ksc11",toy.getStringExtra("ksc11"));
        ready.putExtra("ksc12",toy.getStringExtra("ksc12"));
        ready.putExtra("ksc13",toy.getStringExtra("ksc13"));
        ready.putExtra("ksc14",toy.getStringExtra("ksc14"));
        ready.putExtra("ksc15",toy.getStringExtra("ksc15"));
        ready.putExtra("ksc16-1",toy.getStringExtra("ksc16-1"));
        ready.putExtra("ksc16-2",toy.getStringExtra("ksc16-2"));
        ready.putExtra("ksc16-3",toy.getStringExtra("ksc16-3"));
        ready.putExtra("ksc16-4",toy.getStringExtra("ksc16-4"));
        ready.putExtra("ksc16-5",toy.getStringExtra("ksc16-5"));
        ready.putExtra("ksc16-6",toy.getStringExtra("ksc16-6"));
        ready.putExtra("ksc17",sChecked);
        ready.putExtra("ksc18",toy.getStringExtra("ksc18"));
        ready.putExtra("ksc18-1",toy.getStringExtra("ksc18-1"));
        ready.putExtra("ksc18-2",toy.getStringExtra("ksc18-2"));
        ready.putExtra("ksc18-3",toy.getStringExtra("ksc18-3"));
        ready.putExtra("ksc18-4",toy.getStringExtra("ksc18-4"));
        ready.putExtra("ksc18-5",toy.getStringExtra("ksc18-5"));
        ready.putExtra("ksc19-1",toy.getStringExtra("ksc19-1"));
        ready.putExtra("ksc19-2",toy.getStringExtra("ksc19-2"));
        ready.putExtra("ksc19-3",toy.getStringExtra("ksc19-3"));
        ready.putExtra("ksc19-4",toy.getStringExtra("ksc19-4"));
        ready.putExtra("ksc19-5",toy.getStringExtra("ksc19-5"));
        ready.putExtra("ksc19-6",toy.getStringExtra("ksc19-6"));
        ready.putExtra("ksc20",toy.getStringExtra("ksc20"));
        ready.putExtra("ksc21",toy.getStringExtra("ksc21"));
        ready.putExtra("ksc22",toy.getStringExtra("ksc22"));
        ready.putExtra("ksc23",toy.getStringExtra("ksc23"));
        ready.putExtra("ksc24",toy.getStringExtra("ksc24"));
        ready.putExtra("ksc25",toy.getStringExtra("ksc25"));
        ready.putExtra("ksc26",toy.getStringExtra("ksc26"));
        ready.putExtra("ksc27",toy.getStringExtra("ksc27"));

        return ready;
    }
}
