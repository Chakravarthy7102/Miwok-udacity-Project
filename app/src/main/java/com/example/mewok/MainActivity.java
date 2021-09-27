package com.example.mewok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void colorsFun(View view) {
        Intent colorIntent=new Intent(MainActivity.this,Colors.class);
        startActivity(colorIntent);
    }

    public void familyFun(View view) {
        Intent familyIntent=new Intent(MainActivity.this,Family.class);
        startActivity(familyIntent);
    }

    public void numbersFun(View view) {
        Intent numbersIntent=new Intent(MainActivity.this,Numbers.class);
        startActivity(numbersIntent);
    }

    public void phrasesFun(View view) {
        Intent phrasesIntent=new Intent(MainActivity.this,Phrases.class);
        startActivity(phrasesIntent);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}