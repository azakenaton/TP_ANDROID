package com.example.tp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void appliChoice(View v){
        if(v.getId()==R.id.calculatrice) {
            Intent i = new Intent(this, CalculatriceActivity.class);
            startActivity(i);
        }
        if(v.getId()==R.id.ttc) {
            Intent i = new Intent(this, TtcActivity.class);
            startActivity(i);
        }
    }


}
