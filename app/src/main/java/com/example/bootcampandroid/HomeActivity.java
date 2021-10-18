package com.example.bootcampandroid;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bootcampandroid.model.User;

public class HomeActivity extends AppCompatActivity {
    Random rand = new Random();
    public static final String EXTRA_USERNAME = "extra_username";
    public static final String EXTRA_OBJECT_USER_HOME = "extra_object_user";
    public String plusMinus = "+-/x";
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnErase, btnSubmit;


    private Character letter = plusMinus.charAt(rand.nextInt(plusMinus.length()));
    //final -> gabisa diubah2
    private TextView tvQuestion;
    private TextView tvTitleHome;
    private Integer number1 = rand.nextInt(100);
    private Integer number2 = rand.nextInt(100);
    private TextView tvAnswer;
    private long pressedTime;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvQuestion = findViewById(R.id.tv_question);
        tvAnswer = findViewById(R.id.tv_answer);
        tvTitleHome = findViewById(R.id.tv_title_home);

//        String name = getIntent().getStringExtra(EXTRA_USERNAME);

        User user = (User) getIntent().getSerializableExtra(EXTRA_OBJECT_USER_HOME);
        username = user.getUsername();
        tvQuestion.setText(number1 + " " + letter + " " + number2 + " =");

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnErase = findViewById(R.id.btn_erase);
        btnSubmit = findViewById(R.id.btn_submit);

        //my button clic
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                tvAnswer.append("0");
            }
        });

        btnErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAnswer.setText(tvAnswer.getText().toString().substring(0, tvAnswer.getText().length() - 1));
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!tvAnswer.getText().toString().equals("")) {
                    if(letter == '+') {
                        if(String.valueOf(number1 + number2).equals(tvAnswer.getText().toString())) {
                            tvTitleHome.setText(String.valueOf(Integer.parseInt(tvTitleHome.getText().toString())+10));
                            tvAnswer.setText("");
                            number1 = new Random().nextInt(100);
                            number2 = new Random().nextInt(100);
                            tvQuestion.setText("");
                            letter = plusMinus.charAt(new Random().nextInt(plusMinus.length()));
                            tvQuestion.setText(number1 + " " + letter + " " + number2 + " =");
                        } else {
                            Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(letter == '-') {
                        if(String.valueOf(number1 - number2).equals(tvAnswer.getText().toString())) {
                            tvTitleHome.setText(String.valueOf(Integer.parseInt(tvTitleHome.getText().toString())+10));
                            tvAnswer.setText("");
                            tvQuestion.setText("");
                            number1 = new Random().nextInt(100);
                            number2 = new Random().nextInt(100);
                            letter = plusMinus.charAt(new Random().nextInt(plusMinus.length()));
                            tvQuestion.setText(number1 + " " + letter + " " + number2 + " =");
                        } else {
                            Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(letter == '/') {
                        if(String.valueOf(number1 / number2).equals(tvAnswer.getText().toString())) {
                            tvTitleHome.setText(String.valueOf(Integer.parseInt(tvTitleHome.getText().toString())+10));
                            tvAnswer.setText("");
                            tvQuestion.setText("");
                            number1 = new Random().nextInt(100);
                            number2 = new Random().nextInt(100);
                            letter = plusMinus.charAt(new Random().nextInt(plusMinus.length()));
                            tvQuestion.setText(number1 + " " + letter + " " + number2 + " =");
                        } else {
                            Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(letter == 'x') {
                        if(String.valueOf(number1 * number2).equals(tvAnswer.getText().toString())) {
                            tvTitleHome.setText(String.valueOf(Integer.parseInt(tvTitleHome.getText().toString())+10));
                            tvAnswer.setText("");
                            tvQuestion.setText("");
                            number1 = new Random().nextInt(100);
                            number2 = new Random().nextInt(100);
                            letter = plusMinus.charAt(new Random().nextInt(plusMinus.length()));
                            tvQuestion.setText(number1 + " " + letter + " " + number2 + " =");
                        } else {
                            Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    Toast.makeText(getBaseContext(), "Please input the answer!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {

        if (pressedTime + 2000 > System.currentTimeMillis()) {
            User user = new User();
            user.setUsername(username);
            user.setScore(Integer.parseInt(tvTitleHome.getText().toString()));
            Intent intent = new Intent();
            intent.putExtra(MainActivity.EXTRA_OBJECT_USER, user);
            setResult(RESULT_OK, intent);
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}