package com.project.myassignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.myassignment.databinding.ActivityCallScreenBinding
import com.project.myassignment.databinding.ActivityMainBinding

class call_screen : AppCompatActivity() {
    lateinit var binding: ActivityCallScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bmwLogoCall.setOnClickListener() {
            val intent = Intent(this, my_e_wallet::class.java)
            startActivity(intent)
        }

    }
}