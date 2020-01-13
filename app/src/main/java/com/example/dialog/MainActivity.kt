package com.example.dialog

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
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
                .setCancellable(false)
                .setBackgroundColor(Color.DKGRAY)
                .setTitleColor(Color.WHITE)
                .setMessageColor(Color.WHITE)
                .setImage(R.drawable.cross)             //optional
                .setImageTint(Color.CYAN)
                .build()


        }





    }


}

