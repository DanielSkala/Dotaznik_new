package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen20 extends AppCompatActivity {

    public Button button38;
    public Button button39;
    String Q19_1;
    String Q19_2;
    String Q19_3;
    String Q19_4;
    String Q19_5;
    String Q19_6;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox149:
                if (checked)
                    Q19_1 = "Juraj Droba";
                break;
            case R.id.checkBox150:
                if (checked)
                    Q19_1 = "Pavol Frešo";
                break;
            case R.id.checkBox151:
                if (checked)
                    Q19_1 = "Milan Ftáčnik";
                break;
            case R.id.checkBox152:
                if (checked)
                    Q19_1 = "Boris Kollár";
                break;
            case R.id.checkBox153:
                if (checked)
                    Q19_1 = "Nikoho";
                break;
            case R.id.checkBox154:
                if (checked)
                    Q19_1 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox125:
                if (checked)
                    Q19_2 = "Juraj Droba";
                break;
            case R.id.checkBox126:
                if (checked)
                    Q19_2 = "Pavol Frešo";
                break;
            case R.id.checkBox127:
                if (checked)
                    Q19_2 = "Milan Ftáčnik";
                break;
            case R.id.checkBox128:
                if (checked)
                    Q19_2 = "Boris Kollár";
                break;
            case R.id.checkBox129:
                if (checked)
                    Q19_2 = "Nikoho";
                break;
            case R.id.checkBox130:
                if (checked)
                    Q19_2 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox131:
                if (checked)
                    Q19_3 = "Juraj Droba";
                break;
            case R.id.checkBox132:
                if (checked)
                    Q19_3 = "Pavol Frešo";
                break;
            case R.id.checkBox133:
                if (checked)
                    Q19_3 = "Milan Ftáčnik";
                break;
            case R.id.checkBox134:
                if (checked)
                    Q19_3 = "Boris Kollár";
                break;
            case R.id.checkBox135:
                if (checked)
                    Q19_3 = "Nikoho";
                break;
            case R.id.checkBox136:
                if (checked)
                    Q19_3 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox137:
                if (checked)
                    Q19_4 = "Juraj Droba";
                break;
            case R.id.checkBox138:
                if (checked)
                    Q19_4 = "Pavol Frešo";
                break;
            case R.id.checkBox139:
                if (checked)
                    Q19_4 = "Milan Ftáčnik";
                break;
            case R.id.checkBox140:
                if (checked)
                    Q19_4 = "Boris Kollár";
                break;
            case R.id.checkBox141:
                if (checked)
                    Q19_4 = "Nikoho";
                break;
            case R.id.checkBox142:
                if (checked)
                    Q19_4 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox143:
                if (checked)
                    Q19_5 = "Juraj Droba";
                break;
            case R.id.checkBox144:
                if (checked)
                    Q19_5 = "Pavol Frešo";
                break;
            case R.id.checkBox145:
                if (checked)
                    Q19_5 = "Milan Ftáčnik";
                break;
            case R.id.checkBox146:
                if (checked)
                    Q19_5 = "Boris Kollár";
                break;
            case R.id.checkBox147:
                if (checked)
                    Q19_5 = "Nikoho";
                break;
            case R.id.checkBox148:
                if (checked)
                    Q19_5 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox155:
                if (checked)
                    Q19_6 = "Juraj Droba";
                break;
            case R.id.checkBox156:
                if (checked)
                    Q19_6 = "Pavol Frešo";
                break;
            case R.id.checkBox157:
                if (checked)
                    Q19_6 = "Milan Ftáčnik";
                break;
            case R.id.checkBox158:
                if (checked)
                    Q19_6 = "Boris Kollár";
                break;
            case R.id.checkBox159:
                if (checked)
                    Q19_6 = "Nikoho";
                break;
            case R.id.checkBox160:
                if (checked)
                    Q19_6 = "Neviem";
                break;
        }
    }

    public void init(){
        button39 = (Button)findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen20.this, Screen21.class);
                startActivity(toy);

                Intent i = new Intent(Screen20.this, AllData.class);
                i.putExtra("Sc20-1", Q19_1);
                i.putExtra("Sc20-2", Q19_2);
                i.putExtra("Sc20-3", Q19_3);
                i.putExtra("Sc20-4", Q19_4);
                i.putExtra("Sc20-5", Q19_5);
                i.putExtra("Sc20-6", Q19_6);
                startActivity(i);

            }
        });
    }

    public void BackPressed(){
        button38 = (Button)findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen20.this, Screen19.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen20);

        init();
        BackPressed();
    }
}
