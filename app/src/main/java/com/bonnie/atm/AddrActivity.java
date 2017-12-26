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
        spcity = (Spinner) findViewById(R.id.sp_city);
        sparea= (Spinner) findViewById(R.id.sp_area);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,new String[] {"基隆市","新北市","台北市"});
        spcity.setAdapter(adapter);
        spcity.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    String[] data = null;
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                        switch(position){
                            case 0:
                                data = new String[]{"中正區", "暖暖區", "八堵區"};
                                break;
                            case 1:
                                data = new String[]{"永和區", "板橋區", "新莊區"};
                                break;
                            case 2:
                                data = new String[]{"信義區", "大安區", "士林區"};
                                break;
                        }
                        ArrayAdapter adapter1 = new ArrayAdapter(
                                AddrActivity.this, android.R.layout.simple_list_item_1,
                                data);
                        sparea.setAdapter(adapter1);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });
        }
    }
