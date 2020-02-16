package com.example.kalkulatortrigonometri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.InputDevice;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLInput;


public class MainActivity extends AppCompatActivity {
private Button btnSin,btnCos,btnTan,btnCsc,btnSec,btnCot,btnLog;
private TextView tvHasil;
private EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.input);
        btnSin = findViewById(R.id.btn_sin);
        btnCos = findViewById(R.id.btn_cos);
        btnTan = findViewById(R.id.btn_tan);
        btnCsc = findViewById(R.id.btn_csc);
        btnSec = findViewById(R.id.btn_sec);
        btnCot = findViewById(R.id.btn_cot);
        btnLog = findViewById(R.id.btn_log);
        tvHasil = findViewById(R.id.hasil);

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = etInput.getText().toString();

                    double Sin = Double.parseDouble(sInput);

                    double hasil = Math.sin(Sin);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);}
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = etInput.getText().toString();

                    double Cos = Double.parseDouble(sInput);

                    double hasil = Math.cos(Cos);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);}
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sTan = etInput.getText().toString();

                    double Tan = Double.parseDouble(sTan);

                    double hasil = Math.tan(Tan);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);}
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCsc = etInput.getText().toString();

                    double Csc = Double.parseDouble(sCsc);

                    double hasil = 1.0/Math.sin(Csc);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);}
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSec = etInput.getText().toString();

                    double Sec = Double.parseDouble(sSec);

                    double hasil = 1.0/Math.cos(Sec);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);}
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCot = etInput.getText().toString();

                    double Cot = Double.parseDouble(sCot);

                    double hasil = 1.0/Math.tan(Cot);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);}
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sLog = etInput.getText().toString();

                    double Log = Double.parseDouble(sLog);

                    double hasil = Math.log10(Log);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);}
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
