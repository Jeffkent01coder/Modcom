package com.example.modcom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modcom.databinding.ActivityLoginBinding
import com.example.modcom.databinding.ActivityRegistrerBinding

class Registrer : AppCompatActivity() {
    private var binding: ActivityRegistrerBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrerBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding?.login?.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }
    }
}