package com.example.playvideousingkotlin

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fileName = "video"
        val filePlace = "android.resource://"+ packageName + "/raw/" + R.raw.video
        val videoView = findViewById<VideoView>(R.id.videoView)
        videoView.setVideoURI(Uri.parse(filePlace))

        videoView.setMediaController(MediaController(this))
        videoView.start()
    }
}
