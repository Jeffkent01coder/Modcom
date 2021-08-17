package com.example.modcom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modcom.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private var binding: ActivityLoginBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding?.log?.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
            finish()
        }

        binding?.reg?.setOnClickListener {
            startActivity(Intent(this, Registrer::class.java))
            finish()
        }
    }
}