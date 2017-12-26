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
import android.widget.Toast;

import java.util.List;

import static com.bonnie.atm.R.id.parent;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private static final String TAG = CityActivity.class.getSimpleName();
    private ListView city;
    private final static int REQUEST_CITY = 105;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        city = (ListView) findViewById(R.id.city);
        String[] cities = {"基隆市", "新北市", "台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent = new Intent(this, AreaActivity.class);
        intent.putExtra("EXTRA_CITY", position);
        startActivityForResult(intent, REQUEST_CITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            String area = data.getStringExtra("EXTRA_AREA");
            Toast.makeText(this, area, Toast.LENGTH_LONG).show();
        }
    }
}
     /*  @Override
         public void onItemClick (AdapterView < ? > adapterView, View view,int position, long l){
         Log.d(TAG, "onItemClick: " + position + "/" + cities[position]);
         TextView tv =(TextView) view;
         tv.setText(tv.getText()+"*");
       }*/