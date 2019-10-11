package com.example.sabias_que

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long=4000//5 segs.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CREAR OBEJETOS DE CLASE ANIMACION
        val animacion: Animation = AnimationUtils.loadAnimation(this, R.anim.animacion)
        txvUno.startAnimation(animacion)

        Handler().postDelayed({
            startActivity(Intent(this, Principal_Activity::class.java))
            finish()
        },SPLASH_TIME_OUT)
    }
}
