package com.example.user.miwokapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 9/11/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //check if the existing method is being used,otherwise inflate the view
        View itemView = convertView;
        if(itemView==null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.listview,parent,false);
        }

        Word word = getItem(position);

        TextView miwokView = (TextView)itemView.findViewById(R.id.miwakView);
        miwokView.setText(word.getMiwokText());
        TextView defaultView = (TextView)itemView.findViewById(R.id.englishView);
        defaultView.setText(word.getDefaultText());



        return itemView;
    }
}
