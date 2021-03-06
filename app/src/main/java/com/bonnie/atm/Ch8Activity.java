package com.bonnie.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Ch8Activity extends AppCompatActivity {
    private String TAG = Ch8Activity.class.getSimpleName();
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch8);
        spinner = (Spinner) findViewById(R.id.spinner);
        final String[] data = {"AAA","BBB","CCC"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1 ,data);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                        Log.d( TAG, "onItemSelected: " + data[position]);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });
        }
    }