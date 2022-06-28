package com.bandungwetan.sicamat.ui.activity.ipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.databinding.ActivityIpeBinding
import com.bandungwetan.sicamat.lightStatusBar

class IpeActivity : AppCompatActivity() {
    private var _binding : ActivityIpeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityIpeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        lightStatusBar(window)

        val ArrowOpen : ImageButton = findViewById(R.id.cv_arrowl_ipe)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }
    }
}