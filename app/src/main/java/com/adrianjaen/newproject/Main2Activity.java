package com.adrianjaen.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText t;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = (Button) findViewById(R.id.boton);
        t = (EditText) findViewById(R.id.texto);
        b.setOnClickListener( this);
    }


    @Override
    public void onClick(View v) {
        String text = t.getText().toString();
        Intent i = new Intent();
        i.putExtra(Constant.INTENT_DATA_KEY, text);
        setResult(Constant.RESULT_OK, i);
        finish();
    }
}
