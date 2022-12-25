package com.example.green_math;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DivResultActivity extends AppCompatActivity {


    TextView textResult;
    TextView questionAnswered;
    TextView textClassLevelResult;
    Button buttonToFinish;
    LinearLayout backgroundScoreboard2;

    int divPoints;
    int divQuestionAnswered;

    boolean secClassSelected = false;
    boolean thirdClassSelected = false;
    boolean fourthClassSelected = false;
    boolean fifthClassSelected = false;
    boolean sixthClassSelected = false;
    boolean seventhClassSelected = false;
    boolean eighthClassSelected = false;
    boolean ninthClassSelected = false;


    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div_result);



        divPoints = getIntent().getIntExtra("DivPont", 0);
        divQuestionAnswered = getIntent().getIntExtra("DivFeladatDb", 0);
        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + divPoints);
        questionAnswered.setText("Megoldva: " + divQuestionAnswered);


        sp = getSharedPreferences("DivResults", Context.MODE_PRIVATE);


        SharedPreferences spClassSelect = getApplicationContext().getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);
        secClassSelected = spClassSelect.getBoolean("secClassSelected", false);
        thirdClassSelected = spClassSelect.getBoolean("thirdClassSelected", false);
        fourthClassSelected = spClassSelect.getBoolean("fourthClassSelected", false);
        fifthClassSelected = spClassSelect.getBoolean("fifthClassSelected", false);
        sixthClassSelected = spClassSelect.getBoolean("sixthClassSelected", false);
        seventhClassSelected = spClassSelect.getBoolean("seventhClassSelected", false);
        eighthClassSelected = spClassSelect.getBoolean("eighthClassSelected", false);
        ninthClassSelected = spClassSelect.getBoolean("ninthClassSelected", false);

        textClassLevelResult = findViewById(R.id.textClassLevelResult);
        backgroundScoreboard2 = findViewById(R.id.backgroundScoreboard2);

        int classLevelPoints;

        if (secClassSelected) {
            classLevelPoints = 6;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (thirdClassSelected) {
            classLevelPoints = 11;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fourthClassSelected) {
            classLevelPoints = 14;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fifthClassSelected) {
            classLevelPoints = 16;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (sixthClassSelected) {
            classLevelPoints = 18;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (seventhClassSelected) {
            classLevelPoints = 20;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (eighthClassSelected) {
            classLevelPoints = 21;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (ninthClassSelected) {
            classLevelPoints = 29;
            if (divPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }



        buttonToFinish = (Button) findViewById(R.id.buttonToFinish);
        buttonToFinish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("DivPoints", divPoints);
                editor.putInt("DivQuestionAnswered", divQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(DivResultActivity.this, FinishActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {

            textClassLevelResult.setText("Sikerült teljesíteni");
            textClassLevelResult.setBackgroundResource(R.drawable.submit);

            secClassSelected = false;
            thirdClassSelected = false;
            fourthClassSelected = false;
            fifthClassSelected = false;
            sixthClassSelected = false;
            seventhClassSelected = false;
            eighthClassSelected = false;
            ninthClassSelected = false;

            System.exit(0);
        }
        return super.onKeyDown(keyCode, event);
    }
}

