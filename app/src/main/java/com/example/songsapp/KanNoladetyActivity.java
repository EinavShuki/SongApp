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

public class KanNoladetyActivity extends ToastDialogFun implements View.OnClickListener {


    EditText c1, c2, c3, c4, c5, c6, c7, c8, c9;
    boolean firstFocus = true;
    boolean l1, l2, l3, l4, l5, l6, l7, l8, l9;
    Button check, addL, revealSong, clear;
    SharedPreferences sp, points;
    int point;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kan_noladety);


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
                if (hasFocus) {
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
                        c6.setText("");
                        firstFocus = false;
                        l6 = false;
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
                c6.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c7.requestFocus();

                    }

                });

            }
        });
        c7.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    if (firstFocus) {
                        c7.setText("");
                        firstFocus = false;
                        l7 = false;
                    }

                    //moving back to previous editText
                    c7.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c7.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c6.requestFocus();
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
                c7.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c8.requestFocus();

                    }

                });

            }
        });
        c8.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    if (firstFocus) {
                        c8.setText("");
                        firstFocus = false;
                        l8 = false;
                    }

                    //moving back to previous editText
                    c8.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c8.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c7.requestFocus();
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
                c8.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0)
                            c9.requestFocus();

                    }

                });

            }
        });
        c9.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if (firstFocus) {
                        l9 = false;
                        c9.setText("");
                        firstFocus = false;
                    }

                    //moving back to previous editText
                    c9.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (keyCode == KeyEvent.KEYCODE_DEL) {
                                c9.setOnKeyListener(new View.OnKeyListener() {
                                    @Override
                                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                                        if (keyCode == KeyEvent.KEYCODE_DEL) {
                                            c8.requestFocus();
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
        sp = getSharedPreferences("to_be_enabled_euro", MODE_PRIVATE);
        points = getSharedPreferences("points", MODE_PRIVATE);
        point = points.getInt("point", 100);

        c1 = findViewById(R.id.char1);
        c2 = findViewById(R.id.char2);
        c3 = findViewById(R.id.char3);
        c4 = findViewById(R.id.char4);
        c5 = findViewById(R.id.char5);
        c6 = findViewById(R.id.char6);
        c7 = findViewById(R.id.char7);
        c8 = findViewById(R.id.char8);
        c8 = findViewById(R.id.char8);
        c9 = findViewById(R.id.char9);

        check = findViewById(R.id.check_btn);
        addL = findViewById(R.id.add_letter);
        revealSong = findViewById(R.id.reveal);
        clear = findViewById(R.id.clear);
    }

    private void setBtnClick() {
        MediaPlayer btnClick = MediaPlayer.create(KanNoladetyActivity.this, R.raw.btn_c);
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
                c7.setText("");
                c8.setText("");
                c9.setText("");
                l1 = l2 = l3 = l4 = l5 = l6 = l7 = l8 = l9 = false;
                break;
            case R.id.reveal:
                if (oka) {
                    oka = false;
                    point -= 70;
                    c1.setText("כ");
                    c2.setText("א");
                    c3.setText("ן");
                    c4.setText("נ");
                    c5.setText("ו");
                    c6.setText("ל");
                    c7.setText("ד");
                    c8.setText("ת");
                    c9.setText("י");
                } else
                    showAll(point, revealSong);
                break;
            case R.id.add_letter:
                if (okl) {
                    okl = false;
                    point -= 20;
                    if (!l1) {
                        c1.setText("כ");
                        l1 = true;
                    } else if (!l2) {
                        c2.setText("א");
                        l2 = true;
                    } else if (!l3) {
                        c3.setText("ן");
                        l3 = true;
                    } else if (!l4) {
                        c4.setText("נ");
                        l4 = true;
                    } else if (!l5) {
                        c5.setText("ו");
                        l5 = true;
                    } else if (!l6) {
                        c6.setText("ל");
                        l6 = true;
                    } else if (!l7) {
                        c7.setText("ד");
                        l7 = true;
                    } else if (!l8) {
                        c8.setText("ת");
                        l8 = true;
                    } else if (!l9) {
                        c9.setText("י");
                        l9 = true;
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
                String char7 = c7.getText().toString();
                String char8 = c8.getText().toString();
                String char9 = c9.getText().toString();

                if (char1.equals("כ") && char2.equals("א") && char3.equals("ן") && char4.equals("נ") && char5.equals("ו") && char6.equals("ל") && char7.equals("ד") && char8.equals("ת") && char9.equals("י")) {
                    done=true;
                    //check if this is the first time of solving the level
                    if (!sp.contains("l5_ready"))
                        point += 10;
                    MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.correct);
                    mp.start();
                    Intent returnIntent = new Intent();
                    setResult(Activity.RESULT_OK, returnIntent);
                    Intent intent = new Intent(KanNoladetyActivity.this, IntermediateActivity.class);
                    intent.putExtra("song_id", "IzKZGgvh7Co");
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
            editor.putBoolean("l5_ready", true);
            editor.apply();

            //updates points
            editor = points.edit().putInt("point", point);
            editor.apply();
            winToast("צברת עד כה " + points.getInt("point", 0) + " נקודות");
        }
    }
}
