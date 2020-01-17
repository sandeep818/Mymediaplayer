package com.jungle.mymediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private VideoView myVideoView;
   public Button  myplayButton;
   private  Button audioButton;
   private MediaController mediaController;
   private  MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myVideoView=findViewById(R.id.playVideoView);
        myplayButton=findViewById(R.id.playvideo);
        audioButton = findViewById(R.id.audiobutton);


        //MediaController
        mediaController = new MediaController(this);



// Init Video



        myplayButton.setOnClickListener(this);
        audioButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.audiobutton:
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this,R.raw.sasas);
            mediaPlayer.start();

            break;
        case R.id.playvideo:
            Toast.makeText(this, R.id.playvideo+"    "+R.id.audiobutton, Toast.LENGTH_SHORT).show();
            Uri videoUri=Uri.parse("android.resource://" + this.getApplicationContext().getPackageName() + "/" + R.raw.videoo);
            myVideoView.setVideoURI(videoUri);
            myVideoView.setMediaController(mediaController);
            mediaController.setAnchorView(myVideoView);
            myVideoView.setZOrderOnTop(true);
            myVideoView.start();
            break;
    }
//







    }
    public void audio_Play(View v){
        Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        mediaPlayer = MediaPlayer.create(this,R.raw.sasas);
        mediaPlayer.start();
    }
}
