package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen12 extends AppCompatActivity {

    public Button button22;
    public Button button23;
    String Q11,sChecked;



    public void init(){
        button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen12.this, Screen13.class);

                SharedPreferences.Editor editor = getSharedPreferences("Q11",MODE_PRIVATE).edit() ;


                EditText editText = (EditText) findViewById(R.id.editText17);
                Q11 = editText.getText().toString();
                Intent info = new Intent (Screen12.this, MainActivity.class);
                info.putExtra("sc12", Q11);



                editor.putString("Q11",Q11);
                editor.commit();


                startActivity(sendIsChecked(toy));
                finish();

            }
        });
    }

    public void BackPressed(){
        button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen12.this, Screen11.class);


                EditText editText = (EditText) findViewById(R.id.editText17);
                Q11 = editText.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("Q11",MODE_PRIVATE).edit() ;
                editor.putString("Q11",Q11);
                editor.commit();
                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen12);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc12");
        if (i.getStringExtra("ksc12") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = this.getSharedPreferences("Q11", MODE_PRIVATE);
            String restoredText = settings.getString("Q11", null);
            if (restoredText != null) {
                EditText editText = (EditText) findViewById(R.id.editText17);
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


        ready.putExtra("sc12", Q11);
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
        ready.putExtra("ksc12",sChecked);
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
