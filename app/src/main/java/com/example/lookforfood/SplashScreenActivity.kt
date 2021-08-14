package com.example.lookforfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        screenView  =findViewById<ImageView>(R.id.splashScreenView)


        //val screenView = ImageView(findViewById(R.id.splashScreenView))
        screenView.alpha = 0f
        screenView.animate().setDuration(1500).alpha(1f).withEndAction{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

    }
    companion object {
        lateinit var screenView: ImageView
    }
}