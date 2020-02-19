package com.example.dialog

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shahzainali.sdialog.SDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {

            SDialog.Builder(this)
                .setTitle("My Dialog")                  //set title
                .setMessage("this")                     //set message
                .setDuration(5000)                      //how long dialog will display
                .setSpeed(400)                          //animation speed
                .setCancellable(true)
                .setBackgroundColor(Color.DKGRAY)
                .setTitleColor(Color.WHITE)
                .setMessageColor(Color.WHITE)
                .setMessageTypeface(Typeface.createFromAsset(assets, "Poppins-Light.ttf"))
                .setTitleTypeface(Typeface.createFromAsset(assets, "Poppins-Medium.ttf"))
                .setTitleTextSize(20F)
                .setMessageTextSize(14F)
                .setImage(R.drawable.cross)             //optional
                .setImageTint(Color.CYAN)
                .build()
        }

    }



}

