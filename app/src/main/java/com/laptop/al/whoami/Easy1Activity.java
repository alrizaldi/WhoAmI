package com.laptop.al.whoami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class Easy1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy1);

        Button btn1 = (Button) findViewById(R.id.btn_easy1A);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NilaiSalah();finish();
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_easy1B);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NilaiSalah();finish();
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn_easy1C);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NilaiBenar();finish();
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn_easy1D);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NilaiSalah();finish();
            }
        });
    }

    public void NilaiSalah(){
        Intent i = new Intent(Easy1Activity.this, Easy2Activity.class);
        int aaa = 0;
        String nilai = String.valueOf(aaa);
        Bundle bundle = new Bundle();
        bundle.putString("e1", nilai);
        i.putExtras(bundle);
        startActivity(i);
    }

    public void NilaiBenar(){
        Intent i = new Intent(Easy1Activity.this, Easy2Activity.class);
        int aaa = 10;
        String nilai = String.valueOf(aaa);
        Bundle bundle = new Bundle();
        bundle.putString("e1", nilai);
        i.putExtras(bundle);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(Easy1Activity.this, "You Must Finish This Session!", Toast.LENGTH_LONG).show();
    }
}
