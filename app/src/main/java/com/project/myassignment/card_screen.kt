package com.project.myassignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.myassignment.databinding.ActivityAmoutScreenBinding
import com.project.myassignment.databinding.ActivityCallScreenBinding
import com.project.myassignment.databinding.ActivityCardScreenBinding

class card_screen : AppCompatActivity() {
    lateinit var binding: ActivityCardScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinueCardScreen.setOnClickListener() {
            val intent = Intent(this, pin_screen::class.java)
            startActivity(intent)
        }
    }
}