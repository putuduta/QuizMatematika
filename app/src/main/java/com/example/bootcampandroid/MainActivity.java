package com.example.bootcampandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bootcampandroid.model.User;

public class MainActivity extends AppCompatActivity {
    //Initialisasi
    private TextView tvTitle;
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tv_title);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        tvTitle.setText("Training Android");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateField()) {
                    //pindah page ke home ----Project skrng, source
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                    Dalam bentuk string
//                    intent.putExtra(HomeActivity.EXTRA_USERNAME, etUsername.getText().toString());
                    // Dalam bentuk OBJECT
                    User user = new User();
                    user.setUsername(etUsername.getText().toString());
                    user.setPassword(etPassword.getText().toString());
                    intent.putExtra(HomeActivity.EXTRA_OBJECT_USER, user);
                    startActivity(intent);
//                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "All field must not be empt!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean validateField() {
        if (etUsername.getText().toString().equals("") && etPassword.getText().toString().equals("")) {
            return false;
        } else {
            return true;
        }
    }
}