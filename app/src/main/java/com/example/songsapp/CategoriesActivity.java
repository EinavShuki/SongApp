package com.example.songsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class CategoriesActivity extends Activity {
    Intent intent;
    SharedPreferences points;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        LinearLayout mainLayout = findViewById(R.id.main);
        //loading dynamic background

        AnimationDrawable animationDrawable = (AnimationDrawable) mainLayout.getBackground();
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        Button eurovision=findViewById(R.id.euro);
        Button kids=findViewById(R.id.kids);
        Button love=findViewById(R.id.love);
        Button rock=findViewById(R.id.rock);
        Button pop=findViewById(R.id.pop);
        Button military=findViewById(R.id.military);

        eurovision.setOnClickListener(v -> {
            setBtnClick();
            intent=new Intent(CategoriesActivity.this,EurovisionHomeActivity.class);
            startActivity(intent);
        });

        kids.setOnClickListener(v -> {
            setBtnClick();
            intent=new Intent(CategoriesActivity.this,KidsHomeActivity.class);
            startActivity(intent);

        });
        military.setOnClickListener(v -> {
            setBtnClick();
            intent=new Intent(CategoriesActivity.this,MilitaryBandHomeActivity.class);
            startActivity(intent);

        });
        love.setOnClickListener(v -> {
            setBtnClick();
            intent=new Intent(CategoriesActivity.this,LoveHomeActivity.class);
            startActivity(intent);
        });

        points = getSharedPreferences("points", MODE_PRIVATE);

    }
    private void setBtnClick() {
        MediaPlayer btnClick = MediaPlayer.create(CategoriesActivity.this, R.raw.btn_c);
        btnClick.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        if(!points.contains("point")) {
            SharedPreferences.Editor editor = points.edit();
            editor.putInt("point",100);
            editor.apply();
//            Toast.makeText(this, "points="+points.getInt("point",0), Toast.LENGTH_SHORT).show();
        }
    }
}
