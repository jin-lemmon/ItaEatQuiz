package com.example.android.itaeatquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculatePoint() {
        points = 0;
        EditText quiz1 = findViewById(R.id.answer1);
        RadioButton quiz2b = findViewById(R.id.answer2b);
        RadioButton quiz3a = findViewById(R.id.answer3a);
        CheckBox quiz4b = findViewById(R.id.answer4b);
        CheckBox quiz4c = findViewById(R.id.answer4c);
        RadioButton quiz5c = findViewById(R.id.answer5c);
        String question1 = quiz1.getText().toString();
        boolean question2 = quiz2b.isChecked();
        boolean question3 = quiz3a.isChecked();
        boolean question4c = quiz4c.isChecked();
        boolean question4b = quiz4b.isChecked();
        boolean question5 = quiz5c.isChecked();
        if (question1.equals("pasta")) {
            points += 1;
        }
        if (question1.equals("Pasta")) {
            points += 1;
        }
        if (question1.equals("pasta ")) {
            points += 1;
        }
        if (question1.equals("Pasta ")) {
            points += 1;
        }
        if (question1.equals("PASTA ")) {
            points += 1;
        }
        if (question1.equals("PASTA")) {
            points += 1;
        }
        if (question2) {
            points += 1;
        }
        if (question3) {
            points += 1;
        }
        if (question4b) {
            if (question4c) {
                points += 1;
            }
        }
        if (question5) {
            points += 1;
        }

    }

    public void submit(View view) {
        calculatePoint();
        showPoints(points);

    }

    public void showPoints(int points) {
        if (points == 0) {
            Toast.makeText(this, points + "/5"+getText(R.string.zero), Toast.LENGTH_SHORT).show();
        } else if(points <= 2) {
            Toast.makeText(this, points + "/5"+getText(R.string.bad), Toast.LENGTH_SHORT).show();
        } else if (points <= 4) {
            Toast.makeText(this, points + "/5"+getText(R.string.medium), Toast.LENGTH_SHORT).show();
        } else if (points <= 5) {
            Toast.makeText(this, points + "/5"+getText(R.string.good), Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view) {
        RadioGroup quiz2 = findViewById(R.id.quiz2);
        EditText quiz1 = findViewById(R.id.answer1);
        RadioGroup quiz3 = findViewById(R.id.quiz3);
        CheckBox quiz4a = findViewById(R.id.answer4a);
        CheckBox quiz4b = findViewById(R.id.answer4b);
        CheckBox quiz4c = findViewById(R.id.answer4c);
        CheckBox quiz4d = findViewById(R.id.answer4d);
        CheckBox quiz4e = findViewById(R.id.answer4e);
        RadioGroup quiz5 = findViewById(R.id.quiz5);
        quiz1.setText("");
        quiz2.clearCheck();
        quiz3.clearCheck();
        if (quiz4a.isChecked()) {
            quiz4a.setChecked(false);
        }
        if (quiz4b.isChecked()) {
            quiz4b.setChecked(false);
        }
        if (quiz4c.isChecked()) {
            quiz4c.setChecked(false);
        }
        if (quiz4d.isChecked()) {
            quiz4d.setChecked(false);
        }
        if (quiz4e.isChecked()) {
            quiz4e.setChecked(false);
        }
        quiz5.clearCheck();
        points = 0;
    }
}
