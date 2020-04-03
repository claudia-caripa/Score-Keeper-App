package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int inning = 0;
    int runTeamA = 0;
    int outTeamA = 0;
    int runTeamB = 0;
    int outTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add the number of the inning that's been playing in the game
     *
     * @param view
     */
    public void addInning(View view) {
        inning = inning + 1;
        displayInning(inning);

    }

    /**
     * Displays the inning number in the text view
     *
     * @param inning
     */
    public void displayInning(int inning) {
        TextView scoreView = (TextView) findViewById(R.id.inning);
        scoreView.setText(String.valueOf(inning));
    }

    /**
     * Increases Team A's runs by 1
     *
     * @param view
     */
    public void addRunTeamA(View view) {
        runTeamA = runTeamA + 1;
        displayRunTeamA(runTeamA);
    }

    /**
     * Displays the Team A's runs
     *
     * @param run
     */
    public void displayRunTeamA(int run) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_runs);
        scoreView.setText(String.valueOf(run));
    }

    /**
     * Increases Team A's outs by 1. If there is a third out, it will reset to 0
     *
     * @param view
     */
    public void addOutTeamA(View view) {
        outTeamA = outTeamA + 1;
        if (outTeamA == 3) {
            outTeamA = 0;
        }
        displayOuTeamA(outTeamA);
    }

    /**
     * Displays the Team A's outs
     *
     * @param out
     */
    public void displayOuTeamA(int out) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_outs);
        scoreView.setText(String.valueOf(out));
    }

    /**
     * Increases Team B's runs by 1
     *
     * @param view
     */
    public void addRunTeamB(View view) {
        runTeamB = runTeamB + 1;
        displayRunTeamB(runTeamB);
    }

    /**
     * Displays the Team B's runs
     *
     * @param run
     */
    public void displayRunTeamB(int run) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_runs);
        scoreView.setText(String.valueOf(run));
    }

    /**
     * Increases Team B's outs by 1. If there is a third out, it will reset to 0
     *
     * @param view
     */
    public void addOutTeamB(View view) {
        outTeamB = outTeamB + 1;
        if (outTeamB == 3) {
            outTeamB = 0;
        }
        displayOuTeamB(outTeamB);
    }

    /**
     * Displays the Team A's outs
     *
     * @param out
     */
    public void displayOuTeamB(int out) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_outs);
        scoreView.setText(String.valueOf(out));
    }

    /**
     * Updates the inning, runs and out to 0
     *
     * @param view
     */
    public void resetGame(View view) {
        inning = 0;
        runTeamA = 0;
        outTeamA = 0;
        runTeamB = 0;
        outTeamB = 0;
        displayInning(inning);
        displayRunTeamA(runTeamA);
        displayRunTeamB(runTeamB);
        displayOuTeamA(outTeamA);
        displayOuTeamB(outTeamB);
    }


}
