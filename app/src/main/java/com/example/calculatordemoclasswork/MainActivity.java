package com.example.calculatordemoclasswork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    double sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

    }

    public void ButtonPressed(View view){
        Button button = (Button) view;
        String buttonText = (String) button.getText();
        if (buttonText.equals("1/2"))
        {
            buttonText = "0.5";
            button1.setText("1");
            button2.setText("2");
            button3.setText("3");
        }
        else if(buttonText.equals("1/3"))
        {
            buttonText = "0.33";
            button1.setText("1");
            button2.setText("2");
            button3.setText("3");
        }
        else if(buttonText.equals("1/4"))
        {
            buttonText = "0.25";
            button1.setText("1");
            button2.setText("2");
            button3.setText("3");
        }
        double value = Double.parseDouble(buttonText);
        sum = sum + value;
        TextView textview = (TextView) findViewById(R.id.amountView);
        String toConvert = Double.toString(sum);
        textview.setText(toConvert);
    }

    public void ButtonClear(View view)
    {
        sum = 0.0;
        TextView textView = (TextView) findViewById(R.id.amountView);
        String toConvert = Double.toString(sum);
        textView.setText(toConvert);
    }

    public void ButtonOther(View view)
    {
        button1.setText("1/2");
        button2.setText("1/3");
        button3.setText("1/4");
    }


}
