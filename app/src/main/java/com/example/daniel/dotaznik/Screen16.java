package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen16 extends AppCompatActivity {

    public Button button30;
    public Button button31;

    String Q15_1;
    String Q15_2;
    String Q15_3;
    String Q15_4;
    String Q15_5;
    String Q15_6;
    String sChecked,sChecked2,sChecked3,sChecked4,sChecked5,sChecked6;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q15",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor2 = getSharedPreferences("Q15-2",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor3 = getSharedPreferences("Q15-3",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor4 = getSharedPreferences("Q15-4",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor5 = getSharedPreferences("Q15-5",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor6 = getSharedPreferences("Q15-6",MODE_PRIVATE).edit() ;
        sChecked = "true";
        sChecked2 = "true";
        sChecked3 = "true";
        sChecked4 = "true";
        sChecked5 = "true";
        sChecked6 = "true";
        CheckBox check1;
        CheckBox check2;
        CheckBox check3;
        CheckBox check4;
        CheckBox check5;
        CheckBox check6;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox54:
                if (checked)
                    Q15_1 = "Juraj Droba";
                editor.putString("Q15","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox55);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox56);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox57);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox58);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox59);check1.setChecked(false);
                break;
            case R.id.checkBox55:
                if (checked)
                    Q15_1 = "Pavol Frešo";
                editor.putString("Q15","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox54);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox56);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox57);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox58);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox59);check1.setChecked(false);
                break;
            case R.id.checkBox56:
                if (checked)
                    Q15_1 = "Milan Ftáčnik";
                editor.putString("Q15","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox55);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox54);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox57);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox58);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox59);check1.setChecked(false);
                break;
            case R.id.checkBox57:
                if (checked)
                    Q15_1 = "Boris Kollár";
                editor.putString("Q15","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox55);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox56);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox54);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox58);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox59);check1.setChecked(false);
                break;
            case R.id.checkBox58:
                if (checked)
                    Q15_1 = "Nikoho";
                editor.putString("Q15","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox55);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox56);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox57);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox54);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox59);check1.setChecked(false);
                break;
            case R.id.checkBox59:
                if (checked)
                    Q15_1 = "Neviem";
                editor.putString("Q15","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox55);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox56);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox57);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox58);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox54);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox60:
                if (checked)
                    Q15_2 = "Juraj Droba";
                editor2.putString("Q15-2","1");
                editor2.commit();
                check2 = (CheckBox) findViewById(R.id.checkBox61);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox62);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox63);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox64);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox65);check2.setChecked(false);
                break;
            case R.id.checkBox61:
                if (checked)
                    Q15_2 = "Pavol Frešo";
                editor2.putString("Q15-2","2");
                editor2.commit();
                check2 = (CheckBox) findViewById(R.id.checkBox60);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox62);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox63);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox64);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox65);check2.setChecked(false);
                break;
            case R.id.checkBox62:
                if (checked)
                    Q15_2 = "Milan Ftáčnik";
                editor2.putString("Q15-2","3");
                editor2.commit();
                check2 = (CheckBox) findViewById(R.id.checkBox61);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox60);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox63);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox64);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox65);check2.setChecked(false);
                break;
            case R.id.checkBox63:
                if (checked)
                    Q15_2 = "Boris Kollár";
                editor2.putString("Q15-2","4");
                editor2.commit();
                check2= (CheckBox) findViewById(R.id.checkBox61);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox62);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox60);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox64);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox65);check2.setChecked(false);
                break;
            case R.id.checkBox64:
                if (checked)
                    Q15_2 = "Nikoho";
                editor2.putString("Q15-2","5");
                editor2.commit();
                check2 = (CheckBox) findViewById(R.id.checkBox61);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox62);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox63);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox60);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox65);check2.setChecked(false);
                break;
            case R.id.checkBox65:
                if (checked)
                    Q15_2 = "Neviem";
                editor2.putString("Q15-2","6");
                editor2.commit();
                check2 = (CheckBox) findViewById(R.id.checkBox61);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox62);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox63);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox64);check2.setChecked(false);
                check2 = (CheckBox) findViewById(R.id.checkBox60);check2.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox66:
                if (checked)
                    Q15_3 = "Juraj Droba";
                editor3.putString("Q15-3","1");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox67);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox69);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox70);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox71);check1.setChecked(false);
                break;
            case R.id.checkBox67:
                if (checked)
                    Q15_3 = "Pavol Frešo";
                editor3.putString("Q15-3","2");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox66);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox69);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox70);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox71);check1.setChecked(false);
                break;
            case R.id.checkBox68:
                if (checked)
                    Q15_3 = "Milan Ftáčnik";
                editor3.putString("Q15-3","3");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox67);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox66);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox69);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox70);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox71);check1.setChecked(false);
                break;
            case R.id.checkBox69:
                if (checked)
                    Q15_3 = "Boris Kollár";
                editor3.putString("Q15-3","4");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox67);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox66);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox70);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox71);check1.setChecked(false);
                break;
            case R.id.checkBox70:
                if (checked)
                    Q15_3 = "Nikoho";
                editor3.putString("Q15-3","5");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox67);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox69);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox66);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox71);check1.setChecked(false);
                break;
            case R.id.checkBox71:
                if (checked)
                    Q15_3 = "Neviem";
                editor3.putString("Q15-3","6");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox67);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox68);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox69);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox70);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox66);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox72:
                if (checked)
                    Q15_4 = "Juraj Droba";
                editor4.putString("Q15-4","1");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox74);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox75);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                break;
            case R.id.checkBox73:
                if (checked)
                    Q15_4 = "Pavol Frešo";
                editor4.putString("Q15-4","2");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox72);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox74);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox75);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                break;
            case R.id.checkBox74:
                if (checked)
                    Q15_4 = "Milan Ftáčnik";
                editor4.putString("Q15-4","3");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox72);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox75);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                break;
            case R.id.checkBox75:
                if (checked)
                    Q15_4 = "Boris Kollár";
                editor4.putString("Q15-4","4");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox74);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox72); check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                break;
            case R.id.checkBox76:
                if (checked)
                    Q15_4 = "Nikoho";
                editor4.putString("Q15-4","5");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox74);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox75);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox72);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox77);check1.setChecked(false);
                break;
            case R.id.checkBox77:
                if (checked)
                    Q15_4 = "Neviem";
                editor4.putString("Q15-4","6");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox73);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox74);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox75);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox76);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox72);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox78:
                if (checked)
                    Q15_5 = "Juraj Droba";
                editor5.putString("Q15-5","1");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox82);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox83);check1.setChecked(false);
                break;
            case R.id.checkBox79:
                if (checked)
                    Q15_5 = "Pavol Frešo";
                editor5.putString("Q15-5","2");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox82);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox83);check1.setChecked(false);
                break;
            case R.id.checkBox80:
                if (checked)
                    Q15_5 = "Milan Ftáčnik";
                editor5.putString("Q15-5","3");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox82);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox83);check1.setChecked(false);
                break;
            case R.id.checkBox81:
                if (checked)
                    Q15_5 = "Boris Kollár";
                editor5.putString("Q15-5","4");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox82);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox83);check1.setChecked(false);
                break;
            case R.id.checkBox82:
                if (checked)
                    Q15_5 = "Nikoho";
                editor5.putString("Q15-5","5");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox83);check1.setChecked(false);
                break;
            case R.id.checkBox83:
                if (checked)
                    Q15_5 = "Neviem";
                editor5.putString("Q15-5","6");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox79);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox80);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox81);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox82);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox78);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox84:
                if (checked)
                    Q15_6 = "Juraj Droba";
                editor6.putString("Q15-6","1");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox85);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox86);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox87);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox88);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox89);check1.setChecked(false);
                break;
            case R.id.checkBox85:
                if (checked)
                    Q15_6 = "Pavol Frešo";
                editor6.putString("Q15-6","2");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox84);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox86);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox87);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox88);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox89);check1.setChecked(false);
                break;
            case R.id.checkBox86:
                if (checked)
                    Q15_6 = "Milan Ftáčnik";
                editor6.putString("Q15-6","3");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox85);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox84);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox87);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox88);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox89);check1.setChecked(false);
                break;
            case R.id.checkBox87:
                if (checked)
                    Q15_6 = "Boris Kollár";
                editor6.putString("Q15-6","4");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox85);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox86);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox84);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox88);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox89);check1.setChecked(false);
                break;
            case R.id.checkBox88:
                if (checked)
                    Q15_6 = "Nikoho";
                editor6.putString("Q15-6","5");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox85);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox86);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox87);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox84);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox89);check1.setChecked(false);
                break;
            case R.id.checkBox89:
                if (checked)
                    Q15_6 = "Neviem";
                editor6.putString("Q15-6","6");
                editor6.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox85);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox86);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox87);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox88);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox84);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen16.this, MainActivity.class);
        i.putExtra("Sc16-1", Q15_1);
        i.putExtra("Sc16-2", Q15_2);
        i.putExtra("Sc16-3", Q15_3);
        i.putExtra("Sc16-4", Q15_4);
        i.putExtra("Sc16-5", Q15_5);
        i.putExtra("Sc16-6", Q15_6);
    }


    public void init(){
        button31 = (Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen16.this, Screen17.class);
                startActivity(sendIsChecked(toy));
                finish();




            }
        });
    }

    public void BackPressed(){
        button30 = (Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen16.this, Screen15.class);
                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen16);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc16-1");
        if (i.getStringExtra("ksc16-1") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = getSharedPreferences("Q15", MODE_PRIVATE);
            String restoredText = settings.getString("Q15", null);
            if (restoredText != null) {
                if (restoredText.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox54);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox55);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox56);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox57);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox58);
                    checkBox.setChecked(true);
                }
                if (restoredText.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox59);
                    checkBox.setChecked(true);
                }
            }
        }
        Intent i1 = getIntent();
        String s1 = i1.getStringExtra("ksc16-2");
        if (i1.getStringExtra("ksc16-2") == null)
            s1 = "true";
        if(s1.equals("true")) {
            SharedPreferences settings2 = getSharedPreferences("Q15-2", MODE_PRIVATE);
            String restoredText2 = settings2.getString("Q15-2", null);

            if (restoredText2 != null) {
                if (restoredText2.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox60);
                    checkBox.setChecked(true);
                }
                if (restoredText2.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox61);
                    checkBox.setChecked(true);
                }
                if (restoredText2.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox62);
                    checkBox.setChecked(true);
                }
                if (restoredText2.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox63);
                    checkBox.setChecked(true);
                }
                if (restoredText2.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox64);
                    checkBox.setChecked(true);
                }
                if (restoredText2.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox65);
                    checkBox.setChecked(true);
                }
            }
        }
        Intent i3 = getIntent();
        String s3 = i3.getStringExtra("ksc16-3");
        if (i3.getStringExtra("ksc16-3") == null)
            s3 = "true";
        if(s3.equals("true")) {
            SharedPreferences settings3 = getSharedPreferences("Q15-3", MODE_PRIVATE);
            String restoredText3 = settings3.getString("Q15-3", null);

            if (restoredText3 != null) {
                if (restoredText3.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox66);
                    checkBox.setChecked(true);
                }
                if (restoredText3.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox67);
                    checkBox.setChecked(true);
                }
                if (restoredText3.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox68);
                    checkBox.setChecked(true);
                }
                if (restoredText3.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox69);
                    checkBox.setChecked(true);
                }
                if (restoredText3.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox70);
                    checkBox.setChecked(true);
                }
                if (restoredText3.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox71);
                    checkBox.setChecked(true);
                }
            }
        }
        Intent i4 = getIntent();
        String s4 = i4.getStringExtra("ksc16-4");
        if (i4.getStringExtra("ksc16-4") == null)
            s4 = "true";
        if(s4.equals("true")) {
            SharedPreferences settings4 = getSharedPreferences("Q15-4", MODE_PRIVATE);
            String restoredText4 = settings4.getString("Q15-4", null);

            if (restoredText4 != null) {
                if (restoredText4.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox72);
                    checkBox.setChecked(true);
                }
                if (restoredText4.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox73);
                    checkBox.setChecked(true);
                }
                if (restoredText4.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox74);
                    checkBox.setChecked(true);
                }
                if (restoredText4.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox75);
                    checkBox.setChecked(true);
                }
                if (restoredText4.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox76);
                    checkBox.setChecked(true);
                }
                if (restoredText4.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox77);
                    checkBox.setChecked(true);
                }
            }
        }
        Intent i5 = getIntent();
        String s5 = i5.getStringExtra("ksc16-5");
        if (i5.getStringExtra("ksc16-5") == null)
            s5 = "true";
        if(s5.equals("true")) {
            SharedPreferences settings5 = getSharedPreferences("Q15-5", MODE_PRIVATE);
            String restoredText5 = settings5.getString("Q15-5", null);

            if (restoredText5 != null) {
                if (restoredText5.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox78);
                    checkBox.setChecked(true);
                }
                if (restoredText5.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox79);
                    checkBox.setChecked(true);
                }
                if (restoredText5.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox80);
                    checkBox.setChecked(true);
                }
                if (restoredText5.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox81);
                    checkBox.setChecked(true);
                }
                if (restoredText5.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox82);
                    checkBox.setChecked(true);
                }
                if (restoredText5.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox83);
                    checkBox.setChecked(true);
                }
            }
        }
        Intent i6 = getIntent();
        String s6 = i6.getStringExtra("ksc16-6");
        if (i6.getStringExtra("ksc16-6") == null)
            s6 = "true";
        if(s6.equals("true")) {
            SharedPreferences settings6 = getSharedPreferences("Q15-6", MODE_PRIVATE);
            String restoredText6 = settings6.getString("Q15-6", null);
            if (restoredText6 != null) {
                if (restoredText6.equals("1")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox84);
                    checkBox.setChecked(true);
                }
                if (restoredText6.equals("2")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox85);
                    checkBox.setChecked(true);
                }
                if (restoredText6.equals("3")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox86);
                    checkBox.setChecked(true);
                }
                if (restoredText6.equals("4")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox87);
                    checkBox.setChecked(true);
                }
                if (restoredText6.equals("5")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox88);
                    checkBox.setChecked(true);
                }
                if (restoredText6.equals("6")) {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox89);
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




        if(toy.getStringExtra("sc16-1") == null ||  !toy.getStringExtra("sc16-1").equals(Q15_1))

            ready.putExtra("sc16-1", Q15_1);
        else
            ready.putExtra("sc16-1", toy.getStringExtra("sc16-1"));




        if(toy.getStringExtra("sc16-2") == null ||  !toy.getStringExtra("sc16-2").equals(Q15_2))

            ready.putExtra("sc16-2", Q15_2);
        else
            ready.putExtra("sc16-2", toy.getStringExtra("sc16-2"));



        if(toy.getStringExtra("sc16-3") == null ||  !toy.getStringExtra("sc16-3").equals(Q15_3))

            ready.putExtra("sc16-3", Q15_3);
        else
            ready.putExtra("sc16-3", toy.getStringExtra("sc16-3"));




        if(toy.getStringExtra("sc16-4") == null ||  !toy.getStringExtra("sc16-4").equals(Q15_4))

            ready.putExtra("sc16-4", Q15_4);
        else
            ready.putExtra("sc16-4", toy.getStringExtra("sc16-4"));




        if(toy.getStringExtra("sc16-5") == null ||  !toy.getStringExtra("sc16-5").equals(Q15_5))

            ready.putExtra("sc16-5", Q15_5);
        else
            ready.putExtra("sc16-5", toy.getStringExtra("sc16-5"));




        if(toy.getStringExtra("sc16-6") == null ||  !toy.getStringExtra("sc16-6").equals(Q15_6))

            ready.putExtra("sc16-6", Q15_6);
        else
            ready.putExtra("sc16-6", toy.getStringExtra("sc16-6"));


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
        ready.putExtra("sc12", toy.getStringExtra("sc15"));
        ready.putExtra("sc17", toy.getStringExtra("sc17"));
        ready.putExtra("sc18", toy.getStringExtra("sc18"));
        ready.putExtra("sc18-1", toy.getStringExtra("sc18-1"));
        ready.putExtra("sc18-2", toy.getStringExtra("sc18-2"));
        ready.putExtra("sc18-3", toy.getStringExtra("sc18-3"));
        ready.putExtra("sc18-4", toy.getStringExtra("sc18-4"));
        ready.putExtra("sc18-5", toy.getStringExtra("sc18-5"));
        ready.putExtra("sc19-1", toy.getStringExtra("sc19-1"));
        ready.putExtra("sc19-2", toy.getStringExtra("sc19-2"));
        ready.putExtra("sc19-3", toy.getStringExtra("sc19-3"));
        ready.putExtra("sc19-4", toy.getStringExtra("sc19-4"));
        ready.putExtra("sc19-5", toy.getStringExtra("sc19-5"));
        ready.putExtra("sc19-6", toy.getStringExtra("sc19-6"));
        ready.putExtra("sc20", toy.getStringExtra("sc20"));
        ready.putExtra("sc21", toy.getStringExtra("sc21"));
        ready.putExtra("sc22", toy.getStringExtra("sc22"));
        ready.putExtra("sc23", toy.getStringExtra("sc23"));
        ready.putExtra("sc24", toy.getStringExtra("sc24"));
        ready.putExtra("sc25", toy.getStringExtra("sc25"));
        ready.putExtra("sc26", toy.getStringExtra("sc26"));
        ready.putExtra("sc27", toy.getStringExtra("sc27"));
        ready.putExtra("sc28", toy.getStringExtra("sc28"));

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
        ready.putExtra("ksc16-1",sChecked);
        ready.putExtra("ksc16-2",sChecked2);
        ready.putExtra("ksc16-3",sChecked3);
        ready.putExtra("ksc16-4",sChecked4);
        ready.putExtra("ksc16-5",sChecked5);
        ready.putExtra("ksc16-6",sChecked6);
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
