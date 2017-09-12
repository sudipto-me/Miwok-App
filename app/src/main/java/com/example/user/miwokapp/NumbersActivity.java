package com.example.user.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //array of words which are number

       ArrayList<Word>words = new ArrayList<Word>();

        words.add(new Word("lutti","one"));
        words.add(new Word("ottiko","two"));
        words.add(new Word("tolookosu","three"));
        words.add(new Word("oyyisa","four"));
        words.add(new Word("massokka","five"));
        words.add(new Word("temmokka","six"));
        words.add(new Word("kenekaku","seven"));
        words.add(new Word("kawinta","eight"));
        words.add(new Word("wo'e","nine"));
        words.add(new Word("na'aacha","ten"));

        //applying a listview with default style and arrayadapter in the list
       WordAdapter listAdapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(listAdapter);


    }
}
