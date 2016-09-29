package com.example.daniel.dotaznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DotaznikReset extends AppCompatActivity {

    public Button ano;
    public Button nie;

    public void init(){
        ano = (Button)findViewById(R.id.button56);
        ano.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toy = new Intent(DotaznikReset.this, MainActivity.class);
                //TODO - hodi ma to na zaciatok dotazniku, zabudne rozrobeny dotaznik
                startActivity(toy);
                finish();
            }
        });
    }

    //TODO - ked stlacim back, hodi ma to spat

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dotaznik_reset);
        init();
    }
}
