package com.example.ahmed.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButtonMoney (View view){

        EditText editTextAmount = (EditText) findViewById(R.id.editTextAmount);

        String amountInPounds = editTextAmount.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);

        double amountInDollarsDouble = amountInPoundsDouble * 0.63;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this,   amountInPounds +  " Maraka dodje "+ amountInDollarsString + " Dolara", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
