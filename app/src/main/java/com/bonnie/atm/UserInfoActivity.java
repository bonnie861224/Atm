package com.bonnie.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {
    private EditText edName;
    private EditText edPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edName = (EditText) findViewById(R.id.name);
        edPhone = (EditText) findViewById(R.id.phone);
        String name = getSharedPreferences("atm",MODE_PRIVATE)
                .getString("NAME","");
        edName.setText(name);
    }
    public void info(View view) {
        String name = edName.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("LOGIN_NAME", name);
        getIntent().putExtra("LOGIN_PHONE", phone);
        setResult(RESULT_OK,getIntent());
        finish();
        }
    }
