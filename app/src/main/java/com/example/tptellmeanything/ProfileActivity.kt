package com.example.tptellmeanything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tptellmeanything.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    val binding by lazy { ActivityProfileBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}