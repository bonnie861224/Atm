package com.bonnie.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class AreaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ListView areas = (ListView) findViewById(R.id.area);
        int city = getIntent().getIntExtra("EXTRA_CITY", 0);
        area =null;
        switch (city) {
            case 0:
                String[] data0 = new String[]{"中正區", "暖暖區", "八堵區"};
                this.area = data0;
                break;
            case 1:
                String[] data1 = new String[]{"永和區", "板橋區", "新莊區"};
                this.area = data1;
                break;
            case 2:
                String[] data2 = new String[]{"信義區", "大安區", "士林區"};
                this.area = data2;
                break;
        }
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, area);
        areas.setAdapter(adapter);
        areas.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        getIntent().putExtra("EXTRA_AREA", area[position]);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}