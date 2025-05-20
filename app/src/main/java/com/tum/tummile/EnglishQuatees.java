package com.tum.tummile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

//english Quatees ........
public class EnglishQuatees extends AppCompatActivity{
    Random random = new Random();
    TextView textQuot;
    Button buttonQuot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_quatees);

        textQuot = findViewById(R.id.textViewNextQuote);
        buttonQuot = findViewById(R.id.buttonNextQuote);

        buttonQuot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuote();
            }
        });

    }

    public void displayQuote(){
        // randum number between 1 to 10 (both inclusive)
        int randNum = random.nextInt ( (50+1) -1);
        String randQuote ="";

        switch ( randNum){
            case 1:
                randQuote = getString(R.string.quote1);
                break;
            case 2:
                randQuote = getString(R.string.quote2);
                break;
            case 3:
                randQuote = getString(R.string.quote3);
                break;
            case 4:
                randQuote = getString(R.string.quote4);
                break;
            case 5:
                randQuote = getString(R.string.quote5);
                break;
            case 6:
                randQuote = getString(R.string.quote6);
                break;
            case 7:
                randQuote = getString(R.string.quote7);
                break;
            case 8:
                randQuote = getString(R.string.quote8);
                break;
            case 9:
                randQuote = getString(R.string.quote9);
                break;
            case 10:
                randQuote = getString(R.string.quote10);
                break;
            case 11:
                randQuote = getString(R.string.quote11);
                break;
            case 12:
                randQuote = getString(R.string.quote12);
                break;
            case 13:
                randQuote = getString(R.string.quote13);
                break;
            case 14:
                randQuote = getString(R.string.quote14);
                break;
            case 15:
                randQuote = getString(R.string.quote15);
                break;
            case 16:
                randQuote = getString(R.string.quote16);
                break;
            case 17:
                randQuote = getString(R.string.quote17);
                break;
            case 18:
                randQuote = getString(R.string.quote18);
                break;
            case 19:
                randQuote = getString(R.string.quote19);
                break;
            case 20:
                randQuote = getString(R.string.quote20);
                break;
            case 21:
                randQuote = getString(R.string.quote21);
                break;
            case 22:
                randQuote = getString(R.string.quote22);
                break;
            case 23:
                randQuote = getString(R.string.quote23);
                break;
            case 24:
                randQuote = getString(R.string.quote24);
                break;
            case 25:
                randQuote = getString(R.string.quote25);
                break;
            case 26:
                randQuote = getString(R.string.quote26);
                break;
            case 27:
                randQuote = getString(R.string.quote27);
                break;
            case 28:
                randQuote = getString(R.string.quote28);
                break;
            case 29:
                randQuote = getString(R.string.quote29);
                break;
            case 30:
                randQuote = getString(R.string.quote30);
                break;
            case 31:
                randQuote = getString(R.string.quote31);
                break;
            case 32:
                randQuote = getString(R.string.quote32);
                break;
            case 33:
                randQuote = getString(R.string.quote33);
                break;
            case 34:
                randQuote = getString(R.string.quote34);
                break;
            case 35:
                randQuote = getString(R.string.quote35);
                break;
            case 36:
                randQuote = getString(R.string.quote36);
                break;
            case 37:
                randQuote = getString(R.string.quote37);
                break;
            case 38:
                randQuote = getString(R.string.quote38);
                break;
            case 39:
                randQuote = getString(R.string.quote39);
                break;
            case 40:
                randQuote = getString(R.string.quote40);
                break;
            case 41:
                randQuote = getString(R.string.quote41);
                break;
            case 42:
                randQuote = getString(R.string.quote42);
                break;
            case 43:
                randQuote = getString(R.string.quote43);
                break;
            case 44:
                randQuote = getString(R.string.quote44);
                break;
            case 45:
                randQuote = getString(R.string.quote45);
                break;
            case 46:
                randQuote = getString(R.string.quote46);
                break;
            case 47:
                randQuote = getString(R.string.quote47);
                break;
            case 48:
                randQuote = getString(R.string.quote48);
                break;
            case 49:
                randQuote = getString(R.string.quote49);
                break;
            case 50:
                randQuote = getString(R.string.quote50);
                break;

        }

        textQuot.setText(randQuote);

    }

}