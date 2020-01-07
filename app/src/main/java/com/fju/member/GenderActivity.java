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

public class GenderActivity extends AppCompatActivity {

    private EditText gg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        gg = findViewById(R.id.gender);
    }

    public void Ok(View v) {
        SharedPreferences pref = getSharedPreferences("check", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("GENDER", gg.getText().toString())
                .commit();
        GenderActivity.this.setResult(RESULT_OK);
    //    if (TextUtils.isEmpty(gg.getText().toString())) {
     //       new AlertDialog.Builder(GenderActivity.this)
       //             .setTitle("You got a message")
       //             .setMessage("请不要空白谢谢请重来")
        //            .setPositiveButton("OK", null)
       //             .show();
            finish();

        }
    }
