package com.example.tptellmeanything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tptellmeanything.databinding.ActivityStoryBinding

class StoryActivity : AppCompatActivity() {

    val binding by lazy { ActivityStoryBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}