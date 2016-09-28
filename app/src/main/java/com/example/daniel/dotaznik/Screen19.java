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
    String sChecked,sChecked2,sChecked3,sChecked4,sChecked5;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        SharedPreferences.Editor editor = getSharedPreferences("Q18",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor2 = getSharedPreferences("Q18-2",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor3 = getSharedPreferences("Q18-3",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor4 = getSharedPreferences("Q18-4",MODE_PRIVATE).edit() ;
        SharedPreferences.Editor editor5 = getSharedPreferences("Q18-5",MODE_PRIVATE).edit() ;


        CheckBox check1;
        sChecked = "true";
        sChecked2 = "true";
        sChecked3 = "true";
        sChecked4 = "true";
        sChecked5 = "true";
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
                editor2.putString("Q18-2","1");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox96:
                if (checked)
                    Q18_2 = "Pavol Frešo";
                editor2.putString("Q18-2","2");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox97:
                if (checked)
                    Q18_2 = "Milan Ftáčnik";
                editor2.putString("Q18-2","3");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox98:
                if (checked)
                    Q18_2 = "Boris Kollár";
                editor2.putString("Q18-2","4");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox99);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox99:
                if (checked)
                    Q18_2 = "Nikoho";
                editor2.putString("Q18-2","5");
                editor2.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox96);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox97);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox98);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox95);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox100);check1.setChecked(false);
                break;
            case R.id.checkBox100:
                if (checked)
                    Q18_2 = "Neviem";
                editor2.putString("Q18-2","6");
                editor2.commit();
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
                editor3.putString("Q18-3","1");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox102:
                if (checked)
                    Q18_3 = "Pavol Frešo";
                editor3.putString("Q18-3","2");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox103:
                if (checked)
                    Q18_3 = "Milan Ftáčnik";
                editor3.putString("Q18-3","3");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox104:
                if (checked)
                    Q18_3 = "Boris Kollár";
                editor3.putString("Q18-3","4");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox105);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox105:
                if (checked)
                    Q18_3 = "Nikoho";
                editor3.putString("Q18-3","5");
                editor3.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox102);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox103);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox104);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox101);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox106);check1.setChecked(false);
                break;
            case R.id.checkBox106:
                if (checked)
                    Q18_3 = "Neviem";
                editor3.putString("Q18-3","6");
                editor3.commit();
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
                editor4.putString("Q18-4","1");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox108:
                if (checked)
                    Q18_4 = "Pavol Frešo";
                editor4.putString("Q18-4","2");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox109:
                if (checked)
                    Q18_4 = "Milan Ftáčnik";
                editor4.putString("Q18-4","3");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox110:
                if (checked)
                    Q18_4 = "Boris Kollár";
                editor4.putString("Q18-4","4");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox111);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox111:
                if (checked)
                    Q18_4 = "Nikoho";
                editor4.putString("Q18-4","5");
                editor4.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox108);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox109);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox110);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox107);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox112);check1.setChecked(false);
                break;
            case R.id.checkBox112:
                if (checked)
                    Q18_4 = "Neviem";
                editor4.putString("Q18-4","6");
                editor4.commit();
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
                editor5.putString("Q18-5","1");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox114:
                if (checked)
                    Q18_5 = "Pavol Frešo";
                editor5.putString("Q18-5","2");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox115:
                if (checked)
                    Q18_5 = "Milan Ftáčnik";
                editor5.putString("Q18-5","3");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox116:
                if (checked)
                    Q18_5 = "Boris Kollár";
                editor5.putString("Q18-5","4");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox117:
                if (checked)
                    Q18_5 = "Nikoho";
                editor5.putString("Q18-5","5");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox118);check1.setChecked(false);
                break;
            case R.id.checkBox118:
                if (checked)
                    Q18_5 = "Neviem";
                editor5.putString("Q18-5","6");
                editor5.commit();
                check1 = (CheckBox) findViewById(R.id.checkBox114);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox115);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox116);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox117);check1.setChecked(false);
                check1 = (CheckBox) findViewById(R.id.checkBox113);check1.setChecked(false);
                break;
        }
        Intent i = new Intent(Screen19.this, AllData.class);
        i.putExtra("Sc18-1", Q18_1);
        i.putExtra("Sc18-2", Q18_2);
        i.putExtra("Sc18-3", Q18_3);
        i.putExtra("Sc18-4", Q18_4);
        i.putExtra("Sc18-5", Q18_5);
    }


    public void init(){
        button37 = (Button)findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen19.this, Screen20.class);
                startActivity(sendIsChecked(toy));
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
                startActivity(sendIsChecked(toy));
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen19);
        Intent i = getIntent();
        String s = i.getStringExtra("ksc18-1");
        if (i.getStringExtra("ksc18-1") == null)
            s = "true";
        if(s.equals("true")) {
            SharedPreferences settings = getSharedPreferences("Q18", MODE_PRIVATE);
            String restoredText = settings.getString("Q18", null);
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
        }
            Intent i2 = getIntent();
            String s2 = i2.getStringExtra("ksc18-2");
            if (i2.getStringExtra("ksc18-2") == null)
                s2 = "true";
            if(s2.equals("true")) {
                SharedPreferences settings2 = getSharedPreferences("Q18-2", MODE_PRIVATE);
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
            }
        Intent i3 = getIntent();
        String s3 = i3.getStringExtra("ksc18-3");
        if (i3.getStringExtra("ksc18-3") == null)
            s3 = "true";
        if(s3.equals("true")) {
            SharedPreferences settings3 = getSharedPreferences("Q18-3", MODE_PRIVATE);
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
        }
        Intent i4 = getIntent();
        String s4 = i4.getStringExtra("ksc18-4");
        if (i4.getStringExtra("ksc18-4") == null)
            s4 = "true";
        if(s4.equals("true")) {
            SharedPreferences settings4 = getSharedPreferences("Q18-4", MODE_PRIVATE);
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
        }
        Intent i5 = getIntent();
        String s5 = i5.getStringExtra("ksc18-5");
        if (i5.getStringExtra("ksc18-5") == null)
            s5 = "true";
        if(s5.equals("true")) {
            SharedPreferences settings5 = getSharedPreferences("Q18-5", MODE_PRIVATE);
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
        }
        init();
        BackPressed();
    }
    public Intent sendIsChecked(Intent ready)
    {
        Intent toy = getIntent();
        boolean isChecked;


        ready.putExtra("sc18-1", Q18_1);
        ready.putExtra("sc18-2", Q18_2);
        ready.putExtra("sc18-3", Q18_3);
        ready.putExtra("sc18-4", Q18_4);
        ready.putExtra("sc18-5", Q18_5);

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
        ready.putExtra("ksc18-1",sChecked);
        ready.putExtra("ksc18-2",sChecked2);
        ready.putExtra("ksc18-3",sChecked3);
        ready.putExtra("ksc18-4",sChecked4);
        ready.putExtra("ksc18-5",sChecked5);
        ready.putExtra("ksc16-6",toy.getStringExtra("ksc16-6"));
        ready.putExtra("ksc17",toy.getStringExtra("ksc17"));
        ready.putExtra("ksc18",toy.getStringExtra("ksc18"));
        ready.putExtra("ksc16-1",toy.getStringExtra("ksc16-1"));
        ready.putExtra("ksc16-2",toy.getStringExtra("ksc16-2"));
        ready.putExtra("ksc16-3",toy.getStringExtra("ksc16-3"));
        ready.putExtra("ksc16-4",toy.getStringExtra("ksc16-4"));
        ready.putExtra("ksc16-5",toy.getStringExtra("ksc16-5"));
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
