package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    String answer1 = "yes";
//    String answer2 = "no";
//    String answer3 = "yes";
//    String answer4 = "yes";
//    String[] pickedAnswers = {};
    int totalScore = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int calculateScore(boolean true, boolean false, boolean true, boolean true) {
        if (true) {
            totalScore++;
        }

        if (false) {
            totalScore++;
        }
        if (true) {
            totalScore++;
        }
        if (true) {
            totalScore++;
        }

        return totalScore;
    }
}
