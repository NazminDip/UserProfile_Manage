package com.example.userprofileregistration

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.userprofileregistration.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

         binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnProfileList.setOnClickListener {
            startActivity(Intent(this, ActivityProfileList::class.java))
        }

    }
}