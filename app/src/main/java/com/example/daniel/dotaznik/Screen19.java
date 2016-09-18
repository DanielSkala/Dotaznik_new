package com.example.daniel.dotaznik;

import android.content.Intent;
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

    public void onCheckboxClicked_1(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox119:
                if (checked)
                    Q18_1 = "Juraj Droba";
                break;
            case R.id.checkBox120:
                if (checked)
                    Q18_1 = "Pavol Frešo";
                break;
            case R.id.checkBox121:
                if (checked)
                    Q18_1 = "Milan Ftáčnik";
                break;
            case R.id.checkBox122:
                if (checked)
                    Q18_1 = "Boris Kollár";
                break;
            case R.id.checkBox123:
                if (checked)
                    Q18_1 = "Nikoho";
                break;
            case R.id.checkBox124:
                if (checked)
                    Q18_1 = "Neviem";
                break;
        }
    }

    public void onCheckboxClicked_2(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox95:
                if (checked)
                    Q18_2 = "Juraj Droba";
                break;
            case R.id.checkBox96:
                if (checked)
                    Q18_2 = "Pavol Frešo";
                break;
            case R.id.checkBox97:
                if (checked)
                    Q18_2 = "Milan Ftáčnik";
                break;
            case R.id.checkBox98:
                if (checked)
                    Q18_2 = "Boris Kollár";
                break;
            case R.id.checkBox99:
                if (checked)
                    Q18_2 = "Nikoho";
                break;
            case R.id.checkBox100:
                if (checked)
                    Q18_2 = "Neviem";
                break;
        }
    }

    public void onCheckboxClicked_3(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox101:
                if (checked)
                    Q18_3 = "Juraj Droba";
                break;
            case R.id.checkBox102:
                if (checked)
                    Q18_3 = "Pavol Frešo";
                break;
            case R.id.checkBox103:
                if (checked)
                    Q18_3 = "Milan Ftáčnik";
                break;
            case R.id.checkBox104:
                if (checked)
                    Q18_3 = "Boris Kollár";
                break;
            case R.id.checkBox105:
                if (checked)
                    Q18_3 = "Nikoho";
                break;
            case R.id.checkBox106:
                if (checked)
                    Q18_3 = "Neviem";
                break;
        }
    }

    public void onCheckboxClicked_4(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox107:
                if (checked)
                    Q18_4 = "Juraj Droba";
                break;
            case R.id.checkBox108:
                if (checked)
                    Q18_4 = "Pavol Frešo";
                break;
            case R.id.checkBox109:
                if (checked)
                    Q18_4 = "Milan Ftáčnik";
                break;
            case R.id.checkBox110:
                if (checked)
                    Q18_4 = "Boris Kollár";
                break;
            case R.id.checkBox111:
                if (checked)
                    Q18_4 = "Nikoho";
                break;
            case R.id.checkBox112:
                if (checked)
                    Q18_4 = "Neviem";
                break;
        }
    }

    public void onCheckboxClicked_5(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox113:
                if (checked)
                    Q18_5 = "Juraj Droba";
                break;
            case R.id.checkBox114:
                if (checked)
                    Q18_5 = "Pavol Frešo";
                break;
            case R.id.checkBox115:
                if (checked)
                    Q18_5 = "Milan Ftáčnik";
                break;
            case R.id.checkBox116:
                if (checked)
                    Q18_5 = "Boris Kollár";
                break;
            case R.id.checkBox117:
                if (checked)
                    Q18_5 = "Nikoho";
                break;
            case R.id.checkBox118:
                if (checked)
                    Q18_5 = "Neviem";
                break;
        }
    }

    public void init(){
        button37 = (Button)findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Screen19.this, Screen20.class);
                startActivity(toy);

                Intent i = new Intent(Screen19.this, AllData.class);
                i.putExtra("Sc19-1", Q18_1);
                i.putExtra("Sc19-2", Q18_2);
                i.putExtra("Sc19-3", Q18_3);
                i.putExtra("Sc19-4", Q18_4);
                i.putExtra("Sc19-5", Q18_5);
                startActivity(i);

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
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen19);

        init();
        BackPressed();
    }
}
