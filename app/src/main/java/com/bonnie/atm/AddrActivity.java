package com.bonnie.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static android.R.attr.data;

public class AddrActivity extends AppCompatActivity {
    private Spinner spcity;
    private Spinner sparea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        spcity = (Spinner) findViewById(R.id.spinner);
        sparea= (Spinner) findViewById(R.id.spinner);
        String[] data = {"基隆市","新北市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1 ,data);
        spcity.setAdapter(adapter);
        spcity.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    String[] data = null;
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                        if (position == 1) {
                            data = new String[]{"中正區", "暖暖區", "八堵區"};
                        }
                        if (position == 2) {
                            data = new String[]{"永和區", "板橋區", "新莊區"};
                        }
                        if (position == 3) {
                            data = new String[]{"信義區", "大安區", "士林區"};
                        }
                        ArrayAdapter adapter1 = new ArrayAdapter(AddrActivity.this, android.R.layout.simple_list_item_1);
                        sparea.setAdapter(adapter1);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });
        }
    }
