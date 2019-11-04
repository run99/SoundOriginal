package com.run.soundoriginal

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaPlayer = MediaPlayer.create(this,R.raw.dodo)
        val mediaPlayer1 = MediaPlayer.create(this, R.raw.re)
        val mediaPlayer2 = MediaPlayer.create(this, R.raw.mi)
        val mediaPlayer3 = MediaPlayer.create(this, R.raw.fa)
        val mediaPlayer4 = MediaPlayer.create(this, R.raw.so)
        val mediaPlayer5 = MediaPlayer.create(this, R.raw.ra)
        val mediaPlayer6 = MediaPlayer.create(this, R.raw.si)

        button.setOnClickListener {
            mediaPlayer.start()
        }

        button2.setOnClickListener {
            mediaPlayer1.start()
        }

        button3.setOnClickListener {
            mediaPlayer2.start()
        }

        button4.setOnClickListener {
            mediaPlayer3.start()
        }

        button5.setOnClickListener {
            mediaPlayer4.start()
        }

        button6.setOnClickListener {
            mediaPlayer5.start()
        }

        button7.setOnClickListener {
            mediaPlayer6.start()
        }



    }
}
