package com.adrianjaen.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.text);
        b = (Button) findViewById(R.id.button1);

        b.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view){
        Intent i = new Intent(this, Main2Activity.class);
        startActivityForResult(i, Constant.MAIN_ACTIVITY_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == Constant.MAIN_ACTIVITY_REQUEST && resultCode == Constant.RESULT_OK){
            Bundle extras = data.getExtras();
            if (extras != null){
                String text = extras.getString(Constant.INTENT_DATA_KEY, "NO HABÍA TEXTO");
                tv.setText(text);
            }

        }
    }
}
