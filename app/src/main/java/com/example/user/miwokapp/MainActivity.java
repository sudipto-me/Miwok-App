package com.example.user.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mNumbers, mFamilyMembers, mColors, mPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialization
        mNumbers = (TextView) findViewById(R.id.tv_numbers);
        mFamilyMembers = (TextView) findViewById(R.id.tv_familymembers);
        mColors = (TextView) findViewById(R.id.tv_colors);
        mPhrases = (TextView) findViewById(R.id.tv_phrases);




        //onclick method
        mNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        mFamilyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyIntent);
            }
        });

        mColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });
        mPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesInent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesInent);
            }
        });
    }
}
