package com.example.user.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("epe","father"));
        family.add(new Word("eta","mother"));
        family.add(new Word("angsi","son"));
        family.add(new Word("tune","daughter"));
        family.add(new Word("tacchi","older brother"));
        family.add(new Word("chalitti","yourger brother"));
        family.add(new Word("tete","older sister"));
        family.add(new Word("kolliti","younger sister"));
        family.add(new Word("ama","grandmother"));
        family.add(new Word("pappa","grandfather"));

        WordAdapter familyAdapter = new WordAdapter(this,family);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(familyAdapter);

    }
}
