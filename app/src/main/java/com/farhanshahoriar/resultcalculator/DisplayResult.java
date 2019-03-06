package com.farhanshahoriar.resultcalculator;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayResult extends AppCompatActivity {

    private TextView keyText;
    private String key = null;

    private RecyclerView fRecyclerView;
    private ResultViewAdapter resultViewAdapter;

    final int dataSize=5;
    //public IndividualResult[] resultData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        keyText = (TextView) findViewById(R.id.search_key);
        fRecyclerView = (RecyclerView) findViewById(R.id.rv_food_menu);

        Intent searchIntent = getIntent();
        key="";
        String fileName = null;
        if(searchIntent.hasExtra("Class")){
            String cls = searchIntent.getStringExtra("Class");
            if(cls.equals("1")){
                fileName = "resultdata.csv";
                keyText.setText("Class One Result:\n");
            }
            //Toast.makeText(this,key, Toast.LENGTH_LONG).show();

        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        fRecyclerView.setLayoutManager(layoutManager);
        fRecyclerView.setHasFixedSize(true);
        resultViewAdapter = new ResultViewAdapter();
        fRecyclerView.setAdapter(resultViewAdapter);

        AssetManager assetManager = getAssets();
        // String [] files = assetManager.list("");
        InputStream inputfs = null;

        try {
            inputfs = assetManager.open(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner fsc = new Scanner(inputfs);

        ArrayList<IndividualResult> resultList = new ArrayList<>();
        String inputstr;
        int in=0;

        while (fsc.hasNext()){

            inputstr = fsc.nextLine();
            IndividualResult individualResult = new IndividualResult();
            individualResult.setDatadata(inputstr);
            resultList.add(individualResult);
        }

        IndividualResult[] resultArray = null;
        resultArray= resultList.toArray(new IndividualResult[resultList.size()]);
        Arrays.sort(resultArray);

        resultViewAdapter.setData(resultArray);
    }
}
