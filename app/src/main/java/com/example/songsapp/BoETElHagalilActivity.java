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

public class BoETElHagalilActivity extends ToastDialogFun implements View.OnClickListener {


    EditText c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14;
    boolean firstFocus = true;
    boolean l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    Button check, addL, revealSong, clear;
    SharedPreferences sp, points;
    int point;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bo_et_el_hagalil);


        init();

        clear.setOnClickListener(this);
        revealSong.setOnClickListener(this);
        addL.setOnClickListener(this);
        check.setOnClickListener(this);

        c1.setOnFocusChangeListener((v, hasFocus) -> {

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

        });
        c2.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c2.setText("");
                    firstFocus = false;
                    l2 = false;
                }

                //moving back to previous editText
                c2.setOnKeyListener((v1, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c2.setOnKeyListener((v11, keyCode114, event114) -> {
                            if (keyCode114 == KeyEvent.KEYCODE_DEL) {
                                c1.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
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

        });
        c3.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c3.setText("");
                    firstFocus = false;
                    l3 = false;
                }

                //moving back to previous editText
                c3.setOnKeyListener((v12, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c3.setOnKeyListener((v121, keyCode113, event113) -> {
                            if (keyCode113 == KeyEvent.KEYCODE_DEL) {
                                c2.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
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

        });
        c4.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c4.setText("");
                    firstFocus = false;
                    l4 = false;
                }
                //moving back to previous editText
                c4.setOnKeyListener((v13, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c4.setOnKeyListener((v131, keyCode1, event1) -> {
                            if (keyCode1 == KeyEvent.KEYCODE_DEL) {
                                c3.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
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

        });
        c5.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c5.setText("");
                    firstFocus = false;
                    l5 = false;
                }

                //moving back to previous editText
                c5.setOnKeyListener((v116, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c5.setOnKeyListener((v14, keyCode12, event12) -> {
                            if (keyCode12 == KeyEvent.KEYCODE_DEL) {
                                c4.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
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

        });
        c6.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c6.setText("");
                    firstFocus = false;
                    l6 = false;
                }

                //moving back to previous editText
                c6.setOnKeyListener((v15, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c6.setOnKeyListener((v151, keyCode13, event13) -> {
                            if (keyCode13 == KeyEvent.KEYCODE_DEL) {
                                c5.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
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

        });
        c7.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c7.setText("");
                    firstFocus = false;
                    l7 = false;
                }

                //moving back to previous editText
                c7.setOnKeyListener((v16, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c7.setOnKeyListener((v161, keyCode14, event14) -> {
                            if (keyCode14 == KeyEvent.KEYCODE_DEL) {
                                c6.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
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

        });
        c8.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c8.setText("");
                    firstFocus = false;
                    l8 = false;
                }

                //moving back to previous editText
                c8.setOnKeyListener((v17, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c8.setOnKeyListener((v171, keyCode15, event15) -> {
                            if (keyCode15 == KeyEvent.KEYCODE_DEL) {
                                c7.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
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

        });
        c9.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c9.setText("");
                    firstFocus = false;
                    l9 = false;
                }
                //moving back to previous editText
                c9.setOnKeyListener((v19, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c9.setOnKeyListener((v18, keyCode16, event16) -> {
                            if (keyCode16 == KeyEvent.KEYCODE_DEL) {
                                c8.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
                });
            }
            if (!hasFocus) {
                firstFocus = true;
            }
            c9.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.length() > 0)
                        c10.requestFocus();


                }
            });

        });
        c10.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c10.setText("");
                    firstFocus = false;
                    l10 = false;
                }

                //moving back to previous editText
                c10.setOnKeyListener((v110, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c10.setOnKeyListener((v1101, keyCode17, event17) -> {
                            if (keyCode17 == KeyEvent.KEYCODE_DEL) {
                                c9.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
                });
            }
            if (!hasFocus) {
                firstFocus = true;
            }
            c10.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.length() > 0)
                        c11.requestFocus();

                }

            });

        });
        c11.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c11.setText("");
                    firstFocus = false;
                    l11 = false;
                }

                //moving back to previous editText
                c11.setOnKeyListener((v111, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c11.setOnKeyListener((v1111, keyCode18, event18) -> {
                            if (keyCode18 == KeyEvent.KEYCODE_DEL) {
                                c10.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
                });
            }
            if (!hasFocus) {
                firstFocus = true;
            }
            c11.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.length() > 0)
                        c12.requestFocus();

                }

            });

        });
        c12.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c12.setText("");
                    firstFocus = false;
                    l12 = false;
                }

                //moving back to previous editText
                c12.setOnKeyListener((v112, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c12.setOnKeyListener((v1121, keyCode19, event19) -> {
                            if (keyCode19 == KeyEvent.KEYCODE_DEL) {
                                c11.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
                });
            }
            if (!hasFocus) {
                firstFocus = true;
            }
            c12.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.length() > 0)
                        c13.requestFocus();

                }

            });

        });
        c13.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                if (firstFocus) {
                    c13.setText("");
                    firstFocus = false;
                    l13 = false;
                }

                //moving back to previous editText
                c13.setOnKeyListener((v113, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c13.setOnKeyListener((v1131, keyCode112, event112) -> {
                            if (keyCode112 == KeyEvent.KEYCODE_DEL) {
                                c12.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
                });
            }
            if (!hasFocus) {
                firstFocus = true;
            }
            c13.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.length() > 0)
                        c14.requestFocus();

                }

            });

        });
        c14.setOnFocusChangeListener((v, hasFocus) -> {

            if (hasFocus) {
                if (firstFocus) {
                    l14 = false;
                    c14.setText("");
                    firstFocus = false;
                }

                //moving back to previous editText
                c14.setOnKeyListener((v115, keyCode, event) -> {
                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        c14.setOnKeyListener((v1151, keyCode111, event111) -> {
                            if (keyCode111 == KeyEvent.KEYCODE_DEL) {
                                c13.requestFocus();
                            }
                            return false;
                        });
                    }
                    return false;
                });

            }
            if (!hasFocus) {
                firstFocus = true;
            }

        });

    }

    public void init() {
        sp = getSharedPreferences("to_be_enabled_military", MODE_PRIVATE);
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
        c9 = findViewById(R.id.char9);
        c10 = findViewById(R.id.char10);
        c11 = findViewById(R.id.char11);
        c12 = findViewById(R.id.char12);
        c13 = findViewById(R.id.char13);
        c14 = findViewById(R.id.char14);

        check = findViewById(R.id.check_btn);
        addL = findViewById(R.id.add_letter);
        revealSong = findViewById(R.id.reveal);
        clear = findViewById(R.id.clear);

    }

    private void setBtnClick() {
        MediaPlayer btnClick = MediaPlayer.create(BoETElHagalilActivity.this, R.raw.btn_c);
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
                c10.setText("");
                c11.setText("");
                c12.setText("");
                c13.setText("");
                c14.setText("");
                l1 = l2 = l3 = l4 = l5 = l6 = l7 = l8 = l9 = l10 = l11 = l12 = l13 = l14 = false;
                break;
            case R.id.reveal:
                if (oka) {
                    oka = false;
                    point -= 70;
                    c1.setText("ב");
                    c2.setText("ו");
                    c3.setText("א");
                    c4.setText("א");
                    c5.setText("י");
                    c6.setText("ת");
                    c7.setText("י");
                    c8.setText("א");
                    c9.setText("ל");
                    c10.setText("ה");
                    c11.setText("ג");
                    c12.setText("ל");
                    c13.setText("י");
                    c14.setText("ל");
                } else
                    showAll(point, revealSong);
                break;
            case R.id.add_letter:
                if (okl) {
                    okl = false;
                    point -= 20;
                    if (!l1) {
                        c1.setText("ב");
                        l1 = true;
                    } else if (!l2) {
                        c2.setText("ו");
                        l2 = true;
                    } else if (!l3) {
                        c3.setText("א");
                        l3 = true;
                    } else if (!l4) {
                        c4.setText("א");
                        l4 = true;
                    } else if (!l5) {
                        c5.setText("י");
                        l5 = true;
                    } else if (!l6) {
                        c6.setText("ת");
                        l6 = true;
                    } else if (!l7) {
                        c7.setText("י");
                        l7 = true;
                    } else if (!l8) {
                        c8.setText("א");
                        l8 = true;
                    } else if (!l9) {
                        c9.setText("ל");
                        l9 = true;
                    } else if (!l10) {
                        c10.setText("ה");
                        l10 = true;
                    } else if (!l11) {
                        c11.setText("ג");
                        l11 = true;
                    } else if (!l12) {
                        c12.setText("ל");
                        l12 = true;
                    } else if (!l13) {
                        c13.setText("י");
                        l13 = true;
                    } else if (!l14) {
                        c14.setText("ל");
                        l14 = true;
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
                String char10 = c10.getText().toString();
                String char11 = c11.getText().toString();
                String char12 = c12.getText().toString();
                String char13 = c13.getText().toString();
                String char14 = c14.getText().toString();

                if (char1.equals("ב") && char2.equals("ו") && char3.equals("א") && char4.equals("א") && char5.equals("י") && char6.equals("ת") && char7.equals("י") && char8.equals("א") && char9.equals("ל") && char10.equals("ה") && char11.equals("ג") && char12.equals("ל") && char13.equals("י") && char14.equals("ל")) {
                    done=true;
                    //check if this is the first time of solving the level
                    if (!sp.contains("l5_ready"))
                        point += 10;
                    MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.correct);
                    mp.start();
                    Intent returnIntent = new Intent();
                    setResult(Activity.RESULT_OK, returnIntent);
                    Intent intent = new Intent(BoETElHagalilActivity.this, IntermediateActivity.class);
                    intent.putExtra("song_id", "sa4PK30AxjI");
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
