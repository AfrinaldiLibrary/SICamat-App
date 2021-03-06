package com.bandungwetan.sicamat.ui.activity.adzan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.databinding.ActivityAdzanBinding
import com.bandungwetan.sicamat.lightStatusBar

class AdzanActivity : AppCompatActivity() {
    private var _binding : ActivityAdzanBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAdzanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        lightStatusBar(window)

        val ArrowOpen : ImageButton = findViewById(R.id.imageButton)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }
    }
}