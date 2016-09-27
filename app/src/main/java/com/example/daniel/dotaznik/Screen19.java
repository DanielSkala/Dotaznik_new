package com.example.daniel.dotaznik;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Screen19 extends AppCompatActivity {

    public Button button36;
    public Button button37;

    String Q18_1;
    String Q18_2;
    String Q18_3;
    String Q18_4;
    String Q18_5;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q18",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor2 = getSharedPreferences("Q18-2",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor3 = getSharedPreferences("Q18-3",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor4 = getSharedPreferences("Q18-4",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor5 = getSharedPreferences("Q18-5",MODE_PRIVATE).edit() ;


        CheckBox check1;
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox119:
                if (checked)
                    Q18_1 = "Juraj Droba";
                editor.putString("Q18","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox120);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox121);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox122);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox123);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox124);check1.setChecked(false);
                break;
            case R.id.checkBox120:
                if (checked)
                    Q18_1 = "Pavol Frešo";
                editor.putString("Q18","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox119);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox121);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox122);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox123);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox124);check1.setChecked(false);
                break;
            case R.id.checkBox121:
                if (checked)
                    Q18_1 = "Milan Ftáčnik";
                editor.putString("Q18","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox120);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox119);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox122);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox123);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox124);check1.setChecked(false);
                break;
            case R.id.checkBox122:
                if (checked)
                    Q18_1 = "Boris Kollár";
                editor.putString("Q18","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox120);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox121);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox119);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox123);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox124);check1.setChecked(false);
                break;
            case R.id.checkBox123:
                if (checked)
                    Q18_1 = "Nikoho";
                editor.putString("Q18","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox120);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox121);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox122);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox119);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox124);check1.setChecked(false);
                break;
            case R.id.checkBox124:
                if (checked)
                    Q18_1 = "Neviem";
                editor.putString("Q18","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox120);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox121);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox122);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox123);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox119);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox95:
                if (checked)
                    Q18_2 = "Juraj Droba";
                editor.putString("Q18-2","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox96:
                if (checked)
                    Q18_2 = "Pavol Frešo";
                editor.putString("Q18-2","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox97:
                if (checked)
                    Q18_2 = "Milan Ftáčnik";
                editor.putString("Q18-2","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox98:
                if (checked)
                    Q18_2 = "Boris Kollár";
                editor.putString("Q18-2","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox99:
                if (checked)
                    Q18_2 = "Nikoho";
                editor.putString("Q18-2","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox100:
                if (checked)
                    Q18_2 = "Neviem";
                editor.putString("Q18-2","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox101:
                if (checked)
                    Q18_3 = "Juraj Droba";
                editor.putString("Q18-3","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox102:
                if (checked)
                    Q18_3 = "Pavol Frešo";
                editor.putString("Q18-3","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox103:
                if (checked)
                    Q18_3 = "Milan Ftáčnik";
                editor.putString("Q18-3","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox104:
                if (checked)
                    Q18_3 = "Boris Kollár";
                editor.putString("Q18-3","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox105:
                if (checked)
                    Q18_3 = "Nikoho";
                editor.putString("Q18-3","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox106:
                if (checked)
                    Q18_3 = "Neviem";
                editor.putString("Q18-3","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox107:
                if (checked)
                    Q18_4 = "Juraj Droba";
                editor.putString("Q18-4","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox108:
                if (checked)
                    Q18_4 = "Pavol Frešo";
                editor.putString("Q18-4","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox109:
                if (checked)
                    Q18_4 = "Milan Ftáčnik";
                editor.putString("Q18-4","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox110:
                if (checked)
                    Q18_4 = "Boris Kollár";
                editor.putString("Q18-4","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox111:
                if (checked)
                    Q18_4 = "Nikoho";
                editor.putString("Q18-4","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox112:
                if (checked)
                    Q18_4 = "Neviem";
                editor.putString("Q18-4","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                break;
            //######################################################################################
            case R.id.checkBox113:
                if (checked)
                    Q18_5 = "Juraj Droba";
                editor.putString("Q18-5","1");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox114:
                if (checked)
                    Q18_5 = "Pavol Frešo";
                editor.putString("Q18-5","2");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox115:
                if (checked)
                    Q18_5 = "Milan Ftáčnik";
                editor.putString("Q18-5","3");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox116:
                if (checked)
                    Q18_5 = "Boris Kollár";
                editor.putString("Q18-5","4");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox117:
                if (checked)
                    Q18_5 = "Nikoho";
                editor.putString("Q18-5","5");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox118:
                if (checked)
                    Q18_5 = "Neviem";
                editor.putString("Q18-5","6");
                editor.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen19.this, AllData.class);
        i.putExtra("Sc19-1", Q18_1);
        i.putExtra("Sc19-2", Q18_2);
        i.putExtra("Sc19-3", Q18_3);
        i.putExtra("Sc19-4", Q18_4);
        i.putExtra("Sc19-5", Q18_5);
    }


    public void init(){
        button37 = (Button)findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen19.this, Screen20.class);
                startActivity(toy);
                finish();





            }
        });
    }

    public void BackPressed(){
        button36 = (Button)findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen19.this, Screen18.class);
                startActivity(toy);
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen19);

        SharedPreferences settings = getSharedPreferences("Q18",MODE_PRIVATE);
        String restoredText =   settings.getString("Q18", null);
        if (restoredText != null) {
            if (restoredText.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox119);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox120);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox121);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox122);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox123);
                checkBox.setChecked(true);
            }
            if (restoredText.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox124);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings2 = getSharedPreferences("Q18-2",MODE_PRIVATE);
        String restoredText2 = settings2.getString("Q18-2", null);

        if (restoredText2 != null) {
            if (restoredText2.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox95);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox96);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox97);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox98);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox99);
                checkBox.setChecked(true);
            }
            if (restoredText2.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox100);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings3 = getSharedPreferences("Q18-3",MODE_PRIVATE);
        String restoredText3 = settings3.getString("Q18-3", null);

        if (restoredText3 != null) {
            if (restoredText3.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox101);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox102);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox103);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox104);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox105);
                checkBox.setChecked(true);
            }
            if (restoredText3.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox106);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings4 = getSharedPreferences("Q18-4",MODE_PRIVATE) ;
        String restoredText4 = settings4.getString("Q18-4", null);

        if (restoredText4 != null) {
            if (restoredText4.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox107);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox108);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox109);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox110);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox111);
                checkBox.setChecked(true);
            }
            if (restoredText4.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox112);
                checkBox.setChecked(true);
            }
        }
        SharedPreferences settings5 = getSharedPreferences("Q18-5",MODE_PRIVATE) ;
        String restoredText5 = settings5.getString("Q18-5", null);

        if (restoredText5 != null) {
            if (restoredText5.equals("1")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox113);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("2")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox114);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("3")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox115);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("4")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox116);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("5")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox117);
                checkBox.setChecked(true);
            }
            if (restoredText5.equals("6")) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox118);
                checkBox.setChecked(true);
            }
        }
        init();
        BackPressed();
    }
}
