package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen4 extends AppCompatActivity {

    public Button button6;
    public Button button7;

    String Q3;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox4:
                if (checked)
                    Q3 = "Muž";
                break;
            case R.id.checkBox5:
                if (checked)
                    Q3 = "Žena";
                break;
        }
        Intent i = new Intent(Screen4.this, MainActivity.class);
        i.putExtra("Sc4", Q3);
    }



    public void init(){
        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent toy = new Intent(Screen4.this, Screen5.class);
                startActivity(toy);
                finish();

            }
        });
    }

    public void BackPressed(){
        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen4.this, Screen3.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        init();
        BackPressed();
    }
}
