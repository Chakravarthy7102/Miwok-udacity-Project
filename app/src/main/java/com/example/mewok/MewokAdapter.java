package com.example.mewok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class MewokAdapter extends ArrayAdapter<ViewModel> {
    private ArrayList<ViewModel> viewModelArrayList;
    private ViewModel viewModel;
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    public MewokAdapter(@NonNull Context context,ArrayList<ViewModel> viewModelArrayList ) {
        super(context, 0,viewModelArrayList );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if (view==null){
            view=LayoutInflater.from(getContext()).inflate(R.layout.view_items,parent,false);
        }
        viewModel=getItem(position);

        TextView nameTextView =  view.findViewById(R.id.mewok);

        nameTextView.setText(viewModel.getMewok());

        TextView numberTextView = view.findViewById(R.id.english);

        numberTextView.setText(viewModel.getEnglish());

        ImageView iconView = view.findViewById(R.id.image);

        iconView.setImageResource(viewModel.getImageId());

        ImageView playButton=view.findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                releaseMediaPlayer();


                ViewModel model=getItem(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(getContext(),model.getAudioId());
                mediaPlayer.start();
            }
        });


        return view;
    }
    public  void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();
            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }


}




