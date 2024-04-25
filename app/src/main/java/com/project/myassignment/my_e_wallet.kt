package com.project.myassignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.myassignment.databinding.ActivityMyEwalletBinding

class my_e_wallet : AppCompatActivity() {
    lateinit var binding: ActivityMyEwalletBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyEwalletBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvEWalletEscreen.setOnClickListener() {
            val intent = Intent(this, amount_screen::class.java)
            startActivity(intent)
        }

    }
}