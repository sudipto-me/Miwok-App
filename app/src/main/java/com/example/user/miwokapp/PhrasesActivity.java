package com.example.user.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word>phrases = new ArrayList<Word>();

        phrases.add(new Word("minto wukus","Where are you going?"));
        phrases.add(new Word("tinne ayaase'ne","What is your name?"));
        phrases.add(new Word("ayaaset...","My Name is..."));
        phrases.add(new Word("mickekees?","How are you feeling?"));
        phrases.add(new Word("Kuchi achit","I am feeling good."));
        phrases.add(new Word("eenes'aa?","Are you coming?"));
        phrases.add(new Word("hee'eenem","Yes,I'm Coming"));
        phrases.add(new Word("eenem","I'm coming"));
        phrases.add(new Word("yoowutis","Let's go"));
        phrases.add(new Word("ennl'nem","Come here"));

        WordAdapter phrasesAdapter  = new WordAdapter(this,phrases);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(phrasesAdapter);
    }
}
