package com.example.tptellmeanything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tptellmeanything.databinding.ActivityTrashBinding

class TrashActivity : AppCompatActivity() {

    val binding by lazy {ActivityTrashBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}