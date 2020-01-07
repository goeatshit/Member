package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final int RESQUEST_CODE = 9999;
    private EditText nick;
    private EditText ag;
    private EditText gen;
    private String n;
    private String a;
    private String g;

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

        }
    }
}