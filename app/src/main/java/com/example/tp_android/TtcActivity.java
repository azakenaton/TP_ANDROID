package com.example.tp_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TtcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttc);

        Button btnEgal = (Button)findViewById(R.id.calculTVA);
        btnEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculTVA();
            }
        });
    }

    public void calculTVA(){
        Double resultat = null;
        Double prixTTC = null,tauxTVA = null;
        EditText TTC = (EditText)findViewById(R.id.reponseDevinette);
        EditText TVA = (EditText)findViewById(R.id.tauxTVA);

        if(!TTC.getText().toString().equals("")){
            prixTTC = Double.parseDouble(TTC.getText().toString());
        }
        if(!TVA.getText().toString().equals("")){
            tauxTVA = Double.parseDouble(TVA.getText().toString());
        }

        TextView res = findViewById(R.id.resultatTTC);

        if(prixTTC == null || tauxTVA == null){
            res.setText(R.string.erreurTVA);
        }else{
            resultat = prixTTC * ((tauxTVA/100)+1);
            res.setText(resultat.toString()+'€');
        }
    }
}
