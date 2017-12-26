package com.bonnie.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    private static final String TAG = Ch8Activity.class.getSimpleName(); ;
    private EditText edName;
    private EditText edPhone;
    public Button button３;
    private  Spinner ages;
    public void address(View view){
        Intent intent = new Intent(this,AddrActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edName = (EditText) findViewById(R.id.name);
        edPhone = (EditText) findViewById(R.id.phone);
        button３ = (Button) findViewById(R.id.button3);
        String name = getSharedPreferences("atm",MODE_PRIVATE).getString("NAME","");
        edName.setText(name);
        ages = (Spinner) findViewById(R.id.ages);
        //  ArrayList<String> data = new ArrayList<>();
        //  for (int i=15 ;i<=40;i++){
        //      data.add(i+"");
        //  }
        //        String[] data = getResources().getStringArray(R.array.ages);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ages, android.R.layout.simple_list_item_1);
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

