package net.devjavu.kursapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnKonversiClick(View v)
    {
        double dollar,rupiah;

        EditText e_dollar = (EditText) findViewById(R.id.e_dollar);
        EditText e_rupiah = (EditText) findViewById(R.id.e_rupiah);
        dollar = Double.parseDouble(e_dollar.getText().toString());
        rupiah = 14000 * dollar;
        e_rupiah.setText(Double.toString(rupiah));


    }
    public void btnRupDollar(View v)
    {
        double dollar,rupiah;

        EditText e_dollar = (EditText) findViewById(R.id.e_dollar);
        EditText e_rupiah = (EditText) findViewById(R.id.e_rupiah);
        rupiah = Double.parseDouble(e_rupiah.getText().toString());
        dollar = rupiah / 14000;
        e_dollar.setText(Double.toString(dollar));

    }
}
