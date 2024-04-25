package com.project.myassignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.myassignment.databinding.ActivityChatScreen1Binding
import com.project.myassignment.databinding.ActivityMainBinding

class chat_screen_1 : AppCompatActivity() {
lateinit var binding: ActivityChatScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_screen1)
        binding = ActivityChatScreen1Binding.inflate (layoutInflater)



    }
}