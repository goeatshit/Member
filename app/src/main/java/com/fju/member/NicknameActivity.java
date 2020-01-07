package com.fju.member;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private EditText nic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        nic = findViewById(R.id.nickname);
    }

    public void Arrow(View v) {
        SharedPreferences pref = getSharedPreferences("check", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("NICKNAME", nic.getText().toString())
                .commit();
        Intent intent = new Intent(this, AgeActivity.class);
        startActivity(intent);
        NicknameActivity.this.setResult(RESULT_OK);
        //      if (TextUtils.isEmpty(nic.getText().toString())) {
        //          new AlertDialog.Builder(NicknameActivity.this)
        //                 .setTitle("You got a message")
        //               .setMessage("请不要空白谢谢请重来")
        //              .setPositiveButton("OK",null)
        //                .show();
        finish();
    }
        }


