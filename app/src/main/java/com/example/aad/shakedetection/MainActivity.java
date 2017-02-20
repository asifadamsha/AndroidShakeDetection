package com.example.aad.shakedetection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.tbouron.shakedetector.library.ShakeDetector;

public class MainActivity extends AppCompatActivity implements OnShakeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onShake() {

    }
}
