package com.example.mewok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    private ArrayList<ViewModel> words;
     private ArrayAdapter<ViewModel> arrayAdapter;
     private ListView phrasesView;
    MewokAdapter obj;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        words = new ArrayList<ViewModel>();
        words.add(new ViewModel("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new ViewModel("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new ViewModel("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new ViewModel("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new ViewModel("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new ViewModel("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new ViewModel("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new ViewModel("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        words.add(new ViewModel("Let’s go.", "yoowutis", R.raw.phrase_come_here));
        words.add(new ViewModel("Come here.", "әnni'nem", R.raw.rooba));
         arrayAdapter=new ArrayAdapter<>(this,R.layout.view_items,words);
          phrasesView=findViewById(R.id.listView);
          phrasesView.setAdapter(new MewokAdapter(this,words));
         
    }

  /*  @Override
    protected void onStop() {
        super.onStop();
        obj=new MewokAdapter(Phrases.this,words);
        obj.releaseMediaPlayer();

    }*/
}