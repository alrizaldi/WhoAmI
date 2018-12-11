package com.laptop.al.whoami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hard1Activity extends AppCompatActivity {

    private int nilai = 0;
    private String nSebelum = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard1);

        Button btn1 = (Button) findViewById(R.id.btn_hard1A);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSalah();finish();
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_hard1B);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSalah();finish();
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn_hard1C);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiBenar();finish();
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn_hard1D);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSalah();finish();
            }
        });
    }

    public void nilaiSalah(){
        Intent i = new Intent(Hard1Activity.this, Hard2Activity.class);
        setNilai(getNilai()+0);
        String nilai = String.valueOf(getNilai());
        Bundle bundle = new Bundle();
        bundle.putString("h1", nilai);
        i.putExtras(bundle);
        startActivity(i);
    }

    public void nilaiBenar(){
        Intent i = new Intent(Hard1Activity.this, Hard2Activity.class);
        setNilai(getNilai()+10);
        String nilai = String.valueOf(getNilai());
        Bundle bundle = new Bundle();
        bundle.putString("h1", nilai);
        i.putExtras(bundle);
        startActivity(i);
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

    @Override
    public void onBackPressed() {
        Toast.makeText(Hard1Activity.this, "You Must Finish This Session!", Toast.LENGTH_LONG).show();
    }
}
