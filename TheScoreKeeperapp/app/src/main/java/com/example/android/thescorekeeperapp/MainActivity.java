package com.example.android.thescorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ahlyscore = 0;
    int zamalekscore = 0;
    int zamalekfoul= 0;
    int ahlyfoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void drawforahly (View view) {
        ahlyscore = ahlyscore + 1;
        displayForAhly(ahlyscore);

    }
    public void winnerforahly(View view ){
        ahlyscore = ahlyscore+3;
        displayForAhly(ahlyscore);
    }
    public void loserforahly(View view){
        ahlyscore = ahlyscore+0;
        displayForAhly(ahlyscore);
    }
    public void foulforahly (View view){
        ahlyfoul = ahlyfoul+1;
        displayForFoulAhly(ahlyfoul);
    }

    public void drawforzamalek(View view) {
        zamalekscore = zamalekscore + 1;
        displayForZamalek(zamalekscore);
    }
    public void winnerforzamalek(View view ){
        zamalekscore = zamalekscore+3;
        displayForZamalek(zamalekscore);
    }
    public void loserforzamalek(View view){
        zamalekscore = zamalekscore+0;
        displayForZamalek(zamalekscore);
    }
    public void foulforzamalek (View view) {
        zamalekfoul = zamalekfoul+1;
        displayForFoulZamalek(zamalekfoul);
    }

    public void resetScore(View view) {
        ahlyscore = 0;
        zamalekscore = 0;
        ahlyfoul=0;
        zamalekfoul=0;
        displayForAhly(ahlyscore);
        displayForZamalek(zamalekscore);
        displayForFoulAhly(ahlyfoul);
        displayForFoulZamalek(zamalekfoul);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForAhly(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ahly_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForZamalek(int score) {
        TextView scoreView = (TextView) findViewById(R.id.zamalek_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForFoulAhly(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.ahly_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForFoulZamalek(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.zamalek_foul);
        scoreView.setText(String.valueOf(foul));
    }
}
