package com.bandungwetan.sicamat.ui.activity.pkpk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.databinding.ActivityPkPkBinding
import com.bandungwetan.sicamat.lightStatusBar

class PkPkActivity : AppCompatActivity() {
    private var _binding : ActivityPkPkBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPkPkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        lightStatusBar(window)

        val ArrowOpen : ImageButton = findViewById(R.id.cv_arrowl_pkpk)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }
    }
}