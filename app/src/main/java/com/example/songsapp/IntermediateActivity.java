package com.example.songsapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class IntermediateActivity extends AppCompatActivity {


    TextView textView;
    YouTubePlayerView youTubePlayerView;
    String songId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermidate);

        LinearLayout mainLayout=findViewById(R.id.main);
        //loading dynamic background
        AnimationDrawable animationDrawable = (AnimationDrawable) mainLayout.getBackground();
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        //getting song id from previous activity
        songId = getIntent().getStringExtra("song_id");

        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer btnClick = MediaPlayer.create(IntermediateActivity.this, R.raw.btn_c);
                btnClick.start();
                Intent intent;
                switch (songId) {
                    case "WiyF9tv2ocs":
                        intent = new Intent(IntermediateActivity.this, HaiActivity.class);
                        startActivity(intent);
                        break;
                    case "8rhCiVirqWw":
                        intent = new Intent(IntermediateActivity.this, GoldenBoyActivity.class);
                        startActivity(intent);
                        break;
                    case "NdxOCTezeTg":
                        intent = new Intent(IntermediateActivity.this, KanNoladetyActivity.class);
                        startActivity(intent);
                        break;
                    case "IzKZGgvh7Co":
                        intent = new Intent(IntermediateActivity.this, HoraActivity.class);
                        startActivity(intent);
                        break;
                    case "mvWEwZjveWM":
                        intent = new Intent(IntermediateActivity.this, OleOleActivity.class);
                        startActivity(intent);
                        break;
                    case "-OghjORmrRY":
                        intent = new Intent(IntermediateActivity.this, AtVaAniActivity.class);
                        startActivity(intent);
                        break;
                    case "d3TFI_2G52M":
                        intent = new Intent(IntermediateActivity.this, HeiSham.class);
                        startActivity(intent);
                        break;
                    case "tl5PpPzYcAA":
                        intent = new Intent(IntermediateActivity.this, MilimActivity.class);
                        startActivity(intent);
                        break;
                    case "E4XOMgpFUX4":
                    case "iuEKUUTaY6o":
                    case "jZMZGLBvOGw":
                    case "MGAjlqg5URg":
                        intent = new Intent(IntermediateActivity.this, FinishActivity.class);
                        startActivity(intent);
                        break;
                    case "4Ij1CaPrQio":
                        intent = new Intent(IntermediateActivity.this, GanSagoorActivity.class);
                        startActivity(intent);
                        break;
                    case "iGe6olpUuqE":
                        intent = new Intent(IntermediateActivity.this, ReamimOoBrakimActivity.class);
                        startActivity(intent);
                        break;
                    case "eFbi_zc3TWQ":
                        intent = new Intent(IntermediateActivity.this, AfunaVeGezerActivity.class);
                        startActivity(intent);
                        break;
                    case "5ITUOnDoS2c":
                        intent = new Intent(IntermediateActivity.this, BubaZehavaActivity.class);
                        startActivity(intent);
                        break;
                    case "kuSUPQsfHQk":
                        intent = new Intent(IntermediateActivity.this, ShaonBenHailActivity.class);
                        startActivity(intent);
                        break;
                    case "xicFLRDaCT0":
                        intent = new Intent(IntermediateActivity.this, KahNoladHatzevaActivity.class);
                        startActivity(intent);
                        break;
                    case "LGXWvzvrXqM":
                        intent = new Intent(IntermediateActivity.this, AniNakiActivity.class);
                        startActivity(intent);
                        break;
                    case "FqtluwhNts8":
                        intent = new Intent(IntermediateActivity.this, ShabatBabokerActivity.class);
                        startActivity(intent);
                        break;
                    case "BCTKC4Zkb00":
                        intent = new Intent(IntermediateActivity.this, CarnivalBaNahalActivity.class);
                        startActivity(intent);
                        break;
                    case "Bx7oaO6hP_s":
                        intent = new Intent(IntermediateActivity.this, OlaHamanginaActivity.class);
                        startActivity(intent);
                        break;
                    case "5CjPisRG5aE":
                        intent = new Intent(IntermediateActivity.this, BoETElHagalilActivity.class);
                        startActivity(intent);
                        break;
                    case "sa4PK30AxjI":
                        intent = new Intent(IntermediateActivity.this, RakBeIsraelActivity.class);
                        startActivity(intent);
                        break;
                    case "H19LanB-eEg":
                        intent = new Intent(IntermediateActivity.this, PrahimBaKaneActivity.class);
                        startActivity(intent);
                        break;
                    case "EwvAywMw93M":
                        intent = new Intent(IntermediateActivity.this, ShutiShutiActivity.class);
                        startActivity(intent);
                        break;
                    case "34YPRRcHOwo":
                        intent = new Intent(IntermediateActivity.this, HasakeActivity.class);
                        startActivity(intent);
                        break;
                    case "8TlXK9zk22I":
                        intent = new Intent(IntermediateActivity.this, TahtonimVeGoofiotActivity.class);
                        startActivity(intent);
                        break;
                    case "hSfvAKQUOzM":
                        intent = new Intent(IntermediateActivity.this, SigaliotActivity.class);
                        startActivity(intent);
                        break;
                    case "mHndiWsfc2U":
                        intent = new Intent(IntermediateActivity.this, HazmanaLeHatunaActivity.class);
                        startActivity(intent);
                        break;
                    case "WsX-bejS6EU":
                        intent = new Intent(IntermediateActivity.this, ZeKolHakesemActivity.class);
                        startActivity(intent);
                        break;
                    case "Y6DvHs4g8yc":
                        intent = new Intent(IntermediateActivity.this, ShirAhavaIndianiActivity.class);
                        startActivity(intent);
                        break;
                    case "QdWLvKHV9bY":
                        intent = new Intent(IntermediateActivity.this, MemaamakimActivity.class);
                        startActivity(intent);
                        break;
                    case "kmW2yAYhMmM":
                        intent = new Intent(IntermediateActivity.this, AturMitshehActivity.class);
                        startActivity(intent);
                        break;
                    case "wcayUsa9yvw":
                        intent = new Intent(IntermediateActivity.this, MatokKshemarliActivity.class);
                        startActivity(intent);
                        break;
                    case "IZkYWP0esrI":
                        intent = new Intent(IntermediateActivity.this, HaimSheliActivity.class);
                        startActivity(intent);
                        break;







                }
                finish();
            }
        });

        youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView.addYouTubePlayerListener(new YouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
//                youTubePlayer.cueVideo(songId, 0);
                youTubePlayer.loadVideo(songId, 0);
            }

            @Override
            public void onStateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlayerState playerState) {

            }

            @Override
            public void onPlaybackQualityChange(YouTubePlayer youTubePlayer, PlayerConstants.PlaybackQuality playbackQuality) {

            }

            @Override
            public void onPlaybackRateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlaybackRate playbackRate) {

            }

            @Override
            public void onError(YouTubePlayer youTubePlayer, PlayerConstants.PlayerError playerError) {
                textView = findViewById(R.id.error);
                textView.setVisibility(View.VISIBLE);
                youTubePlayerView.setVisibility(View.GONE);
            }

            @Override
            public void onCurrentSecond(YouTubePlayer youTubePlayer, float v) {

            }

            @Override
            public void onVideoDuration(YouTubePlayer youTubePlayer, float v) {

            }

            @Override
            public void onVideoLoadedFraction(YouTubePlayer youTubePlayer, float v) {

            }

            @Override
            public void onVideoId(YouTubePlayer youTubePlayer, String s) {

            }

            @Override
            public void onApiChange(YouTubePlayer youTubePlayer) {

            }
        });

    }
}
