package com.nerminkemanci.firsthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    protected var loginTextButton: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }*/
        loginTextButton = findViewById(R.id.loginTextButton)
        loginTextButton?.setOnClickListener(View.OnClickListener {
           alphaAnim(loginTextButton!!)
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })

    }

    public fun alphaAnim(view:View){
        view.alpha = 0.4f
        view.animate()!!.alpha(1f).setDuration(500).start()
    }

}
