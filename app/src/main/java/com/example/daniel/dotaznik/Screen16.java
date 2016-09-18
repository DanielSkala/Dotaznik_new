package com.example.daniel.dotaznik;

import android.content.Intent;
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
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox54:
                if (checked)
                    Q15_1 = "Juraj Droba";
                break;
            case R.id.checkBox55:
                if (checked)
                    Q15_1 = "Pavol Frešo";
                break;
            case R.id.checkBox56:
                if (checked)
                    Q15_1 = "Milan Ftáčnik";
                break;
            case R.id.checkBox57:
                if (checked)
                    Q15_1 = "Boris Kollár";
                break;
            case R.id.checkBox58:
                if (checked)
                    Q15_1 = "Nikoho";
                break;
            case R.id.checkBox59:
                if (checked)
                    Q15_1 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox60:
                if (checked)
                    Q15_2 = "Juraj Droba";
                break;
            case R.id.checkBox61:
                if (checked)
                    Q15_2 = "Pavol Frešo";
                break;
            case R.id.checkBox62:
                if (checked)
                    Q15_2 = "Milan Ftáčnik";
                break;
            case R.id.checkBox63:
                if (checked)
                    Q15_2 = "Boris Kollár";
                break;
            case R.id.checkBox64:
                if (checked)
                    Q15_2 = "Nikoho";
                break;
            case R.id.checkBox65:
                if (checked)
                    Q15_2 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox66:
                if (checked)
                    Q15_3 = "Juraj Droba";
                break;
            case R.id.checkBox67:
                if (checked)
                    Q15_3 = "Pavol Frešo";
                break;
            case R.id.checkBox68:
                if (checked)
                    Q15_3 = "Milan Ftáčnik";
                break;
            case R.id.checkBox69:
                if (checked)
                    Q15_3 = "Boris Kollár";
                break;
            case R.id.checkBox70:
                if (checked)
                    Q15_3 = "Nikoho";
                break;
            case R.id.checkBox71:
                if (checked)
                    Q15_3 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox72:
                if (checked)
                    Q15_4 = "Juraj Droba";
                break;
            case R.id.checkBox73:
                if (checked)
                    Q15_4 = "Pavol Frešo";
                break;
            case R.id.checkBox74:
                if (checked)
                    Q15_4 = "Milan Ftáčnik";
                break;
            case R.id.checkBox75:
                if (checked)
                    Q15_4 = "Boris Kollár";
                break;
            case R.id.checkBox76:
                if (checked)
                    Q15_4 = "Nikoho";
                break;
            case R.id.checkBox77:
                if (checked)
                    Q15_4 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox78:
                if (checked)
                    Q15_5 = "Juraj Droba";
                break;
            case R.id.checkBox79:
                if (checked)
                    Q15_5 = "Pavol Frešo";
                break;
            case R.id.checkBox80:
                if (checked)
                    Q15_5 = "Milan Ftáčnik";
                break;
            case R.id.checkBox81:
                if (checked)
                    Q15_5 = "Boris Kollár";
                break;
            case R.id.checkBox82:
                if (checked)
                    Q15_5 = "Nikoho";
                break;
            case R.id.checkBox83:
                if (checked)
                    Q15_5 = "Neviem";
                break;
            //######################################################################################
            case R.id.checkBox84:
                if (checked)
                    Q15_6 = "Juraj Droba";
                break;
            case R.id.checkBox85:
                if (checked)
                    Q15_6 = "Pavol Frešo";
                break;
            case R.id.checkBox86:
                if (checked)
                    Q15_6 = "Milan Ftáčnik";
                break;
            case R.id.checkBox87:
                if (checked)
                    Q15_6 = "Boris Kollár";
                break;
            case R.id.checkBox88:
                if (checked)
                    Q15_6 = "Nikoho";
                break;
            case R.id.checkBox89:
                if (checked)
                    Q15_6 = "Neviem";
                break;
        }
    }

    public void init(){
        button31 = (Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen16.this, Screen17.class);
                startActivity(toy);

                Intent i = new Intent(Screen16.this, AllData.class);
                i.putExtra("Sc16-1", Q15_1);
                i.putExtra("Sc16-2", Q15_2);
                i.putExtra("Sc16-3", Q15_3);
                i.putExtra("Sc16-4", Q15_4);
                i.putExtra("Sc16-5", Q15_5);
                i.putExtra("Sc16-6", Q15_6);
                startActivity(i);

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
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen16);

        init();
        BackPressed();
    }
}
