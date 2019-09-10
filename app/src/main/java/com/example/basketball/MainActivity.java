package com.example.basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    int scoreTeamA=0;
    int scoreTeamB=0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3forA(View v)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void add2forA(View v)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void add1forA(View v)
    {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public void add3forB(View v)
    {
      scoreTeamB+=3;
      displayForTeamB(scoreTeamB);
    }
    public void add2forB(View v)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void add1forB(View v)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
