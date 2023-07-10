package com.udemycourse.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1a, btn2a, btn3a, btn1b, btn2b, btn3b, btn1c, btn2c, btn3c;
    TextView turnTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1a = findViewById(R.id.button1a);
        btn2a = findViewById(R.id.button2a);
        btn3a = findViewById(R.id.button3a);

        btn1b = findViewById(R.id.button1b);
        btn2b = findViewById(R.id.button2b);
        btn3b = findViewById(R.id.button3b);

        btn1c = findViewById(R.id.button1c);
        btn2c = findViewById(R.id.button2c);
        btn3c = findViewById(R.id.button3c);

        turnTV = findViewById(R.id.turnTextView);

       final boolean[] turn = {true}; // true = X, false = Y


        btn1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn1a.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn1a.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
                isGG();
            }
        });
        btn2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn2a.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn2a.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });
        btn3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn3a.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn3a.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });



        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn1b.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn1b.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });
        btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn2b.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn2b.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });
        btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn3b.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn3b.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });



        btn1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn1c.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn1c.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });
        btn2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn2c.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn2c.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });
        btn3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turn[0]){
                    btn3c.setText("X");
                    turnTV.setText("Turn ◯");
                    turn[0] = false;
                } else{
                    btn3c.setText("◯");
                    turnTV.setText("Turn X");
                    turn[0] = true;
                }
            }
        });
    }


    public boolean isGG(){

        if(btn1a.getText() == "X"){ // win

            return true;
        }
        return false;
    };

}