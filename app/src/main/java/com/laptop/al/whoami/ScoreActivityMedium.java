package com.laptop.al.whoami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivityMedium extends AppCompatActivity {

    private int nilai;
    private String nSebelum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_medium);

        TextView userScore = (TextView) findViewById(R.id.txt_score2);

        userScore.setText("" + getIntent().getExtras().getString("score2"));

        Button btn1 = (Button) findViewById(R.id.btn_menuscore2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getnSebelum() {
        return nSebelum;
    }

    public void setnSebelum(String nSebelum) {
        this.nSebelum = nSebelum;
    }

    public void ambilNilai(){
        setnSebelum(getIntent().getExtras().getString("score2"));
        setNilai(Integer.parseInt(getnSebelum()));
    }
}
