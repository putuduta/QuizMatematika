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
    private Button btnLogin, btnView;
    public static final String EXTRA_OBJECT_USER = "extra_object_user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tv_title);
        etUsername = findViewById(R.id.et_username);
        btnLogin = findViewById(R.id.btn_login);
        btnView = findViewById(R.id.btn_view_score);


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
                    intent.putExtra(HomeActivity.EXTRA_OBJECT_USER_HOME, user);
                    startActivity(intent);
//                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Please input your name", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewScoreActivity.class);
                User newuser = (User) getIntent().getSerializableExtra(EXTRA_OBJECT_USER);
                intent.putExtra(ViewScoreActivity.EXTRA_OBJECT_USER_VIEWSCORE, newuser);
                startActivity(intent);
            }
        });
    }

    private boolean validateField() {
        if (etUsername.getText().toString().equals("")) {
            return false;
        } else {
            return true;
        }
    }
}