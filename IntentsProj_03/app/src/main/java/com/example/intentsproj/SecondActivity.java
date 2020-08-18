package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView Ans;
    EditText number1,number2;
    Button add,min,mul,div;
    int number_1,number_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Ans = findViewById(R.id.textView4);
        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);

        add = findViewById(R.id.buttonAdd);
        min = findViewById(R.id.buttonMin);
        mul = findViewById(R.id.buttonMul);
        div = findViewById(R.id.buttonDiv);

        number1.setText(getIntent().getExtras().getString("Number1"));
        number2.setText(getIntent().getExtras().getString("Number2"));


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_1 = Integer.parseInt(number1.getText().toString());
                number_2 = Integer.parseInt(number2.getText().toString());

                int answer = number_1+number_2;
                Ans.setText(number_1 +" + "+ number_2 + " = " + answer);
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_1 = Integer.parseInt(number1.getText().toString());
                number_2 = Integer.parseInt(number2.getText().toString());

                int answer = number_1-number_2;
                Ans.setText(number_1 +" - "+ number_2 + " = " + answer);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_1 = Integer.parseInt(number1.getText().toString());
                number_2 = Integer.parseInt(number2.getText().toString());

                int answer = number_1*number_2;
                Ans.setText(number_1 +" * "+ number_2 + " = " + answer);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_1 = Integer.parseInt(number1.getText().toString());
                number_2 = Integer.parseInt(number2.getText().toString());

                int answer = number_1/number_2;
                Ans.setText(number_1 +" / "+ number_2 + " = " + answer);
            }
        });



    }





}