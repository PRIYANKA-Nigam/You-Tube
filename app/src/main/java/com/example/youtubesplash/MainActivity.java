package com.example.youtubesplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
public class MainActivity extends AppCompatActivity {
ImageView i;
TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        t1=(TextView)findViewById(R.id.textView3);
        t2=(TextView)findViewById(R.id.textView4);
        t3=(TextView)findViewById(R.id.textView5);
        i=(ImageView)findViewById(R.id.image);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animate);
        i.startAnimation(animation);
        final Intent intent=new Intent(this,MainActivity2.class);
        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                } }};
        timer.start(); }
}