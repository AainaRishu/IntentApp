package com.android.aaina.intentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener {
            var i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:" + et1.text.toString())
            startActivity(i)

        }
        c1.setOnClickListener {
            var i = Intent()
            i.action = "android.media.action.IMAGE_CAPTURE"
            startActivity(i)

        }
        c2.setOnClickListener {
            var i = Intent()
            i.action = Intent.ACTION_VIEW
            startActivity(i)

        }



        b2.setOnClickListener {
            var i = Intent(
                this@MainActivity,
                WelcomeActivity::class.java
            )
            i.putExtra("name", et2.text.toString())
            i.putExtra("qual", et3.text.toString())
            startActivity(i)

        }
        b3.setOnClickListener {
            val i = packageManager.getLaunchIntentForPackage("com.whatsapp")
            if (i != null) {   // If App is installed in the phone
                startActivity(i)
            } else {
                val i = Intent()
                i.action = Intent.ACTION_VIEW
                i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")
                startActivity(i)
            }
        }
        b4.setOnClickListener {
            val i = packageManager.getLaunchIntentForPackage("in.swiggy.android")
            if(i!=null){
                startActivity(i)
            }
            else{
                val i = Intent()
                i.action = Intent.ACTION_VIEW
                i.data = Uri.parse("https://play.google.com/store/apps/details?id=in.swiggy.android")
                startActivity(i)
            }

        }
    }
}