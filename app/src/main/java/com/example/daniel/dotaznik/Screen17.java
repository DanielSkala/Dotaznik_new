package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class Screen17 extends AppCompatActivity {

    public Button button32;
    public Button button33;

    String Q16,sChecked;




    public void init(){
        button33 = (Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen17.this, Screen18.class);

                EditText editText = (EditText) findViewById(R.id.editText3);
                Q16 = editText.getText().toString();
                Intent info = new Intent (Screen17.this, MainActivity.class);
                info.putExtra("sc17", Q16);

                SharedPreferences.Editor editor = getSharedPreferences("Q16",MODE_PRIVATE).edit() ;
                editor.putString("Q16",Q16);
                editor.commit();

                if(!Q16.equals(""))
                {
                    startActivity(sendIsChecked(toy));
                    finish();
                }

            }
        });
    }

    public void BackPressed(){
        button32 = (Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen17.this, Screen16.class);


                EditText editText = (EditText) findViewById(R.id.editText3);
                Q16 = editText.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("Q16",MODE_PRIVATE).edit() ;
                editor.putString("Q16",Q16);
                editor.commit();
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

        //When users click on the image, alert dialog will show up
        ImageView imageView = (ImageView) findViewById(R.id.imageView12);
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AbortDialog dialog = new AbortDialog();
                dialog.show(getSupportFragmentManager(), "AbortDialogFragment");
            }
        });

        if (i.getStringExtra("ksc17") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = this.getSharedPreferences("Q11", MODE_PRIVATE);
            String restoredText = settings.getString("Q16", null);
            if (restoredText != null) {
                EditText editText = (EditText) findViewById(R.id.editText3);
                editText.setText(restoredText);
            }
        }
        init();
        BackPressed();
    }
    public Intent sendIsChecked(Intent ready)
    {
        Intent toy = getIntent();
        boolean isChecked;




//toy.getStringExtra("sc17") == null ||  !toy.getStringExtra("sc17").equals(Q16)
        if(Q16!=null)

            ready.putExtra("sc17", Q16);
        else
            ready.putExtra("sc17", toy.getStringExtra("sc17"));
        ready.putExtra("sc3", toy.getStringExtra("sc3"));
        ready.putExtra("sc2", toy.getStringExtra("sc2"));
        ready.putExtra("sc4", toy.getStringExtra("sc4"));
        ready.putExtra("sc5", toy.getStringExtra("sc5"));
        ready.putExtra("sc6", toy.getStringExtra("sc6"));
        ready.putExtra("sc7", toy.getStringExtra("sc7"));
        ready.putExtra("sc8", toy.getStringExtra("sc8"));
        ready.putExtra("sc9", toy.getStringExtra("sc9"));
        ready.putExtra("sc10", toy.getStringExtra("sc10"));
        ready.putExtra("sc11", toy.getStringExtra("sc11"));
        ready.putExtra("sc12", toy.getStringExtra("sc12"));
        ready.putExtra("sc13", toy.getStringExtra("sc13"));
        ready.putExtra("sc14", toy.getStringExtra("sc14"));
        ready.putExtra("sc15", toy.getStringExtra("sc15"));
        ready.putExtra("sc16", toy.getStringExtra("sc16"));
        //ready.putExtra("sc17", toy.getStringExtra("sc17"));
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
        ready.putExtra("ksc7",toy.getStringExtra("ksc7"));
        ready.putExtra("ksc8",toy.getStringExtra("ksc8"));
        ready.putExtra("ksc9",toy.getStringExtra("ksc9"));
        ready.putExtra("ksc10",toy.getStringExtra("ksc10"));
        ready.putExtra("ksc11",toy.getStringExtra("ksc11"));
        ready.putExtra("ksc12",toy.getStringExtra("ksc12"));
        ready.putExtra("ksc13",toy.getStringExtra("ksc13"));
        ready.putExtra("ksc14",toy.getStringExtra("ksc14"));
        ready.putExtra("ksc15",toy.getStringExtra("ksc15"));
        ready.putExtra("ksc16",toy.getStringExtra("ksc16"));
        ready.putExtra("ksc17",sChecked);
        ready.putExtra("ksc18",toy.getStringExtra("ksc18"));
        ready.putExtra("ksc18-1",toy.getStringExtra("ksc18-1"));
        ready.putExtra("ksc20",toy.getStringExtra("ksc20"));
        ready.putExtra("ksc21",toy.getStringExtra("ksc21"));
        ready.putExtra("ksc22",toy.getStringExtra("ksc22"));
        ready.putExtra("ksc23",toy.getStringExtra("ksc23"));
        ready.putExtra("ksc24",toy.getStringExtra("ksc24"));


        return ready;
    }
}
