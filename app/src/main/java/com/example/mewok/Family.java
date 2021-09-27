package com.example.mewok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    ArrayList<ViewModel> familyModelArrayList;
    ArrayAdapter<ViewModel> familyAdapter;
    ListView familyListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        familyModelArrayList=new ArrayList<>();
        familyModelArrayList.add(new ViewModel("әpә","Father",R.drawable.family_father,R.raw.family_father));
        familyModelArrayList.add(new ViewModel("әṭa","Mother",R.drawable.family_mother,R.raw.family_mother));
        familyModelArrayList.add(new ViewModel("angsi","Son",R.drawable.family_son,R.raw.family_son));
        familyModelArrayList.add(new ViewModel("tune","Daughter",R.drawable.family_daughter,R.raw.family_daughter));
        familyModelArrayList.add(new ViewModel("taachi","older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        familyModelArrayList.add(new ViewModel("chalitti","Younger Brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        familyModelArrayList.add(new ViewModel("teṭe","older Sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        familyModelArrayList.add(new ViewModel("kolliti","Younger Sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        familyModelArrayList.add(new ViewModel("ama","Grand Mother",R.drawable.family_grandmother,R.raw.family_grandmother));
        familyModelArrayList.add(new ViewModel("paapa","Grand Father",R.drawable.family_grandfather,R.raw.family_grandfather));

        familyAdapter=new ArrayAdapter<>(this,R.layout.view_items,familyModelArrayList);
        familyListView=findViewById(R.id.listView);
        familyListView.setAdapter(new MewokAdapter(Family.this,familyModelArrayList));

    }

}
