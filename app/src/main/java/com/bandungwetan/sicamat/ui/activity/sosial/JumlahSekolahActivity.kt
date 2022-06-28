package com.bandungwetan.sicamat.ui.activity.sosial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.lightStatusBar

class JumlahSekolahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafik)

        supportActionBar?.hide()
        lightStatusBar(window)

        val ArrowOpen : ImageButton = findViewById(R.id.cv_arrowl_jl)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }
    }
}