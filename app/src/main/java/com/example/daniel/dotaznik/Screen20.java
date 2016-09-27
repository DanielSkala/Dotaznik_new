package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
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

        SharedPreferences.Editor editor = getSharedPreferences("Q19",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor2 = getSharedPreferences("Q19-2",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor3 = getSharedPreferences("Q19-3",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor4 = getSharedPreferences("Q19-4",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor5 = getSharedPreferences("Q19-5",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor6 = getSharedPreferences("Q19-6",MODE_PRIVATE).edit() ;

        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox149:
                if (checked)
                    Q19_1 = "Juraj Droba";
                editor.putString("Q19","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox150);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox151);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox152);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox153);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox154);check1.setChecked(false);
                break;
            case R.id.checkBox150:
                if (checked)
                    Q19_1 = "Pavol Frešo";
                editor.putString("Q19","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox149);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox151);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox152);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox153);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox154);check1.setChecked(false);
                break;
            case R.id.checkBox151:
                if (checked)
                    Q19_1 = "Milan Ftáčnik";
                editor.putString("Q19","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox150);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox149);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox152);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox153);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox154);check1.setChecked(false);
                break;
            case R.id.checkBox152:
                if (checked)
                    Q19_1 = "Boris Kollár";
                editor.putString("Q19","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox150);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox151);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox149);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox153);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox154);check1.setChecked(false);
                break;
            case R.id.checkBox153:
                if (checked)
                    Q19_1 = "Nikoho";
                editor.putString("Q19","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox150);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox151);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox152);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox149);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox154);check1.setChecked(false);
                break;
            case R.id.checkBox154:
                if (checked)
                    Q19_1 = "Neviem";
                editor.putString("Q19","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox150);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox151);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox152);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox153);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox149);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox125:
                if (checked)
                    Q19_2 = "Juraj Droba";
                editor2.putString("Q19-2","1");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox126);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox127);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox128);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox129);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox130);check1.setChecked(false);
                break;
            case R.id.checkBox126:
                if (checked)
                    Q19_2 = "Pavol Frešo";
                editor2.putString("Q19-2","2");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox125);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox127);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox128);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox129);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox130);check1.setChecked(false);
                break;
            case R.id.checkBox127:
                if (checked)
                    Q19_2 = "Milan Ftáčnik";
                editor2.putString("Q19-2","3");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox126);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox125);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox128);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox129);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox130);check1.setChecked(false);
                break;
            case R.id.checkBox128:
                if (checked)
                    Q19_2 = "Boris Kollár";
                editor2.putString("Q19-2","4");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox126);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox127);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox125);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox129);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox130);check1.setChecked(false);
                break;
            case R.id.checkBox129:
                if (checked)
                    Q19_2 = "Nikoho";
                editor2.putString("Q19-2","5");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox126);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox127);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox128);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox125);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox130);check1.setChecked(false);
                break;
            case R.id.checkBox130:
                if (checked)
                    Q19_2 = "Neviem";
                editor2.putString("Q19-2","6");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox126);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox127);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox128);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox129);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox125);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox131:
                if (checked)
                    Q19_3 = "Juraj Droba";
                editor3.putString("Q19-3","1");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox132);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox133);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox134);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox135);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox136);check1.setChecked(false);
                break;
            case R.id.checkBox132:
                if (checked)
                    Q19_3 = "Pavol Frešo";
                editor3.putString("Q19-3","2");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox131);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox133);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox134);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox135);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox136);check1.setChecked(false);
                break;
            case R.id.checkBox133:
                if (checked)
                    Q19_3 = "Milan Ftáčnik";
                editor3.putString("Q19-3","3");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox132);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox131);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox134);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox135);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox136);check1.setChecked(false);
                break;
            case R.id.checkBox134:
                if (checked)
                    Q19_3 = "Boris Kollár";
                editor3.putString("Q19-3","4");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox132);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox133);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox131);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox135);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox136);check1.setChecked(false);
                break;
            case R.id.checkBox135:
                if (checked)
                    Q19_3 = "Nikoho";
                editor3.putString("Q19-3","5");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox132);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox133);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox134);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox131);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox136);check1.setChecked(false);
                break;
            case R.id.checkBox136:
                if (checked)
                    Q19_3 = "Neviem";
                editor3.putString("Q19-3","6");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox132);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox133);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox134);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox135);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox131);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox137:
                if (checked)
                    Q19_4 = "Juraj Droba";
                editor4.putString("Q19-4","1");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox138);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox139);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox140);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox141);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox142);check1.setChecked(false);
                break;
            case R.id.checkBox138:
                if (checked)
                    Q19_4 = "Pavol Frešo";
                editor4.putString("Q19-4","2");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox137);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox139);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox140);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox141);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox142);check1.setChecked(false);
                break;
            case R.id.checkBox139:
                if (checked)
                    Q19_4 = "Milan Ftáčnik";
                editor4.putString("Q19-4","3");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox138);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox137);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox140);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox141);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox142);check1.setChecked(false);
                break;
            case R.id.checkBox140:
                if (checked)
                    Q19_4 = "Boris Kollár";
                editor4.putString("Q19-4","4");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox138);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox139);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox137);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox141);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox142);check1.setChecked(false);
                break;
            case R.id.checkBox141:
                if (checked)
                    Q19_4 = "Nikoho";
                editor4.putString("Q19-4","5");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox138);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox139);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox140);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox137);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox142);check1.setChecked(false);
                break;
            case R.id.checkBox142:
                if (checked)
                    Q19_4 = "Neviem";
                editor4.putString("Q19-4","6");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox138);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox139);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox140);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox141);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox137);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox143:
                if (checked)
                    Q19_5 = "Juraj Droba";
                editor5.putString("Q19-5","1");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox144);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox145);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox146);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox147);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox148);check1.setChecked(false);
                break;
            case R.id.checkBox144:
                if (checked)
                    Q19_5 = "Pavol Frešo";
                editor5.putString("Q19-5","2");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox143);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox145);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox146);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox147);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox148);check1.setChecked(false);
                break;
            case R.id.checkBox145:
                if (checked)
                    Q19_5 = "Milan Ftáčnik";
                editor5.putString("Q19-5","3");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox144);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox143);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox146);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox147);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox148);check1.setChecked(false);
                break;
            case R.id.checkBox146:
                if (checked)
                    Q19_5 = "Boris Kollár";
                editor5.putString("Q19-5","4");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox144);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox145);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox143);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox147);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox148);check1.setChecked(false);
                break;
            case R.id.checkBox147:
                if (checked)
                    Q19_5 = "Nikoho";
                editor5.putString("Q19-5","5");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox144);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox145);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox146);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox143);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox148);check1.setChecked(false);
                break;
            case R.id.checkBox148:
                if (checked)
                    Q19_5 = "Neviem";
                editor5.putString("Q19-5","6");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox144);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox145);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox146);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox147);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox143);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox155:
                if (checked)
                    Q19_6 = "Juraj Droba";
                editor6.putString("Q19-6","1");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox156);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox157);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox158);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox159);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox160);check1.setChecked(false);
                break;
            case R.id.checkBox156:
                if (checked)
                    Q19_6 = "Pavol Frešo";
                editor6.putString("Q19-6","2");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox155);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox157);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox158);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox159);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox160);check1.setChecked(false);
                break;
            case R.id.checkBox157:
                if (checked)
                    Q19_6 = "Milan Ftáčnik";
                editor6.putString("Q19-6","3");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox156);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox155);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox158);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox159);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox160);check1.setChecked(false);
                break;
            case R.id.checkBox158:
                if (checked)
                    Q19_6 = "Boris Kollár";
                editor6.putString("Q19-6","4");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox156);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox157);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox155);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox159);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox160);check1.setChecked(false);
                break;
            case R.id.checkBox159:
                if (checked)
                    Q19_6 = "Nikoho";
                editor6.putString("Q19-6","5");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox156);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox157);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox158);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox155);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox160);check1.setChecked(false);
                break;
            case R.id.checkBox160:
                if (checked)
                    Q19_6 = "Neviem";
                editor6.putString("Q19-6","6");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox156);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox157);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox158);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox159);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox155);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen20.this, AllData.class);
        i.putExtra("Sc20-1", Q19_1);
        i.putExtra("Sc20-2", Q19_2);
        i.putExtra("Sc20-3", Q19_3);
        i.putExtra("Sc20-4", Q19_4);
        i.putExtra("Sc20-5", Q19_5);
        i.putExtra("Sc20-6", Q19_6);
    }


    public void init(){
        button39 = (Button)findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen20.this, Screen21.class);
                startActivity(toy);
                finish();





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
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen20);
        SharedPreferences settings = getSharedPreferences("Q19",MODE_PRIVATE);
        String restoredText =   settings.getString("Q19", null);
        if (restoredText != null) {
            if (restoredText.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox149);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox150);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox151);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox152);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox153);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox154);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings2 = getSharedPreferences("Q19-2",MODE_PRIVATE);
        String restoredText2 = settings2.getString("Q19-2", null);

        if (restoredText2 != null) {
            if (restoredText2.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox125);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox126);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox127);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox128);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox129);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox130);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings3 = getSharedPreferences("Q19-3",MODE_PRIVATE);
        String restoredText3 = settings3.getString("Q19-3", null);

        if (restoredText3 != null) {
            if (restoredText3.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox131);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox132);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox133);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox134);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox135);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox136);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings4 = getSharedPreferences("Q19-4",MODE_PRIVATE) ;
        String restoredText4 = settings4.getString("Q19-4", null);

        if (restoredText4 != null) {
            if (restoredText4.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox137);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox138);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox139);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox140);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox141);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox142);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings5 = getSharedPreferences("Q19-5",MODE_PRIVATE) ;
        String restoredText5 = settings5.getString("Q19-5", null);

        if (restoredText5 != null) {
            if (restoredText5.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox143);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox144);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox145);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox146);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox147);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox148);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings6 = getSharedPreferences("Q19-6",MODE_PRIVATE) ;
        String restoredText6 = settings6.getString("Q19-6", null);
        if (restoredText6 != null) {
            if (restoredText6.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox155);
                checkBox.setChecked(true);
            }
            if (restoredText6.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox156);
                checkBox.setChecked(true);
            }
            if (restoredText6.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox157);
                checkBox.setChecked(true);
            }
            if (restoredText6.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox158);
                checkBox.setChecked(true);
            }
            if (restoredText6.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox159);
                checkBox.setChecked(true);
            }
            if (restoredText6.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox160);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
