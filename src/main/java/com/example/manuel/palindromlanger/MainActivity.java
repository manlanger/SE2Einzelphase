package com.example.manuel.palindromlanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bCheck = (Button) findViewById(R.id.checkButton);

        bCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputText = (EditText) findViewById(R.id.inputText);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                String inputString = inputText.getText().toString();

                if (inputString.trim().length() < 5)
                    resultText.setText("Please enter at least 5 chars!");
                else if (isPalindrome(inputString))
                    resultText.setText(inputString + " is a palindrom!");
                else
                    resultText.setText(inputString + " is not a palindrom!");
            }
        });

    }

    public	static	boolean	isPalindrome(String	str)	{
        return	str.equals(new	StringBuilder(str).reverse().toString());
    }
}