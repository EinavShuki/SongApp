package com.example.songsapp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.Nullable;

public class FinishActivity extends Activity {

    ImageView f1,f2,f3,f4,f5;
    ObjectAnimator animator5A, animator5B, animator1A, animator1B, animator2A, animator2B, animator3A, animator3B, animator4A, animator4B;
    AnimatorSet set1,set2,set3,set4,set5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);

        init();

        LinearLayout mainLayout = findViewById(R.id.main);
        //loading dynamic background

        AnimationDrawable animationDrawable = (AnimationDrawable) mainLayout.getBackground();
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        MediaPlayer applause=MediaPlayer.create(this, R.raw.applause);
        applause.start();
        Button backBtn=findViewById(R.id.back_home);
        backBtn.setOnClickListener(v->{
            MediaPlayer btnClick = MediaPlayer.create(FinishActivity.this, R.raw.btn_c);
            btnClick.start();
            Intent intent=new Intent(FinishActivity.this,CategoriesActivity.class);
            applause.stop();
            startActivity(intent);
            finish();
        });
        animations();
    }
    private void animations()
    {
        animator5A = ObjectAnimator.ofFloat(f5, "scaleY", 2).setDuration(2500);
        animator5A.setRepeatMode(ValueAnimator.RESTART);
        animator5A.setRepeatCount(4);
        animator5B = ObjectAnimator.ofFloat(f5, "scaleX", 2).setDuration(2500);
        animator5B.setRepeatMode(ValueAnimator.RESTART);
        animator5B.setRepeatCount(4);
        set5 = new AnimatorSet();
        set5.playTogether(animator5A, animator5B);
        set5.start();

        animator1A = ObjectAnimator.ofFloat(f1, "scaleY", 2).setDuration(2000);
        animator1A.setRepeatMode(ValueAnimator.RESTART);
        animator1A.setRepeatCount(4);
        animator1B = ObjectAnimator.ofFloat(f1, "scaleX", 2).setDuration(2000);
        animator1B.setRepeatMode(ValueAnimator.RESTART);
        animator1B.setRepeatCount(4);
        set1 = new AnimatorSet();
        set1.playTogether(animator1A, animator1B);
        set1.start();

        animator2A = ObjectAnimator.ofFloat(f2, "scaleY", 2).setDuration(1100);
        animator2A.setRepeatMode(ValueAnimator.RESTART);
        animator2A.setRepeatCount(4);
        animator2B = ObjectAnimator.ofFloat(f2, "scaleX", 2).setDuration(1100);
        animator2B.setRepeatMode(ValueAnimator.RESTART);
        animator2B.setRepeatCount(4);
        set2 = new AnimatorSet();
        set2.playTogether(animator2A, animator2B);
        set2.start();

        animator3A = ObjectAnimator.ofFloat(f3, "scaleY", 2).setDuration(1700);
        animator3A.setRepeatMode(ValueAnimator.RESTART);
        animator3A.setRepeatCount(4);
        animator3B = ObjectAnimator.ofFloat(f3, "scaleX", 2).setDuration(1700);
        animator3B.setRepeatMode(ValueAnimator.RESTART);
        animator3B.setRepeatCount(4);
        set3 = new AnimatorSet();
        set3.playTogether(animator3A, animator3B);
        set3.start();

        animator4A = ObjectAnimator.ofFloat(f4, "scaleY", 2).setDuration(2100);
        animator4A.setRepeatMode(ValueAnimator.RESTART);
        animator4A.setRepeatCount(4);
        animator4B = ObjectAnimator.ofFloat(f4, "scaleX", 2).setDuration(2100);
        animator4B.setRepeatMode(ValueAnimator.RESTART);
        animator4B.setRepeatCount(4);
        set4 = new AnimatorSet();
        set4.playTogether(animator4A, animator4B);
        set4.start();

    }

    private void init() {
        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);
    }
}
