package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    private EditText ae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        ae = findViewById(R.id.age);
    }

    public void Arrow2(View v) {
        SharedPreferences pref = getSharedPreferences("check", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("AGE", ae.getText().toString())
                .commit();
        Intent intent = new Intent(this, GenderActivity.class);
        startActivity(intent);
        AgeActivity.this.setResult(RESULT_OK);
        finish();
    }
}
