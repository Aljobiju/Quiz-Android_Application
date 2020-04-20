package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private questions mQuestionLibrary= new questions();
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button next;

    private String mAnswer;
    private  int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionView = (TextView)findViewById(R.id.qs);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        next=(Button)findViewById(R.id.next);

        mButtonChoice1.setOnClickListener(new Button.OnClickListener() {
            public void  onClick(View v) {
                //updateQuestion(v);
                if (((Button)v).getText()== mAnswer) {
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    mButtonChoice1.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                }else{
                    mButtonChoice1.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(MainActivity.this,"WRONG ANSWER",Toast.LENGTH_SHORT).show();}
                if (mButtonChoice2.getText()==mAnswer){
                    mButtonChoice2.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                }if (mButtonChoice3.getText()==mAnswer){
                    mButtonChoice3.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                }if (mButtonChoice4.getText()==mAnswer){
                    mButtonChoice4.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                }

            }

        });
        mButtonChoice2.setOnClickListener(new Button.OnClickListener() {
            public void  onClick(View v) {
                //updateQuestion(v);
                if (((Button)v).getText()== mAnswer) {
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    mButtonChoice2.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                }else{
                    mButtonChoice2.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(MainActivity.this,"WRONG ANSWER",Toast.LENGTH_SHORT).show();
                    if (mButtonChoice1.getText()==mAnswer){
                        mButtonChoice1.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }if (mButtonChoice3.getText()==mAnswer){
                        mButtonChoice3.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }if (mButtonChoice4.getText()==mAnswer){
                        mButtonChoice4.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }
                }


            }
        });
        mButtonChoice3.setOnClickListener(new Button.OnClickListener() {
            public void  onClick(View v) {
                //updateQuestion(v);
                if (((Button)v).getText()== mAnswer) {
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    mButtonChoice3.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                }else{
                    mButtonChoice3.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(MainActivity.this,"WRONG ANSWER",Toast.LENGTH_SHORT).show();
                    if (mButtonChoice1.getText()==mAnswer){
                        mButtonChoice1.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }if (mButtonChoice2.getText()==mAnswer){
                        mButtonChoice2.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }if (mButtonChoice4.getText()==mAnswer){
                        mButtonChoice4.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }
                }


            }
        });
        mButtonChoice4.setOnClickListener(new Button.OnClickListener() {
            public void  onClick(View v) {
                //updateQuestion(v);
                if (((Button)v).getText()== mAnswer) {
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    mButtonChoice4.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                }else{
                    mButtonChoice4.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(MainActivity.this,"WRONG ANSWER",Toast.LENGTH_SHORT).show();
                    if (mButtonChoice1.getText()==mAnswer){
                        mButtonChoice1.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }if (mButtonChoice2.getText()==mAnswer){
                        mButtonChoice2.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }if (mButtonChoice3.getText()==mAnswer){
                        mButtonChoice3.getBackground().setColorFilter(0xffa4c639, PorterDuff.Mode.MULTIPLY);
                    }
                }

            }
        });
        next.setOnClickListener(new Button.OnClickListener() {
            public void  onClick(View v) {
                updateQuestion(v);
                mButtonChoice1.getBackground().clearColorFilter();
                mButtonChoice2.getBackground().clearColorFilter();
                mButtonChoice3.getBackground().clearColorFilter();
                mButtonChoice4.getBackground().clearColorFilter();
            }
        });
        mQuestionView.setText(mQuestionLibrary.getquestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getchoice(mQuestionNumber,1));
        mButtonChoice2.setText(mQuestionLibrary.getchoice(mQuestionNumber,2));
        mButtonChoice3.setText(mQuestionLibrary.getchoice(mQuestionNumber,3));
        mButtonChoice4.setText(mQuestionLibrary.getchoice(mQuestionNumber,4));
        mAnswer = mQuestionLibrary.getCorrectAnswers(mQuestionNumber);
        mQuestionNumber++;
    }

    private void updateQuestion(View view) {
        if (mQuestionNumber<mQuestionLibrary.getLength() ) {
            mQuestionView.setText(mQuestionLibrary.getquestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getchoice(mQuestionNumber,1));
            mButtonChoice2.setText(mQuestionLibrary.getchoice(mQuestionNumber,2));
            mButtonChoice3.setText(mQuestionLibrary.getchoice(mQuestionNumber,3));
            mButtonChoice4.setText(mQuestionLibrary.getchoice(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswers(mQuestionNumber);
            mQuestionNumber++;
        }
        else
            Toast.makeText(MainActivity.this,"It was the last Question!",Toast.LENGTH_SHORT).show();



    }
}





