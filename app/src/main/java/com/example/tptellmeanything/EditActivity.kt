package com.example.tptellmeanything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tptellmeanything.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {

    val binding by lazy { ActivityEditBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}