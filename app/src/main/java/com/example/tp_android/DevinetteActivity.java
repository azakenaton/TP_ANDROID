package com.example.tp_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class DevinetteActivity extends AppCompatActivity {

    private int valeur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devinette);

        Random r = new Random();
        valeur = 0 + r.nextInt(10000 - 0);

        Button btnEgal = (Button)findViewById(R.id.demandeDevinette);
        btnEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                informatioRandom();
            }
        });
    }

    public void informatioRandom(){
        TextView repDev = findViewById(R.id.resultat);
        Integer reponse = null;

        if(!repDev.getText().toString().equals("")){
            reponse = Integer.parseInt(repDev.getText().toString());
        }

        if(reponse != null){
            if(reponse < valeur){
                repDev.setText(R.string.plus);
            }else if(reponse > valeur){
                repDev.setText(R.string.moins);
            }else{
                repDev.setText(R.string.gagne);
            }
        }
    }
}
