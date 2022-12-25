package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TaskDescriptionActivity extends AppCompatActivity {

    boolean secClassSelected, thirdClassSelected, fourthClassSelected, fifthClassSelected,
            sixthClassSelected, seventhClassSelected, eighthClassSelected, ninthClassSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        TextView textClass = (TextView) findViewById(R.id.textClass);

        SharedPreferences spClassSelect = getApplicationContext().getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);
        secClassSelected = spClassSelect.getBoolean("secClassSelected", false);
        thirdClassSelected = spClassSelect.getBoolean("thirdClassSelected", false);
        fourthClassSelected = spClassSelect.getBoolean("fourthClassSelected", false);
        fifthClassSelected = spClassSelect.getBoolean("fifthClassSelected", false);
        sixthClassSelected = spClassSelect.getBoolean("sixthClassSelected", false);
        seventhClassSelected = spClassSelect.getBoolean("seventhClassSelected", false);
        eighthClassSelected = spClassSelect.getBoolean("eighthClassSelected", false);
        ninthClassSelected = spClassSelect.getBoolean("ninthClassSelected", false);

        if (secClassSelected) {
            textClass.setText("2. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }
        if (thirdClassSelected) {
            textClass.setText("3. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }
        if (fourthClassSelected) {
            textClass.setText("4. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }
        if (fifthClassSelected) {
            textClass.setText("5. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }
        if (sixthClassSelected) {
            textClass.setText("6. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }
        if (seventhClassSelected) {
            textClass.setText("7. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }
        if (eighthClassSelected) {
            textClass.setText("8. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }
        if (ninthClassSelected) {
            textClass.setText("9. Osztály");
            textClass.setBackgroundResource(R.drawable.class_bg);
        }


        Button buttonSecStart = (Button) findViewById(R.id.start_button2);
        buttonSecStart.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskDescriptionActivity.this, QuestionsAddActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {

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