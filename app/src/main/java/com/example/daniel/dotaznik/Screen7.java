package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen7 extends AppCompatActivity {

    public Button button12;
    public Button button13;

    String Q6,sChecked;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q6",MODE_PRIVATE).edit() ;
        sChecked = "true";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox10:
                if (checked)
                    Q6 = "Áno";
                editor.putString("Q6",Q6);
                editor.commit();
                CheckBox check = (CheckBox) findViewById(R.id.checkBox11);check.setChecked(false);
                CheckBox check2 = (CheckBox) findViewById(R.id.checkBox12);check2.setChecked(false);
                break;
            case R.id.checkBox11:
                if (checked)
                    Q6 = "Nie";
                editor.putString("Q6",Q6);
                editor.commit();
                CheckBox check3 = (CheckBox) findViewById(R.id.checkBox10);check3.setChecked(false);
                CheckBox check4 = (CheckBox) findViewById(R.id.checkBox12);check4.setChecked(false);
                break;
            case R.id.checkBox12:
                if (checked)
                    Q6 = "Neviem";
                editor.putString("Q6",Q6);
                editor.commit();
                CheckBox check5 = (CheckBox) findViewById(R.id.checkBox11);check5.setChecked(false);
                CheckBox check6 = (CheckBox) findViewById(R.id.checkBox10);check6.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen7.this, MainActivity.class);
        i.putExtra("Sc7", Q6);
    }



    public void init(){
        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ready = new Intent(Screen7.this, Screen8.class);

                startActivity(sendIsChecked(ready));
                finish();


            }
        });
    }

    public void BackPressed(){
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ready = new Intent(Screen7.this, Screen6.class);

                startActivity(sendIsChecked(ready));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc7");
        if (i.getStringExtra("ksc7") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = this.getSharedPreferences("Q6", MODE_PRIVATE);

            String restoredText = settings.getString("Q6", null);
            if (restoredText != null) {
                if (restoredText.equals("Áno")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox10);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("Nie")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox11);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("Neviem")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox12);
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


        ready.putExtra("sc7", Q6);
        ready.putExtra("ksc2",toy.getStringExtra("ksc2"));
        ready.putExtra("ksc3",toy.getStringExtra("ksc3"));
        ready.putExtra("ksc4",toy.getStringExtra("ksc4"));
        ready.putExtra("ksc5",toy.getStringExtra("ksc5"));
        ready.putExtra("ksc6",toy.getStringExtra("ksc6"));
        ready.putExtra("ksc7",sChecked);
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
