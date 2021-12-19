package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String[] arrayOfTracks;
    Uri uri;
    int trackNumber ;

    public void method(View view) {
//        trackNumber = Integer.parseInt(view.getTag().toString())- 1;
//
//        uri = Uri.parse(arrayOfTracks[trackNumber]);
//
//        MediaPlayer mplayer = MediaPlayer.create(this,uri);
//        mplayer.start();

        //get Id ( long integer ) of Image View that was clicked
        int id = view.getId();

        //get name of Image View that was clicked
        String viewName = "";

        viewName = view.getResources().getResourceEntryName(id);

        //get Id ( long integer ) of music track which has the same name as Image view that was clicked

        int trackId = getResources().getIdentifier(viewName , "raw" , getPackageName());

        //play track

        MediaPlayer mplayer = MediaPlayer.create(this, trackId);
        mplayer.start();
        




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        arrayOfTracks = new String[8];
//        arrayOfTracks[0]="android.resource://" + this.getPackageName() + "/" + R.raw.doyouspeakenglish;
//        arrayOfTracks[1]="android.resource://" + this.getPackageName() + "/" + R.raw.goodevening;
//        arrayOfTracks[2]="android.resource://" + this.getPackageName() + "/" + R.raw.hello;
//        arrayOfTracks[3]="android.resource://" + this.getPackageName() + "/" + R.raw.howareyou;
//        arrayOfTracks[4]="android.resource://" + this.getPackageName() + "/" + R.raw.ilivein;
//        arrayOfTracks[5]="android.resource://" + this.getPackageName() + "/" + R.raw.mynameis;
//        arrayOfTracks[6]="android.resource://" + this.getPackageName() + "/" + R.raw.please;
//        arrayOfTracks[7]="android.resource://" + this.getPackageName() + "/" + R.raw.welcome;

    }
}
