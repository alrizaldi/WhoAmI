package com.laptop.al.whoami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hard2Activity extends AppCompatActivity {

    private int nilai;
    private String nSebelum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard2);

        Button btn1 = (Button) findViewById(R.id.btn_hard2A);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ambilNilai();
                nilaiSalah();finish();
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_hard2B);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ambilNilai();
                nilaiSalah();finish();
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn_hard2C);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ambilNilai();
                nilaiSalah();finish();
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn_hard2D);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ambilNilai();
                nilaiBenar();finish();
            }
        });
    }

    public void ambilNilai(){
        setnSebelum(getIntent().getExtras().getString("h1"));
        setNilai(Integer.parseInt(getnSebelum()));
    }

    public void nilaiSalah(){
        Intent i = new Intent(Hard2Activity.this, Hard3Activity.class);
        setNilai(getNilai()+0);
        String nilai = String.valueOf(getNilai());
        Bundle bundle = new Bundle();
        bundle.putString("h2", nilai);
        i.putExtras(bundle);
        startActivity(i);
    }

    public void nilaiBenar(){
        Intent i = new Intent(Hard2Activity.this, Hard3Activity.class);
        setNilai(getNilai()+10);
        String nilai = String.valueOf(getNilai());
        Bundle bundle = new Bundle();
        bundle.putString("h2", nilai);
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
        Toast.makeText(Hard2Activity.this, "You Must Finish This Session!", Toast.LENGTH_LONG).show();
    }
}
