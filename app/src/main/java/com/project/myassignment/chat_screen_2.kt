package com.project.myassignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.myassignment.databinding.ActivityChatScreen2Binding
import com.project.myassignment.databinding.ActivityMainBinding

class chat_screen_2 : AppCompatActivity() {
    lateinit var binding: ActivityChatScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityChatScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ImgNextScreen.setOnClickListener(){
            val intent = Intent(this, call_screen::class.java)
            startActivity(intent)
        }
    }
}