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

    void onClkClassOnResult(View view){

        Toast.makeText(this,"BtnOne",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,DisplayResult.class);
        intent.putExtra("Class","one");
        startActivity(intent);

    }
}
