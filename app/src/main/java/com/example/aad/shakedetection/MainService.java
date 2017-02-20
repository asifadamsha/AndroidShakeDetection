package com.example.aad.shakedetection;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by AAD on 20/02/2017.
 */

public class MainService extends Service implements OnShakeListener {

    private Handler handler;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {


        }
    };

    @Override
    public void onCreate() {
        super.onCreate();



    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onShake() {

    }

    @Override
    public void onIdel() {

        if(handler==null){
            handler = new Handler();
            handler.post(runnable);
            return;
        }

        handler.postDelayed(runnable,1000);
    }

    @Override
    public void onAngleReached() {

    }
}
