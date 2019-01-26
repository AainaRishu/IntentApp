package com.android.aaina.intentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener{
            var i = Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:"+et1.text.toString())
            startActivity(i)

        }
        c1.setOnClickListener{
            var i = Intent()
            i.action="android.media.action.IMAGE_CAPTURE"
            startActivity(i)

        }
        c2.setOnClickListener{
            var i = Intent()
            i.action=Intent.ACTION_VIEW
            startActivity(i)

        }



        b2.setOnClickListener{
            var i = Intent(this@MainActivity,
                WelcomeActivity::class.java)
            i.putExtra("name",et2.text.toString())
            i.putExtra("qual",et3.text.toString())
            startActivity(i)

        }
        b3.setOnClickListener{
           var i=Intent()
            i.action="com.whatsapp"
        }
    }
}
