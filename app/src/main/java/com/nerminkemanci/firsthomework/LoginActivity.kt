package com.nerminkemanci.firsthomework

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.TextView
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    protected var forgotPassword: TextView? = null
    protected var signTextButton: TextView? = null
    protected var passwordEditText: EditText? = null
    private var isShow: Boolean = false

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        /*window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }*/
        passwordEditText = findViewById(R.id.passwordEditText)
        forgotPassword = findViewById(R.id.forgotPassword)
        signTextButton = findViewById(R.id.signTextButton)
        forgotPassword?.setOnClickListener(View.OnClickListener {
            alphaAnim(forgotPassword!!)
        })
        signTextButton?.setOnClickListener(View.OnClickListener {
            alphaAnim(signTextButton!!)
        })


        passwordEditText?.setOnTouchListener { v, event ->
           if(event.action==MotionEvent.ACTION_UP){
               if (event.getRawX() >= (passwordEditText?.right!! -40- passwordEditText?.compoundDrawables?.get(2)!!.bounds.width())){

                   if(isShow){
                       passwordEditText?.inputType = 224

                   }
                   else{
                       passwordEditText?.inputType = 129
                   }
                   isShow=!isShow
               }
           }
            false
        }
    }
    public fun alphaAnim(view:View){
        view.alpha = 0.4f
        view.animate()!!.alpha(1f).setDuration(700).start()
    }
}
