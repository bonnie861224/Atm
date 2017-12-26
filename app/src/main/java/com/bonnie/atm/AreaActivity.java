package com.bonnie.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class AreaActivity extends AppCompatActivity {
    private String[] area1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ListView area = (ListView) findViewById(R.id.area);
        area1 = new String[]{"中正區", "暖暖區", "八堵區"};


    }
}
