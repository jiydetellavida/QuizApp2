package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    /**
     * This method is called when the order button is clicked.
     */
    public void calculateScore(View view) {
        String priceMessage = "Your answers have been received" ;
        priceMessage = priceMessage + "\nThank you!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
