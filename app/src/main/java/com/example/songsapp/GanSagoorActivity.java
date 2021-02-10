package com.example.songsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class GanSagoorActivity extends ToastDialogFun implements View.OnClickListener {


    EditText c1, c2, c3, c4, c5, c6;
    boolean firstFocus = true;
    boolean l1, l2, l3, l4, l5, l6;
    Button check, addL, revealSong, clear;
    SharedPreferences sp, points;
    int point;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gan_sagoor);


        init();

        clear.setOnClickListener(this);
        revealSong.setOnClickListener(this);
        addL.setOnClickListener(this);
        check.setOnClickListener(this);

        c1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus && firstFocus) {
                    c1.setText("");
                    firstFocus = false;
                    l1 = false;
                }
                if (!hasFocus) {
                    firstFocus = true;
                }
                c1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c2.requestFocus();

                    }
                });

            }
        });
        c2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if (firstFocus) {
                        c2.setText("");
                        firstFocus = false;
                        l2 = false;
                    }
                    //moving back to previous editText
                    c2.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c2.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c1.requestFocus();
                                        }
                                        return false;
                                    }
                                });
                            }
                            return false;
                        }
                    });
                }
                if (!hasFocus) {
                    firstFocus = true;
                }
                c2.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c3.requestFocus();

                    }
                });

            }
        });
        c3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus && firstFocus) {
                    if (firstFocus) {
                        c3.setText("");
                        firstFocus = false;
                        l3 = false;
                    }

                    //moving back to previous editText
                    c3.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c3.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c2.requestFocus();
                                        }
                                        return false;
                                    }

                                });
                            }
                            return false;
                        }

                    });
                }
                if (!hasFocus) {
                    firstFocus = true;
                }
                c3.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c4.requestFocus();


                    }
                });

            }
        });
        c4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    if (firstFocus) {
                        c4.setText("");
                        firstFocus = false;
                        l4 = false;
                    }
                    //moving back to previous editText
                    c4.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c4.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c3.requestFocus();
                                        }
                                        return false;
                                    }

                                });
                            }
                            return false;
                        }

                    });
                }
                if (!hasFocus) {
                    firstFocus = true;
                }
                c4.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c5.requestFocus();


                    }
                });

            }
        });
        c5.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    if (firstFocus) {
                        c5.setText("");
                        firstFocus = false;
                        l5 = false;
                    }
                    //moving back to previous editText
                    c5.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c5.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c4.requestFocus();
                                        }
                                        return false;
                                    }

                                });
                            }
                            return false;
                        }

                    });

                }
                if (!hasFocus) {
                    firstFocus = true;
                }
                c5.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c6.requestFocus();

                    }

                });

            }
        });
        c6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if (firstFocus) {
                        l6 = false;
                        c6.setText("");
                        firstFocus = false;
                    }
                    //moving back to previous editText
                    c6.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c6.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c5.requestFocus();
                                        }
                                        return false;
                                    }

                                });
                            }
                            return false;
                        }

                    });
                }
                if (!hasFocus) {
                    firstFocus = true;
                }

            }

        });


    }

    public void init() {
        sp = getSharedPreferences("to_be_enabled_kids", MODE_PRIVATE);
        points = getSharedPreferences("points", MODE_PRIVATE);
        point = points.getInt("point", 100);

        c1 = findViewById(R.id.char1);
        c2 = findViewById(R.id.char2);
        c3 = findViewById(R.id.char3);
        c4 = findViewById(R.id.char4);
        c5 = findViewById(R.id.char5);
        c6 = findViewById(R.id.char6);
        check = findViewById(R.id.check_btn);
        addL = findViewById(R.id.add_letter);
        revealSong = findViewById(R.id.reveal);
        clear = findViewById(R.id.clear);

    }

    private void setBtnClick() {
        MediaPlayer btnClick = MediaPlayer.create(GanSagoorActivity.this, R.raw.btn_c);
        btnClick.start();
    }

    @Override
    public void onClick(View v) {
        setBtnClick();
        switch (v.getId()) {
            case R.id.clear:
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                l1 = l2 = l3 = l4 = l5 = l6 = false;
                break;
            case R.id.reveal:
                if (oka) {
                    oka = false;
                    point -= 70;
                    c1.setText("ג");
                    c2.setText("ן");
                    c3.setText("ס");
                    c4.setText("ג");
                    c5.setText("ו");
                    c6.setText("ר");
                } else
                    showAll(point, revealSong);
                break;
            case R.id.add_letter:
                if (okl) {
                    okl = false;
                    point -= 20;
                    if (!l1) {
                        c1.setText("ג");
                        l1 = true;
                    } else if (!l2) {
                        c2.setText("ן");
                        l2 = true;
                    } else if (!l3) {
                        c3.setText("ס");
                        l3 = true;
                    } else if (!l4) {
                        c4.setText("ג");
                        l4 = true;
                    } else if (!l5) {
                        c5.setText("ו");
                        l5 = true;
                    } else if (!l6) {
                        c6.setText("ר");
                        l6 = true;
                    }
                } else
                    showLetter(point, addL);
                break;
            case R.id.check_btn:
                String char1 = c1.getText().toString();
                String char2 = c2.getText().toString();
                String char3 = c3.getText().toString();
                String char4 = c4.getText().toString();
                String char5 = c5.getText().toString();
                String char6 = c6.getText().toString();

                if (char1.equals("ג") && char2.equals("ן") && char3.equals("ס") && char4.equals("ג") && char5.equals("ו") && char6.equals("ר")) {
                    done=true;
                    //check if this is the first time of solving the level
                    if (!sp.contains("l3_ready"))
                        point += 10;
                    MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.correct);
                    mp.start();
                    Intent returnIntent = new Intent();
                    setResult(Activity.RESULT_OK, returnIntent);
                    Intent intent = new Intent(GanSagoorActivity.this, IntermediateActivity.class);
                    intent.putExtra("song_id", "iGe6olpUuqE");
                    startActivity(intent);
                    finish();
                } else {
                    MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.wrong);
                    mp.start();
                    wrongToast();
                }

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (done) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean("l3_ready", true);
            editor.apply();

            //updates points
            editor = points.edit().putInt("point", point);
            editor.apply();
            winToast("צברת עד כה " + points.getInt("point", 0) + " נקודות");
        }
    }
}
