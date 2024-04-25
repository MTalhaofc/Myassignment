package com.project.myassignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.myassignment.databinding.ActivityAmoutScreenBinding
import com.project.myassignment.databinding.ActivityCardScreenBinding
import com.project.myassignment.databinding.ActivityPinScreenBinding

class pin_screen : AppCompatActivity() {
    lateinit var binding: ActivityPinScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPinScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinuePinScreen.setOnClickListener() {
            val intent = Intent(this, transaction_screen::class.java)
            startActivity(intent)
        }

    }
}