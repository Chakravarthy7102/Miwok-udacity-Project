package com.example.mewok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {
    ArrayList<ViewModel> colors;
    ArrayAdapter<ViewModel> listAdapter;
    ListView colorList;
    MediaPlayer mediaPlayer;
    MewokAdapter obj;
    AudioManager audioManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        audioManager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);


        colors=new ArrayList<>();
        colors.add(new ViewModel("weṭeṭṭi","red",R.drawable.color_red,R.raw.color_red));
        colors.add(new ViewModel("chokokki","green",R.drawable.color_green,R.raw.color_green));
        colors.add(new ViewModel("ṭakaakki","brown",R.drawable.color_brown,R.raw.color_brown));
        colors.add(new ViewModel("ṭopoppi","grey",R.drawable.color_gray,R.raw.color_gray));
        colors.add(new ViewModel("kululli","black",R.drawable.color_black,R.raw.color_black));
        colors.add(new ViewModel("kelelli","white",R.drawable.color_white,R.raw.color_white));
        colors.add(new ViewModel("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colors.add(new ViewModel("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        listAdapter=new ArrayAdapter<>(this,R.layout.view_items,colors);
        colorList=findViewById(R.id.listView);
        colorList.setAdapter(new MewokAdapter(Colors.this,colors));

    }

  /*  @Override
    protected void onStop() {
        super.onStop();
        obj=new MewokAdapter(Colors.this,colors);
        obj.releaseMediaPlayer();

    }*/
}
