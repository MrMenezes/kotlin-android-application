package com.tksd.kotlinandroidexample.splashscreenapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Eric on 12/04/2016.
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, SplashScreenActivity::class.java);
        startActivity(intent);
        finish();
    }
}