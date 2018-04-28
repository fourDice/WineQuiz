package com.example.android.winequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    int score = 0;

public int calculateScore(View view) {

//finding all the possible answers
    CheckBox Q1A1 = findViewById( R.id.Q1A1 );
    CheckBox Q1A2 = findViewById( R.id.Q1A2 );
    CheckBox Q1A3 = findViewById( R.id.Q1A3 );
    CheckBox Q1A4 = findViewById( R.id.Q1A4 );
    RadioButton Q2A1 = findViewById( R.id.Q2A1 );
    RadioButton Q2A2 = findViewById( R.id.Q2A2 );
    RadioButton Q2A3 = findViewById( R.id.Q2A3 );
    RadioButton Q2A4 = findViewById( R.id.Q2A4 );
    RadioButton Q3A1 = findViewById( R.id.Q3A1 );
    RadioButton Q3A2 = findViewById( R.id.Q3A2 );
    RadioButton Q3A3 = findViewById( R.id.Q3A3 );
    RadioButton Q3A4 = findViewById( R.id.Q3A4 );
    CheckBox Q4A1 = findViewById( R.id.Q4A1 );
    CheckBox Q4A2 = findViewById( R.id.Q4A2 );
    CheckBox Q4A3 = findViewById( R.id.Q4A3 );
    CheckBox Q4A4 = findViewById( R.id.Q4A4 );

    // assigning points positive or negative based on answers

    if (Q1A1.isChecked()) {
        score = score + 10;
    }

    if (Q1A2.isChecked()) {
        score = score - 10;
    }

    if (Q1A3.isChecked()) {
        score = score - 10;
    }

    if (Q1A4.isChecked()) {
        score = score + 10;
    }

    if (Q2A1.isChecked()) {
        score = score - 10;
    }

    if (Q2A2.isChecked()) {
        score = score - 10;
    }

    if (Q2A3.isChecked()) {
        score = score + 20;
    }

    if (Q2A4.isChecked()) {
        score = score - 10;
    }

    if (Q3A1.isChecked()) {
        score = score - 10;
    }

    if (Q3A2.isChecked()) {
        score = score - 10;
    }

    if (Q3A3.isChecked()) {
        score = score - 10;
    }

    if (Q3A4.isChecked()) {
        score = score + 20;
    }

    if (Q4A1.isChecked()) {
        score = score + 5;
    }

    if (Q4A2.isChecked()) {
        score = score + 5;
    }

    if (Q4A3.isChecked()) {
        score = score + 5;
    }

    if (Q4A4.isChecked()) {
        score = score + 5;
    }

    return score = score;
    }

    public void submitScore(View View) {

        score = calculateScore();

        EditText nameField = (EditText) findViewById( R.id.name_field );
        String name = nameField.getText().toString();

        String scoreMessage = createScoreSummary( name, score );

        displayMessage( scoreMessage );
    }

    private int calculateScore() {
        return score;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById( R.id.score_summary_text_view );
        orderSummaryTextView.setText( message );
    }

    private String createScoreSummary(String name, int score) {
        String scoreMessage = "Name: " + name;
        scoreMessage = scoreMessage + "\nScore: " + this.score;
        return scoreMessage;
    }

    public void onRadioButtonClicked(View view) {
        // Is the button checked
        boolean checked = ((RadioButton) view).isChecked();
    }
}