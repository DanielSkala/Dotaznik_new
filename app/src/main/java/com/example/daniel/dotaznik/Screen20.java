package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class Screen20 extends AppCompatActivity {

    public Button button38;
    public Button button39;

    String Q19_1;
    String Q19_2;
    String Q19_3;
    String Q19_4;
    String Q19_5;
    String Q19_6;
    String sChecked,sChecked2,sChecked3,sChecked4,sChecked5,sChecked6;

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
        sChecked = "true";
        sChecked2 = "true";
        sChecked3 = "true";
        sChecked4 = "true";
        sChecked5 = "true";
        sChecked6 = "true";
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
        i.putExtra("Sc19-1", Q19_1);
        i.putExtra("Sc19-2", Q19_2);
        i.putExtra("Sc19-3", Q19_3);
        i.putExtra("Sc19-4", Q19_4);
        i.putExtra("Sc19-5", Q19_5);
        i.putExtra("Sc19-6", Q19_6);
    }


    public void init(){
        button39 = (Button)findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen20.this, Screen21.class);
                CheckBox c2 = (CheckBox)findViewById(R.id.checkBox125);
                CheckBox c3 = (CheckBox)findViewById(R.id.checkBox126);
                CheckBox c4 = (CheckBox)findViewById(R.id.checkBox127);
                CheckBox c1 = (CheckBox)findViewById(R.id.checkBox128);
                CheckBox c5 = (CheckBox)findViewById(R.id.checkBox129);
                CheckBox c6 = (CheckBox)findViewById(R.id.checkBox130);
                CheckBox c7 = (CheckBox)findViewById(R.id.checkBox131);
                CheckBox c8 = (CheckBox)findViewById(R.id.checkBox132);
                CheckBox c9 = (CheckBox)findViewById(R.id.checkBox133);
                CheckBox c10 = (CheckBox)findViewById(R.id.checkBox134);
                CheckBox c11 = (CheckBox)findViewById(R.id.checkBox135);
                CheckBox c12 = (CheckBox)findViewById(R.id.checkBox136);
                CheckBox c13 = (CheckBox)findViewById(R.id.checkBox137);
                CheckBox c14 = (CheckBox)findViewById(R.id.checkBox138);
                CheckBox c15 = (CheckBox)findViewById(R.id.checkBox139);
                CheckBox c16 = (CheckBox)findViewById(R.id.checkBox140);
                CheckBox c17 = (CheckBox)findViewById(R.id.checkBox141);
                CheckBox c18 = (CheckBox)findViewById(R.id.checkBox142);
                CheckBox c19 = (CheckBox)findViewById(R.id.checkBox143);
                CheckBox c20 = (CheckBox)findViewById(R.id.checkBox144);
                CheckBox c21 = (CheckBox)findViewById(R.id.checkBox145);
                CheckBox c22 = (CheckBox)findViewById(R.id.checkBox146);
                CheckBox c23 = (CheckBox)findViewById(R.id.checkBox147);
                CheckBox c24 = (CheckBox)findViewById(R.id.checkBox148);
                CheckBox c25 = (CheckBox)findViewById(R.id.checkBox149);
                CheckBox c26 = (CheckBox)findViewById(R.id.checkBox150);
                CheckBox c27 = (CheckBox)findViewById(R.id.checkBox151);
                CheckBox c28 = (CheckBox)findViewById(R.id.checkBox152);
                CheckBox c29 = (CheckBox)findViewById(R.id.checkBox153);
                CheckBox c30 = (CheckBox)findViewById(R.id.checkBox154);
                CheckBox c31 = (CheckBox)findViewById(R.id.checkBox155);
                CheckBox c32 = (CheckBox)findViewById(R.id.checkBox156);
                CheckBox c33 = (CheckBox)findViewById(R.id.checkBox157);
                CheckBox c34 = (CheckBox)findViewById(R.id.checkBox158);
                CheckBox c35 = (CheckBox)findViewById(R.id.checkBox159);
                CheckBox c36 = (CheckBox)findViewById(R.id.checkBox160);

                if(c1.isChecked() || c2.isChecked() || c3.isChecked() || c4.isChecked() || c5.isChecked() || c6.isChecked() ) {
                    if(c7.isChecked() || c8.isChecked() || c9.isChecked() || c10.isChecked() || c11.isChecked() || c12.isChecked() ) {
                        if(c13.isChecked() || c14.isChecked() || c15.isChecked() || c16.isChecked() || c17.isChecked() || c18.isChecked() ){
                            if(c19.isChecked() || c20.isChecked() || c21.isChecked() || c22.isChecked() || c23.isChecked() || c24.isChecked() ){
                                if(c25.isChecked() || c26.isChecked() || c27.isChecked() || c28.isChecked() || c29.isChecked() || c30.isChecked() ){
                                    if(c31.isChecked() || c32.isChecked() || c33.isChecked() || c34.isChecked() || c35.isChecked() || c36.isChecked() ){
                                        startActivity(sendIsChecked(toy)); finish();
                                    }
                                }
                            }
                        }
                    }


                }
            }
        });
    }

    public void BackPressed(){
        button38 = (Button)findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen20.this, Screen19.class);
                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen20);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc19-1");

        //When users click on the image, alert dialog will show up
        ImageView imageView = (ImageView) findViewById(R.id.imageView20);
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AbortDialog dialog = new AbortDialog();
                dialog.show(getSupportFragmentManager(), "AbortDialogFragment");
            }
        });

        if (i.getStringExtra("ksc19-1") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = getSharedPreferences("Q19", MODE_PRIVATE);
            String restoredText = settings.getString("Q19", null);
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
        }
        Intent i2 = getIntent();
        String s2 = i2.getStringExtra("ksc19-2");
        if (i2.getStringExtra("ksc19-2") == null)
            s2 = "true";
        if(s2.equals("true")) {
            SharedPreferences settings2 = getSharedPreferences("Q19-2", MODE_PRIVATE);
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
        }
        Intent i3 = getIntent();
        String s3 = i3.getStringExtra("ksc19-3");
        if (i3.getStringExtra("ksc19-3") == null)
            s3 = "true";
        if(s3.equals("true")) {
            SharedPreferences settings3 = getSharedPreferences("Q19-3", MODE_PRIVATE);
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
        }
        Intent i4 = getIntent();
        String s4 = i4.getStringExtra("ksc19-4");
        if (i4.getStringExtra("ksc19-4") == null)
            s4 = "true";
        if(s4.equals("true")) {
            SharedPreferences settings4 = getSharedPreferences("Q19-4", MODE_PRIVATE);
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
        }
        Intent i5 = getIntent();
        String s5 = i5.getStringExtra("ksc19-5");
        if (i5.getStringExtra("ksc19-5") == null)
            s5 = "true";
        if(s5.equals("true")) {
            SharedPreferences settings5 = getSharedPreferences("Q19-5", MODE_PRIVATE);
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
        }
        Intent i6 = getIntent();
        String s6 = i6.getStringExtra("ksc19-6");
        if (i6.getStringExtra("ksc19-6") == null)
            s6 = "true";
        if(s6.equals("true")) {
            SharedPreferences settings6 = getSharedPreferences("Q19-6", MODE_PRIVATE);
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
        }
        init();
        BackPressed();
    }
    public Intent sendIsChecked(Intent ready)
    {
        Intent toy = getIntent();
        boolean isChecked;



//toy.getStringExtra("sc19-1") == null ||  !toy.getStringExtra("sc19-1").equals(Q19_1)
        if(Q19_1!=null)

            ready.putExtra("sc19-1", Q19_1);
        else
            ready.putExtra("sc19-1", toy.getStringExtra("sc19-1"));



//toy.getStringExtra("sc19-2") == null ||  !toy.getStringExtra("sc19-2").equals(Q19_2)
        if(Q19_2!=null)

            ready.putExtra("sc19-2", Q19_2);
        else
            ready.putExtra("sc19-2", toy.getStringExtra("sc19-2"));


//toy.getStringExtra("sc19-3") == null ||  !toy.getStringExtra("sc19-3").equals(Q19_3)
        if(Q19_3!=null)

            ready.putExtra("sc19-3", Q19_3);
        else
            ready.putExtra("sc18-3", toy.getStringExtra("sc19-3"));



//toy.getStringExtra("sc19-4") == null ||  !toy.getStringExtra("sc19-4").equals(Q19_4)
        if(Q19_4!=null)

            ready.putExtra("sc19-4", Q19_4);
        else
            ready.putExtra("sc19-4", toy.getStringExtra("sc19-4"));



//toy.getStringExtra("sc19-5") == null ||  !toy.getStringExtra("sc19-5").equals(Q19_5)
        if(Q19_5!=null)

            ready.putExtra("sc19-5", Q19_5);
        else
            ready.putExtra("sc19-5", toy.getStringExtra("sc19-5"));


//toy.getStringExtra("sc19-6") == null ||  !toy.getStringExtra("sc19-6").equals(Q19_6)
        if(Q19_6!=null)

            ready.putExtra("sc19-6", Q19_6);
        else
            ready.putExtra("sc19-6", toy.getStringExtra("sc19-6"));





        ready.putExtra("sc2", toy.getStringExtra("sc2"));
        ready.putExtra("sc3", toy.getStringExtra("sc3"));
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
        ready.putExtra("sc17", toy.getStringExtra("sc17"));
        ready.putExtra("sc18", toy.getStringExtra("sc18"));
        ready.putExtra("sc16-1", toy.getStringExtra("sc16-1"));
        ready.putExtra("sc16-2", toy.getStringExtra("sc16-2"));
        ready.putExtra("sc16-3", toy.getStringExtra("sc16-3"));
        ready.putExtra("sc16-4", toy.getStringExtra("sc16-4"));
        ready.putExtra("sc16-5", toy.getStringExtra("sc16-5"));
        ready.putExtra("sc16-6", toy.getStringExtra("sc16-6"));
        ready.putExtra("sc18-1", toy.getStringExtra("sc18-1"));
        ready.putExtra("sc18-2", toy.getStringExtra("sc18-2"));
        ready.putExtra("sc18-3", toy.getStringExtra("sc18-3"));
        ready.putExtra("sc18-4", toy.getStringExtra("sc18-4"));
        ready.putExtra("sc18-5", toy.getStringExtra("sc18-5"));
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
        ready.putExtra("ksc19-1",sChecked);
        ready.putExtra("ksc19-2",sChecked2);
        ready.putExtra("ksc19-3",sChecked3);
        ready.putExtra("ksc19-4",sChecked4);
        ready.putExtra("ksc19-5",sChecked5);
        ready.putExtra("ksc19-6",sChecked6);
        ready.putExtra("ksc17",toy.getStringExtra("ksc17"));
        ready.putExtra("ksc18",toy.getStringExtra("ksc18"));
        ready.putExtra("ksc18-1",toy.getStringExtra("ksc18-1"));
        ready.putExtra("ksc18-2",toy.getStringExtra("ksc18-2"));
        ready.putExtra("ksc18-3",toy.getStringExtra("ksc18-3"));
        ready.putExtra("ksc18-4",toy.getStringExtra("ksc18-4"));
        ready.putExtra("ksc18-5",toy.getStringExtra("ksc18-5"));
        ready.putExtra("ksc16-1",toy.getStringExtra("ksc16-1"));
        ready.putExtra("ksc16-2",toy.getStringExtra("ksc16-2"));
        ready.putExtra("ksc16-3",toy.getStringExtra("ksc16-3"));
        ready.putExtra("ksc16-4",toy.getStringExtra("ksc16-4"));
        ready.putExtra("ksc16-5",toy.getStringExtra("ksc16-5"));
        ready.putExtra("ksc16-6",toy.getStringExtra("ksc16-6"));
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
