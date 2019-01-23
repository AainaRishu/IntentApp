package com.android.aaina.intentapp

import android.content.Intent
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

        }
        b3.setOnClickListener{

        }
    }
}
