package com.farhanshahoriar.resultcalculator;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClkClass1Result(View view){

        Intent intent = new Intent(this,DisplayResult.class);
        intent.putExtra("Class","1");
        startActivity(intent);

    }
    void onClkClass2Result(View view){

        //Toast.makeText(this,"BtnOne",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,DisplayResult.class);
        intent.putExtra("Class","2");
        startActivity(intent);

    }
    void onClkClass3Result(View view){

        //Toast.makeText(this,"BtnOne",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,DisplayResult.class);
        intent.putExtra("Class","3");
        startActivity(intent);

    }
    void onClkClass4Result(View view){

        //Toast.makeText(this,"BtnOne",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,DisplayResult.class);
        intent.putExtra("Class","4");
        startActivity(intent);

    }
    void onClkClass5Result(View view){

        //Toast.makeText(this,"BtnOne",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,DisplayResult.class);
        intent.putExtra("Class","5");
        startActivity(intent);

    }
}
