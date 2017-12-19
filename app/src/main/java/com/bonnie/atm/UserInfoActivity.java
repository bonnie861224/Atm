package com.bonnie.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    private static final String TAG = Ch8Activity.class.getSimpleName(); ;
    private EditText edName;
    private EditText edPhone;
    private  Spinner ages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edName = (EditText) findViewById(R.id.name);
        edPhone = (EditText) findViewById(R.id.phone);
        String name = getSharedPreferences("atm",MODE_PRIVATE).getString("NAME","");
        edName.setText(name);
        ages = (Spinner) findViewById(R.id.ages);
        ArrayList<String> data = new ArrayList<>();
        for (int i=15 ;i<=40;i++){
            data.add(i+"");
        }
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1 ,data);
        ages.setAdapter(adapter);
    }
    public void info(View view) {
        Log.d (TAG,"OK:"+ages.getSelectedItem().toString());
        String name = edName.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("LOGIN_NAME", name);
        getIntent().putExtra("LOGIN_PHONE", phone);
        setResult(RESULT_OK,getIntent());
        finish();
        }
    }
