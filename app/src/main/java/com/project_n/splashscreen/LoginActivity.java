package com.project_n.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.project_n.splashscreen.util.PreferenceHelper;

public class LoginActivity extends AppCompatActivity {

    PreferenceHelper instance;
    private EditText name;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = PreferenceHelper.getInstance(getApplicationContext());

        name = findViewById(R.id.ET_UserName);
        email = findViewById(R.id.ET_UserPass);
    }

    public void Login(View view) {
        String n = name.getText().toString();
        String e = email.getText().toString();
        Toast.makeText(getApplicationContext(), "Success Login", Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(n);

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
