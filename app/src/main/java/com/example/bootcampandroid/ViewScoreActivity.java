package com.example.bootcampandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bootcampandroid.model.User;

import java.util.ArrayList;

public class ViewScoreActivity extends AppCompatActivity {
    private RecyclerView rvUsers;
    private ArrayList<User> users;
    private UserAdapter usersAdapter;
    public static final String EXTRA_OBJECT_USER_VIEWSCORE = "extra_object_user";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewscore);
        rvUsers = findViewById(R.id.rv_user);

        initUsers();

        usersAdapter = new UserAdapter(users);
        rvUsers.setAdapter(usersAdapter);
        rvUsers.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initUsers() {
        users = new ArrayList<>();
        User user = new User();
        User newuser = (User) getIntent().getSerializableExtra(EXTRA_OBJECT_USER_VIEWSCORE);
        user.setUsername(newuser.getUsername());
        user.setScore(newuser.getScore());

        users.add(user);
    }
}