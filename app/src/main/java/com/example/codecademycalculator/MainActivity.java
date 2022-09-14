package com.example.codecademycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumber = findViewById(R.id.number1);
        EditText secondNumber = findViewById(R.id.number2);

        RadioGroup operators = findViewById(R.id.operators);
        RadioButton add = findViewById(R.id.addition);
        RadioButton minus = findViewById(R.id.subtraction);
        RadioButton multiply = findViewById(R.id.multiplication);
        RadioButton divide = findViewById(R.id.division);

        Button equals = findViewById(R.id.equals);
        TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());

                int operatorButtonId = operators.getCheckedRadioButtonId();

                Integer answer = null;

                if (operatorButtonId == add.getId()){
                    answer = firstNumberValue + secondNumberValue;
                } else if(operatorButtonId == minus.getId()){
                    answer = firstNumberValue - secondNumberValue;
                } else if(operatorButtonId == multiply.getId()){
                answer = firstNumberValue * secondNumberValue;
                } else if(operatorButtonId == divide.getId()) {
                    answer = firstNumberValue / secondNumberValue;
                }
                result.setText(answer.toString());
        }

    });
}
}