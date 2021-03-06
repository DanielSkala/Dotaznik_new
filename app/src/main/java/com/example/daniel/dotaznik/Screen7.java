package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

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

                CheckBox c1 = (CheckBox)findViewById(R.id.checkBox10);
                CheckBox c2 = (CheckBox)findViewById(R.id.checkBox11);
                CheckBox c3 = (CheckBox)findViewById(R.id.checkBox12);

                if(c1.isChecked() || c2.isChecked() || c3.isChecked()) {
                    startActivity(sendIsChecked(ready));
                    finish();
                }


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

        //When users click on the image, alert dialog will show up
        ImageView imageView = (ImageView) findViewById(R.id.imageView7);
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AbortDialog dialog = new AbortDialog();
                dialog.show(getSupportFragmentManager(), "AbortDialogFragment");
            }
        });

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



//toy.getStringExtra("sc7") == null  || !toy.getStringExtra("sc7").equals(Q6)
        if(Q6 != null)
            ready.putExtra("sc7", Q6);
        else
            ready.putExtra("sc7", toy.getStringExtra("sc7"));
        ready.putExtra("sc3", toy.getStringExtra("sc3"));
        ready.putExtra("sc2", toy.getStringExtra("sc2"));
        ready.putExtra("sc4", toy.getStringExtra("sc4"));
        ready.putExtra("sc5", toy.getStringExtra("sc5"));
        ready.putExtra("sc6", toy.getStringExtra("sc6"));
        //ready.putExtra("sc7", toy.getStringExtra("sc7"));
        ready.putExtra("sc8", toy.getStringExtra("sc8"));
        ready.putExtra("sc9", toy.getStringExtra("sc9"));
        ready.putExtra("sc10", toy.getStringExtra("sc10"));
        ready.putExtra("sc11", toy.getStringExtra("sc11"));
        ready.putExtra("sc12", toy.getStringExtra("sc12"));
        ready.putExtra("sc13", toy.getStringExtra("sc13"));
        ready.putExtra("sc14", toy.getStringExtra("sc14"));
        ready.putExtra("sc15", toy.getStringExtra("sc15"));
        ready.putExtra("sc16", toy.getStringExtra("sc16"));
        ready.putExtra("sc17", toy.getStringExtra("sc17"));
        ready.putExtra("sc18", toy.getStringExtra("sc18"));
        ready.putExtra("sc18-1", toy.getStringExtra("sc18-1"));
        ready.putExtra("sc20", toy.getStringExtra("sc20"));
        ready.putExtra("sc21", toy.getStringExtra("sc21"));
        ready.putExtra("sc22", toy.getStringExtra("sc22"));
        ready.putExtra("sc23", toy.getStringExtra("sc23"));
        ready.putExtra("sc24", toy.getStringExtra("sc24"));
        ready.putExtra("sc25", toy.getStringExtra("sc25"));
        ready.putExtra("sc26", toy.getStringExtra("sc26"));
        ready.putExtra("sc27", toy.getStringExtra("sc27"));
        ready.putExtra("sc28", toy.getStringExtra("sc28"));
        ready.putExtra("macAddress", toy.getStringExtra("macAddress"));
        ready.putExtra("name", toy.getStringExtra("name"));


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
        ready.putExtra("ksc16",toy.getStringExtra("ksc16"));
        ready.putExtra("ksc17",toy.getStringExtra("ksc17"));
        ready.putExtra("ksc18",toy.getStringExtra("ksc18"));
        ready.putExtra("ksc18-1",toy.getStringExtra("ksc18-1"));
        ready.putExtra("ksc20",toy.getStringExtra("ksc20"));
        ready.putExtra("ksc21",toy.getStringExtra("ksc21"));
        ready.putExtra("ksc22",toy.getStringExtra("ksc22"));
        ready.putExtra("ksc23",toy.getStringExtra("ksc23"));
        ready.putExtra("ksc24",toy.getStringExtra("ksc24"));
        ready.putExtra("ksc25",toy.getStringExtra("ksc25"));


        return ready;
    }
}
