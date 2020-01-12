package com.example.dialog

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
                .setTitle("My Dialog")
                .setMessage("this")
                .setDuration(5000)
                .setSpeed(400)
                .setType(SDialog.SUCCESS)
                .setCancellable(false)
                .build()


        }





    }


}

