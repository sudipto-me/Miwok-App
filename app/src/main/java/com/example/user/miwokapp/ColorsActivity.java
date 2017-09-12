package com.example.user.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_list);

        ArrayList<Word> colors = new ArrayList<Word>();

        colors.add(new Word("wetetti","red"));
        colors.add(new Word("chokokki","green"));
        colors.add(new Word("takakki","brown"));
        colors.add(new Word("topoppi","gray"));
        colors.add(new Word("kululli","black"));
        colors.add(new Word("kelelli","white"));
        colors.add(new Word("toplise","dusty yellow"));
        colors.add(new Word("chiwiite","mustard yellow"));


        //adding an adapter to show the view
        WordAdapter colorAdapter = new WordAdapter(ColorsActivity.this,colors);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(colorAdapter);
    }
}
