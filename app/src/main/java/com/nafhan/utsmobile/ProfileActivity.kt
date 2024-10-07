package com.nafhan.utsmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nafhan.utsmobile.databinding.ActivityProfileBinding

class ProfileActivity: AppCompatActivity(){
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            btnBack.setOnClickListener {
                finish()
            }
            btnRumah.setOnClickListener {
                finish()
            }

        }
    }
}