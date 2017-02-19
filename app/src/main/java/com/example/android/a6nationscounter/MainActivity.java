package com.example.android.a6nationscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamBlue = 0;
    int scoreTeamRed = 0;

    int numberTryRed = 0;
    int numberTryBlue = 0;

    int numberConversionRed = 0;
    int numberConversionBlue = 0;

    int numberDropRed = 0;
    int numberDropBlue = 0;

    int numberPenaltyRed = 0;
    int numberPenaltyBlue = 0;



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
        displayForTeamRedTry(numberTryRed);

    }

    /**
     * Displays the given score and try for Team Blue.
     */
    public void addTryToBlue(View view) {
        numberTryBlue = numberTryBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 5;
        displayForTeamBlueScore(scoreTeamBlue);
        displayForTeamBlueTry(numberTryBlue);

    }

    /**
     * Displays the given score and conversion for Team Red.
     */
    public void addConversionToRed(View view) {
        numberConversionRed = numberConversionRed + 1;
        scoreTeamRed = scoreTeamRed + 2;
        displayForTeamRedScore(scoreTeamRed);
        displayForTeamRedConvertion(numberConversionRed);

    }

    /**
     * Displays the given score and conversion for Team Blue.
     */
    public void addConversionToBlue(View view) {
        numberConversionBlue = numberConversionBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 2;
        displayForTeamBlueScore(scoreTeamBlue);
        displayForTeamBlueConvertion(numberConversionBlue);

    }

    /**
     * Displays the given score and drop for Team Red.
     */
    public void addDropToRed(View view) {
        numberDropRed = numberDropRed + 1;
        scoreTeamRed = scoreTeamRed + 3;
        displayForTeamRedScore(scoreTeamRed);
        displayForTeamRedDrop(numberDropRed);

    }

    /**
     * Displays the given score and drop for Team Blue.
     */
    public void addDropToBlue(View view) {
        numberDropBlue = numberDropBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 3;
        displayForTeamBlueScore(scoreTeamBlue);
        displayForTeamBlueDrop(numberDropBlue);

    }

    /**
     * Displays the given score and penalty for Team Red.
     */
    public void addPenaltyToRed(View view) {
        numberPenaltyRed = numberPenaltyRed + 1;
        scoreTeamRed = scoreTeamRed + 3;
        displayForTeamRedScore(scoreTeamRed);
        displayForTeamRedPenalty(numberPenaltyRed);

    }

    /**
     * Displays the given score and penalty for Team Blue.
     */
    public void addPenaltyToBlue(View view) {
        numberPenaltyBlue = numberPenaltyBlue + 1;
        scoreTeamBlue = scoreTeamBlue + 3;
        displayForTeamBlueScore(scoreTeamBlue);
        displayForTeamBluePenalty(numberPenaltyBlue);

    }


    public void reset(View view) {
        numberTryRed = 0;
        numberTryBlue = 0;

        numberConversionRed = 0;
        numberConversionBlue = 0;

        numberDropRed = 0;
        numberDropBlue = 0;

        numberPenaltyRed = 0;
        numberPenaltyBlue = 0;

        scoreTeamBlue = 0;
        scoreTeamRed = 0;

        displayForTeamRedScore(scoreTeamRed);
        displayForTeamBlueScore(scoreTeamBlue);

        displayForTeamBlueTry(numberTryBlue) ;
        displayForTeamRedTry(numberTryRed) ;

        displayForTeamBlueConvertion(numberConversionBlue) ;
        displayForTeamRedConvertion (numberConversionRed) ;

        displayForTeamBlueDrop(numberDropBlue) ;
        displayForTeamRedDrop(numberDropRed);

        displayForTeamBluePenalty(numberPenaltyBlue);
        displayForTeamRedPenalty(numberPenaltyRed);


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

    /**
     * Displays the number of try for Team Red.
     */
    public void displayForTeamRedTry(int numberTry) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_try);
        scoreView.setText(String.valueOf(numberTry));
    }

    /**
     * Displays the number of Conversion for Team Blue.
     */
    public void displayForTeamBlueConvertion(int numberConversion) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_conversion);
        scoreView.setText(String.valueOf(numberConversion));
    }

    /**
     * Displays the number of Conversion for Team Red.
     */
    public void displayForTeamRedConvertion(int numberConversion) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_conversion);
        scoreView.setText(String.valueOf(numberConversion));
    }

    /**
     * Displays the number of Drop for Team Blue.
     */
    public void displayForTeamBlueDrop(int numberDrop) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_dropgoal);
        scoreView.setText(String.valueOf(numberDrop));
    }

    /**
     * Displays the number of Drop for Team Red.
     */
    public void displayForTeamRedDrop(int numberDrop) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_dropgoal);
        scoreView.setText(String.valueOf(numberDrop));
    }

    /**
     * Displays the number of Penalty for Team Blue.
     */
    public void displayForTeamBluePenalty(int numberPenalty) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_penalty);
        scoreView.setText(String.valueOf(numberPenalty));
    }

    /**
     * Displays the number of Penalty for Team Red.
     */
    public void displayForTeamRedPenalty(int numberPenalty) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_penalty);
        scoreView.setText(String.valueOf(numberPenalty));
    }


}

