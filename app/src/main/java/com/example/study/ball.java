package com.example.study;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ball extends AppCompatActivity{
    TextView score1;
    TextView score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1 = findViewById(R.id.score);
        score2 = findViewById(R.id.score2);
    }

    public void btnAdd1(View btn) {
        if (btn.getId() == R.id.btn_1) {
            showScore(1);
        }else{
            showScore2(1);
        }
    }

    public void btnAdd2(View btn) {
        if (btn.getId() == R.id.btn_2) {
            showScore(2);
        } else {
            showScore2(2);
        }
    }

    public void btnAdd3(View btn) {
        if (btn.getId() == R.id.btn_3) {
            showScore(3);
        } else {
            showScore2(3);
        }
    }

    private void showScore(int inc){
        Log.i("show","inc=" + inc);
        String oldScore = (String)score1.getText();
        int newScore = Integer.parseInt(oldScore) + inc;
        score1.setText("" + newScore);
    }

    private void showScore2(int inc){
        Log.i("show","inc=" + inc);
        String oldScore = (String)score1.getText();
        int newScore = Integer.parseInt(oldScore) + inc;
        score1.setText("" + newScore);
    }
    public void btnReset(View btn) {
        score1.setText("0");
        score2.setText("0");
    }
}
