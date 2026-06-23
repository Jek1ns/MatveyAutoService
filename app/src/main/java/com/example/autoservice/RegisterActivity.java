package com.example.autoservice;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText etRegLogin = findViewById(R.id.etLogin);
        EditText etRegPassword = findViewById(R.id.etPassword);
        Button btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {
            String login = etRegLogin.getText().toString();
            String pass = etRegPassword.getText().toString();

            if(!login.isEmpty() && !pass.isEmpty()) {
                SharedPreferences prefs = getSharedPreferences("AutoApp", MODE_PRIVATE);
                prefs.edit().putString(login, pass).apply();
                Toast.makeText(this, "Успешно! Теперь войдите.", Toast.LENGTH_SHORT).show();
                finish(); // Возвращает на экран логина
            } else {
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
            }
        });
    }
}