package com.example.daniel.dotaznik;

import android.content.Context;
import android.content.Intent;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import static android.content.Context.MODE_PRIVATE;

public class Screen2 extends AppCompatActivity {

    public Button button2;
    public Button button3;









    String Q1,sChecked;


        public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
            SharedPreferences.Editor editor = getSharedPreferences("Q1",MODE_PRIVATE).edit() ;
            sChecked = "true";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked)
                    Q1 = "Áno";
                    editor.putString("Q1",Q1);
                    editor.commit();
                CheckBox check = (CheckBox) findViewById(R.id.checkBox2);check.setChecked(false);
                CheckBox check2 = (CheckBox) findViewById(R.id.checkBox3);check2.setChecked(false);
                break;
            case R.id.checkBox2:
                if (checked)
                    Q1 = "Nie";
                    editor.putString("Q1",Q1);
                    editor.commit();
                CheckBox check3 = (CheckBox) findViewById(R.id.checkBox);check3.setChecked(false);
                CheckBox check4= (CheckBox) findViewById(R.id.checkBox3);check4.setChecked(false);
                break;
            case R.id.checkBox3:
                if (checked)
                    Q1 = "Neviem";
                    editor.putString("Q1",Q1);
                    editor.commit();
                CheckBox check5 = (CheckBox) findViewById(R.id.checkBox2);check5.setChecked(false);
                CheckBox check6 = (CheckBox) findViewById(R.id.checkBox);check6.setChecked(false);
                break;
        }


    }



    public void init(){
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ready = new Intent(Screen2.this, Screen3.class);

                startActivity(sendIsChecked(ready));
                finish();
            }
        });
    }

    public void BackPressed(){
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ready = new Intent(Screen2.this, MainActivity.class);

                startActivity(sendIsChecked(ready));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc2");
    if (i.getStringExtra("ksc2") == null)
        s = "true";
        if(s.equals("true"))
        {




        SharedPreferences settings = this.getSharedPreferences("Q1", MODE_PRIVATE);

        String restoredText = settings.getString("Q1", null);
        if (restoredText != null) {
            if(restoredText.equals("Áno"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Nie"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox2);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Neviem"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3);
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


            ready.putExtra("isChecked", "false");
            ready.putExtra("sc2", Q1);
            ready.putExtra("ksc2",sChecked);
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
            ready.putExtra("ksc17",toy.getStringExtra("ksc17"));
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

