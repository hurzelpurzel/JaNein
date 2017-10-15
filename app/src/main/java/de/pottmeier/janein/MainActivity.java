package de.pottmeier.janein;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton jaBtn = (ImageButton) findViewById(R.id.imageButtonJa);
        jaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ja);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        ImageButton neinBtn = (ImageButton) findViewById(R.id.imageButtonNein);
        neinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nein);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

    }




}
