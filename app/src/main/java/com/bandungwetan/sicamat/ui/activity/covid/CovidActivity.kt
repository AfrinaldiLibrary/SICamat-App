package com.bandungwetan.sicamat.ui.activity.covid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.databinding.ActivityCovidBinding
import com.bandungwetan.sicamat.lightStatusBar

class CovidActivity : AppCompatActivity() {
    private var _binding : ActivityCovidBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCovidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        lightStatusBar(window)

        val ArrowOpen : ImageButton = findViewById(R.id.cv_arrowl_covid)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }
    }
}
