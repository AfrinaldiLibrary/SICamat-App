package com.bandungwetan.sicamat.ui.activity.sosial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.databinding.ActivitySosialBinding
import com.bandungwetan.sicamat.lightStatusBar

class SosialActivity : AppCompatActivity(), View.OnClickListener {
    private var _binding : ActivitySosialBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySosialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        lightStatusBar(window)

        val ArrowOpen : ImageButton = findViewById(R.id.cv_arrowl_sosial)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }

        binding.cardJs.setOnClickListener(this)
        binding.cardJg.setOnClickListener(this)
        binding.cardJm.setOnClickListener(this)
        binding.cardMg.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id){
            R.id.card_js -> {
                val intent = Intent(this, JumlahSekolahActivity::class.java)
                startActivity(intent)
            }
            R.id.card_jg -> {
                val intent = Intent(this, JumlahGuruActivity::class.java)
                startActivity(intent)
            }
            R.id.card_jm -> {
                val intent = Intent(this, JumlahMuridActivity::class.java)
                startActivity(intent)
            }
            R.id.card_mg -> {
                val intent = Intent(this, JumlahMuridGuruActivity::class.java)
                startActivity(intent)
            }
        }
    }
}