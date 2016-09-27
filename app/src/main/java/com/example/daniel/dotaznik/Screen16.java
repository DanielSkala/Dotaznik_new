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

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q15",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor2 = getSharedPreferences("Q15-2",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor3 = getSharedPreferences("Q15-3",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor4 = getSharedPreferences("Q15-4",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor5 = getSharedPreferences("Q15-5",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor6 = getSharedPreferences("Q15-6",MODE_PRIVATE).edit() ;

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
                startActivity(toy);
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
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen16);

        SharedPreferences settings = getSharedPreferences("Q15",MODE_PRIVATE);
        String restoredText =   settings.getString("Q15", null);
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
        SharedPreferences settings2 = getSharedPreferences("Q15-2",MODE_PRIVATE);
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
        SharedPreferences settings3 = getSharedPreferences("Q15-3",MODE_PRIVATE);
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
        SharedPreferences settings4 = getSharedPreferences("Q15-4",MODE_PRIVATE) ;
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
        SharedPreferences settings5 = getSharedPreferences("Q15-5",MODE_PRIVATE) ;
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
        SharedPreferences settings6 = getSharedPreferences("Q15-6",MODE_PRIVATE) ;
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
        init();
        BackPressed();
    }
}
