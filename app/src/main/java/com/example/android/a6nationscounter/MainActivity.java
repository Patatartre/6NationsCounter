package com.example.android.a6nationscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numberTryRed = 0;
    int numberTryBlue = 0;

    int numberConversionRed = 0;
    int numberConversionBlue = 0;

    int numberDropRed = 0;
    int numberDropBlue = 0;

    int numberPenaltyRed = 0;
    int numberPenaltyBlue = 0;

    int scoreTeamBlue = 0;
    int scoreTeamRed = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamRedScore(0);
        displayForTeamBlueScore(0);

    }

    /**
     * Displays the given score and try for Team Red.
     */
    public void addTryToRed(View view) {
        numberTryRed = numberTryRed + 1;
        scoreTeamRed = scoreTeamRed + 5;
        displayForTeamRedScore(scoreTeamRed);

    }

    /**
     * Displays the given score and try for Team Blue.
     */
    public void addTryToBlue(View view) {
        numberTryBlue = numberTryBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 5;
        displayForTeamBlueScore(scoreTeamBlue);

    }

    /**
     * Displays the given score and conversion for Team Red.
     */
    public void addConversionToRed(View view) {
        numberConversionRed = numberConversionRed + 1;
        scoreTeamRed = scoreTeamRed + 2;
        displayForTeamRedScore(scoreTeamRed);

    }

    /**
     * Displays the given score and conversion for Team Blue.
     */
    public void addConversionToBlue(View view) {
        numberConversionBlue = numberConversionBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 2;
        displayForTeamBlueScore(scoreTeamBlue);

    }

    /**
     * Displays the given score and drop for Team Red.
     */
    public void addDropToRed(View view) {
        numberDropRed = numberDropRed + 1;
        scoreTeamRed = scoreTeamRed + 3;
        displayForTeamRedScore(scoreTeamRed);

    }

    /**
     * Displays the given score and drop for Team Blue.
     */
    public void addDropToBlue(View view) {
        numberDropBlue = numberDropBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 3;
        displayForTeamBlueScore(scoreTeamBlue);

    }

    /**
     * Displays the given score and penalty for Team Red.
     */
    public void addPenaltyToRed(View view) {
        numberPenaltyRed = numberPenaltyRed + 1;
        scoreTeamRed = scoreTeamRed + 3;
        displayForTeamRedScore(scoreTeamRed);

    }

    /**
     * Displays the given score and penalty for Team Blue.
     */
    public void addPenaltyToBlue(View view) {
        numberPenaltyBlue = numberPenaltyBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 3;
        displayForTeamBlueScore(scoreTeamBlue);

    }


    /**
     * Displays the given score for Team Blue.
     */
    public void displayForTeamBlueScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Red.
     */
    public void displayForTeamRedScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of try for Team Blue.
     */
    public void displayForTeamBlueTry(int numberTry) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_try);
        scoreView.setText(String.valueOf(numberTry));
    }


}

