package com.example.aad.shakedetection;

/**
 * Created by AAD on 20/02/2017.
 */

public interface OnShakeListener {

    public void onShake();
    public void onIdel();
    public void onAngleReached();

}
