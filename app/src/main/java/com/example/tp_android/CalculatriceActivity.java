package com.example.tp_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import bsh.EvalError;
import bsh.Interpreter;

public class CalculatriceActivity extends AppCompatActivity {

    private String calcul = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice2);

        Button btnEgal = (Button)findViewById(R.id.calcEgal);
        btnEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calcul();
            }
        });

    }


    public void calcul(){
        Interpreter i = new Interpreter();
        Object res = null;
        try {
            res = i.eval(calcul);
        } catch (EvalError evalError) {
            evalError.printStackTrace();
        }
        TextView edit = findViewById(R.id.textView2);
        edit.setText(res.toString());
        calcul = "";
    }


    public void operator(View v){
        calcul = calcul + ((Button)v).getText().toString();
        TextView edit = findViewById(R.id.textView2);
        edit.setText(calcul);
    }

}
