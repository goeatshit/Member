package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int RESQUEST_CODE = 9999;
    private EditText nick;
    private EditText ag;
    private EditText gen;
    private String n;
    private String a;
    private String g;
    private String aa;
    private String bb;
    private String cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nick = findViewById(R.id.Nickname);
        ag = findViewById(R.id.Age);
        gen = findViewById(R.id.Gender);

    }

    public void Check(View v) {
        n = nick.getText().toString();
        a = ag.getText().toString();
        g = gen.getText().toString();
        if (n.equals("") && a.equals("") && g.equals("")) {
            Intent intent = new Intent(this, NicknameActivity.class);
            startActivityForResult(intent, RESQUEST_CODE);
        }else{
            Intent intent = new Intent(this, CheckedIn.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == RESQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                SharedPreferences pref = getSharedPreferences("check", Context.MODE_PRIVATE);
                aa = pref.getString("NICKNAME", "");
                bb = pref.getString("AGE", "");
                cc = pref.getString("GENDER", "");
                nick.setText(aa);
                ag.setText(bb);
                gen.setText(cc);

            }
        }
    }
}