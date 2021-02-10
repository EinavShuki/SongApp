package com.example.songsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class EurovisionHomeActivity extends Activity implements View.OnClickListener {
    final int L2 = 2, L3 = 3, L4 = 4, L5 = 5, L6 = 6, L7 = 7, L8 = 8, L1 = 1;
    Button lev1, lev2, lev3, lev4, lev5, lev6, lev7, lev8, lev9;
    SharedPreferences sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eurovision_home);

        lev1 = findViewById(R.id.lev1);
        lev2 = findViewById(R.id.lev2);
        lev3 = findViewById(R.id.lev3);
        lev4 = findViewById(R.id.lev4);
        lev5 = findViewById(R.id.lev5);
        lev6 = findViewById(R.id.lev6);
        lev7 = findViewById(R.id.lev7);
        lev8 = findViewById(R.id.lev8);
        lev9 = findViewById(R.id.lev9);

        lev1.setOnClickListener(this);
        lev2.setOnClickListener(this);
        lev3.setOnClickListener(this);
        lev4.setOnClickListener(this);
        lev5.setOnClickListener(this);
        lev6.setOnClickListener(this);
        lev7.setOnClickListener(this);
        lev8.setOnClickListener(this);
        lev9.setOnClickListener(this);

        sp = getSharedPreferences("to_be_enabled_euro", MODE_PRIVATE);
        if (sp.contains("l2_ready"))
            lev2.setEnabled(true);
        if (sp.contains("l3_ready"))
            lev3.setEnabled(true);
        if (sp.contains("l4_ready"))
            lev4.setEnabled(true);
        if (sp.contains("l5_ready"))
            lev5.setEnabled(true);
        if (sp.contains("l6_ready"))
            lev6.setEnabled(true);
        if (sp.contains("l7_ready"))
            lev7.setEnabled(true);
        if (sp.contains("l8_ready"))
            lev8.setEnabled(true);
        if (sp.contains("l9_ready"))
            lev9.setEnabled(true);
    }

    private void setBtnClick() {
        MediaPlayer btnClick = MediaPlayer.create(EurovisionHomeActivity.this, R.raw.btn_c);
        btnClick.start();
    }

    @Override
    public void onClick(View v) {
        setBtnClick();
        Intent intent;
        switch (v.getId()) {
            case (R.id.lev1):
                intent = new Intent(EurovisionHomeActivity.this, AbanibiAvtivity.class);
                startActivityForResult(intent, L1);
                break;
            case (R.id.lev2):
                intent = new Intent(EurovisionHomeActivity.this, HaiActivity.class);
                startActivityForResult(intent, L2);
                break;
            case (R.id.lev3):
                intent = new Intent(EurovisionHomeActivity.this, GoldenBoyActivity.class);
                startActivityForResult(intent, L3);
                break;
            case (R.id.lev4):
                intent = new Intent(EurovisionHomeActivity.this, KanNoladetyActivity.class);
                startActivityForResult(intent, L4);
                break;
            case (R.id.lev5):
                intent = new Intent(EurovisionHomeActivity.this, HoraActivity.class);
                startActivityForResult(intent, L5);
                break;
            case (R.id.lev6):
                intent = new Intent(EurovisionHomeActivity.this, OleOleActivity.class);
                startActivityForResult(intent, L6);
                break;
            case (R.id.lev7):
                intent = new Intent(EurovisionHomeActivity.this, AtVaAniActivity.class);
                startActivityForResult(intent, L7);
                break;
            case (R.id.lev8):
                intent = new Intent(EurovisionHomeActivity.this, HeiSham.class);
                startActivityForResult(intent, L8);
                break;
            case (R.id.lev9):
                intent = new Intent(EurovisionHomeActivity.this, MilimActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case L1:
                if (resultCode == RESULT_OK) {
                    lev2.setEnabled(true);
                }
                break;
            case L2:
                if (resultCode == RESULT_OK)
                    lev3.setEnabled(true);
                break;
            case L3:
                if (resultCode == RESULT_OK)
                    lev4.setEnabled(true);
                break;
            case L4:
                if (resultCode == RESULT_OK)
                    lev5.setEnabled(true);
                break;
            case L5:
                if (resultCode == RESULT_OK)
                    lev6.setEnabled(true);
                break;
            case L6:
                if (resultCode == RESULT_OK)
                    lev7.setEnabled(true);
                break;
            case L7:
                if (resultCode == RESULT_OK)
                    lev8.setEnabled(true);
                break;
            case L8:
                if (resultCode == RESULT_OK)
                    lev9.setEnabled(true);
                break;
        }
    }
}
