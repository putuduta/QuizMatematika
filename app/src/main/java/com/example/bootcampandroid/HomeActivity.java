package com.example.bootcampandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.bootcampandroid.model.User;

public class HomeActivity extends AppCompatActivity {
    public static final String EXTRA_USERNAME = "extra_username";
    public static final String EXTRA_OBJECT_USER = "extra_object_user";

    //final -> gabisa diubah2
    private TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvUsername = findViewById(R.id.tv_username);

//        String name = getIntent().getStringExtra(EXTRA_USERNAME);

        User user = (User) getIntent().getSerializableExtra(EXTRA_OBJECT_USER);

        tvUsername.setText("Hi, " + user.getUsername() + "\n" + "This is your password:\n" + user.getPassword());
    }
}