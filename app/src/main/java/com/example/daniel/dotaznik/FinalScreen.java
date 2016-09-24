package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FinalScreen extends AppCompatActivity {

    public Button button54;
    /*
    public EditText editText4,editText5,editText6;


    */

    public void init() {
        button54 = (Button) findViewById(R.id.button54);

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FinalScreen.this, MainActivity.class);


                EditText editText4 =(EditText) findViewById(R.id.editText66);
                EditText editText5 = (EditText) findViewById(R.id.editText67);
                EditText editText6 = (EditText) findViewById(R.id.editText68);
                String info4 = editText4.getText().toString();
                String info5 = editText5.getText().toString();
                String info6 = editText6.getText().toString();
                Intent info = new Intent (FinalScreen.this, MainActivity.class);



                info.putExtra("Den2", info6);
                info.putExtra("Datum2", info5);
                info.putExtra("Cas2", info4);
                info.putExtra("end", "1");
                startActivity(toy);
                finish();





            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
/*


*/
        init();

    }
}
