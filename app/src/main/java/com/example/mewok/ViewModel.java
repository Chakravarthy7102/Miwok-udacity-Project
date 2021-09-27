package com.example.mewok;

import android.media.Image;

public class ViewModel {
    @Override
    public String toString() {
        return "ColorsModel{" +
                "mewok='" + mewok + '\'' +
                ", english='" + english + '\'' +
                ", imageId=" + imageId +
                ", audioId=" + audioId +
                '}';
    }

    private String mewok;
   private String english;
   private int imageId;
   private int audioId;

    public ViewModel(String mewok, String english, int imageId, int audioId) {
        this.mewok = mewok;
        this.english = english;
        this.imageId = imageId;
        this.audioId = audioId;
    }

    public ViewModel(String mewok, String english, int audioId) {
        this.mewok = mewok;
        this.english = english;
        this.imageId=imageId;
        this.audioId=audioId;
    }

    public String getMewok() {
        return mewok;
    }

    public void setMewok(String mewok) {
        this.mewok = mewok;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getAudioId() {
        return audioId;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }
}
