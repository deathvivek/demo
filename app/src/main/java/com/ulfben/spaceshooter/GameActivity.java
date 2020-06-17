package com.ulfben.spaceshooter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ulfben.spaceshooter.canusingpkg.GameV2;

import java.util.concurrent.TimeUnit;

public class GameActivity extends AppCompatActivity {
    private GameV2 mGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mGame = new Game(this);
        mGame = new GameV2(this);

        setContentView(mGame);
        hideSystemUI();


      //  Log.d("onCreate", "onCreate: == "+ TimeUnit.MINUTES.toSeconds(1));
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGame.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGame.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mGame.onDestroy();
    }

    // the systemUI methods comes from
    // https://developer.android.com/training/system-ui/immersive.html
    private void hideSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
    private void showSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
