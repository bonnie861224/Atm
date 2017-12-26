package com.bonnie.atm;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private static final String TAG = CityActivity.class.getSimpleName();
    private String[] cities;
    private final static int REQUEST_CITY = 105;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView city = (ListView) findViewById(R.id.city);
        cities = new String[]{"基隆市","新北市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,cities);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);
        city.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long i) {
        Intent intent = new Intent(CityActivity.this, AreaActivity.class);
        startActivityForResult(intent ,REQUEST_CITY);
        }
    });

}

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Log.d(TAG ,"onItemClick: " + position + "/" + cities[position]);
        TextView tv =(TextView) view;
        tv.setText(tv.getText()+"*");
    }
}


