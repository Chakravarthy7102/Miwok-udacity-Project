package com.example.mewok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

   private ArrayList<ViewModel> numbersArrayList;
   private ArrayAdapter<ViewModel> arrayAdapter;
   private ListView numbersList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);



        numbersArrayList=new ArrayList<>();
        numbersArrayList.add(new ViewModel("one", "lutti", R.drawable.number_one, R.raw.number_one));
        numbersArrayList.add(new ViewModel("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        numbersArrayList.add(new ViewModel("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        numbersArrayList.add(new ViewModel("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        numbersArrayList.add(new ViewModel("five", "massokka", R.drawable.number_five, R.raw.number_five));
        numbersArrayList.add(new ViewModel("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        numbersArrayList.add(new ViewModel("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numbersArrayList.add(new ViewModel("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        numbersArrayList.add(new ViewModel("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        numbersArrayList.add(new ViewModel("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));
           arrayAdapter=new ArrayAdapter<>(this,R.layout.view_items,numbersArrayList);
           numbersList=findViewById(R.id.listView);
           numbersList.setAdapter(new MewokAdapter(this,numbersArrayList));


    }
}