package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
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
        SharedPreferences.Editor editor = getSharedPreferences("Q3",MODE_PRIVATE).edit() ;
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox4:
                if (checked)
                    Q3 = "Muž";
                    editor.putString("Q3",Q3);
                    editor.commit();
                    CheckBox check = (CheckBox) findViewById(R.id.checkBox5);check.setChecked(false);

                break;
            case R.id.checkBox5:
                if (checked)
                    Q3 = "Žena";
                    editor.putString("Q3",Q3);
                    editor.commit();
                    CheckBox check2 = (CheckBox) findViewById(R.id.checkBox4);check2.setChecked(false);
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
        SharedPreferences settings = this.getSharedPreferences("Q3", MODE_PRIVATE);

        String restoredText = settings.getString("Q3", null);
        if (restoredText != null) {
            if(restoredText.equals("Muž"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox4);
                checkBox.setChecked(true);
            }
            if(restoredText.equals("Žena"))
            {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox5);
                checkBox.setChecked(true);
            }

        }
        init();
        BackPressed();
    }
}
