package com.example.midterm1_se324;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    mTextField
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // to display the icon inside the app for the bar on top
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_hs);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);

        TextView Teext1 = (TextView) findViewById(R.id.textView1);
        TextView time = (TextView) findViewById(R.id.time);
        TimerTask Task = new TimerTask() {
            @Override
            public void run() {

            }
        }
        Timer time = new Timer();
        time.schedule(Task,9000);

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {

                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                mTextField.setText("done!");
            }

        }.start();
    }
}