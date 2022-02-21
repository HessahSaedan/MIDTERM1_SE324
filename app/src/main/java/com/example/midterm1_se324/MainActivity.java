package com.example.midterm1_se324;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button playsong;
    MediaPlayer Song ;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Teext2 = (TextView) findViewById(R.id.textView2);

        Button playsong  = (Button) findViewById(R.id.button);
        playing = 0;

    }
    playsong.OnClickListener songgg = new Button.OnClickListener() {

        @Override
        public void onClick(View v){

            switch(playing) {
                case 0:
                    playsong.start();
                    playing = 1;
                    break;
                case 1:
                    playsong.pause();
                    playing = 0;
                    break;
            }
        }
    }
}