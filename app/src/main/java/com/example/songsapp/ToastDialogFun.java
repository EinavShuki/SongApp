package com.example.songsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.icu.util.EthiopicCalendar;
import android.media.MediaPlayer;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ToastDialogFun extends Activity {

    public View toastView;
    public Toast wrongToast;
    Dialog dialog;
    View mView;
    TextView msg,you_have;
    Button expose,cancel;
    Boolean okl=false,oka=false,done=false;


    public void showLetter(int p ,Button b)
    {
        mView=getLayoutInflater().inflate(R.layout.show_letter_dialog,null);
        msg=mView.findViewById(R.id.msg);
        you_have=mView.findViewById(R.id.you_have);
        expose=mView.findViewById(R.id.expose);
        cancel=mView.findViewById(R.id.cancel);
        if(p<20)
            expose.setEnabled(false);

        dialog= new Dialog(this);
        String amount=getString(R.string.amount_of_points)+" ";
        you_have.setText(amount+p);
        expose.setOnClickListener(v -> {
            MediaPlayer btnClick = MediaPlayer.create(ToastDialogFun.this, R.raw.btn_c);
            btnClick.start();
            okl=true;
            dialog.dismiss();
        });
        cancel.setOnClickListener(v->{
            MediaPlayer btnClick = MediaPlayer.create(ToastDialogFun.this, R.raw.btn_c);
            btnClick.start();
            okl=false;
            dialog.dismiss();
        });
        dialog.setContentView(mView);
        dialog.setCancelable(false);
        dialog.create();
        dialog.show();

        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                if(okl)
                    b.performClick();
            }
        });
    }
    public void showAll(int p ,Button b)
    {
        mView=getLayoutInflater().inflate(R.layout.show_all_dialog,null);
        msg=mView.findViewById(R.id.msg);
        you_have=mView.findViewById(R.id.you_have);
        expose=mView.findViewById(R.id.expose);
        cancel=mView.findViewById(R.id.cancel);
        if(p<70)
            expose.setEnabled(false);

        dialog= new Dialog(this);
        String amount=getString(R.string.amount_of_points)+" ";
        you_have.setText(amount+p);
        expose.setOnClickListener(v -> {
            oka=true;
            dialog.dismiss();
        });
        cancel.setOnClickListener(v->{
            oka=false;
            dialog.dismiss();
        });
        dialog.setContentView(mView);
        dialog.setCancelable(false);
        dialog.create();
        dialog.show();

        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                if(oka)
                    b.performClick();
            }
        });
    }

    public void winToast(String str) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast,
                (ViewGroup) findViewById(R.id.toast_layout_root));

        ImageView image = (ImageView) layout.findViewById(R.id.image);
        image.setImageResource(R.drawable.badge);
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(str);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 300);
        toast.setDuration(toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public void wrongToast() {
        wrongToast = Toast.makeText(this, R.string.try_again, Toast.LENGTH_SHORT);
        toastView = wrongToast.getView(); // This'll return the default View of the Toast.

        TextView toastMessage = (TextView) toastView.findViewById(android.R.id.message);
        toastMessage.setTextSize(25);
        toastMessage.setPadding(10,10,10,10);
        toastMessage.setTextColor(Color.BLACK);
//        toastMessage.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_fly, 0, 0, 0);
        toastMessage.setGravity(Gravity.CENTER);
        toastMessage.setCompoundDrawablePadding(30);
        toastMessage.setBackgroundResource(R.drawable.wrong_toast);
        toastView.setBackground(null);
        wrongToast.show();
    }


}
