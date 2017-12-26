package com.bonnie.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaActivity extends CityActivity {
//public class AreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        final ListView area = (ListView) findViewById(R.id.area);
        area.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            String[] data=null;
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
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
                ArrayAdapter adapter = new ArrayAdapter(
                        AreaActivity.this, android.R.layout.simple_list_item_1,
                        data);
                area.setAdapter(adapter);
            }
            });
        }
    }

