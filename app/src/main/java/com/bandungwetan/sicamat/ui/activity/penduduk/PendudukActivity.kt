package com.bandungwetan.sicamat.ui.activity.penduduk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.databinding.ActivityPendudukBinding
import com.bandungwetan.sicamat.lightStatusBar

class PendudukActivity : AppCompatActivity(), View.OnClickListener {
    private var _binding : ActivityPendudukBinding? = null
    private val binding get() = _binding!!
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPendudukBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        supportActionBar?.hide()
        lightStatusBar(window)
        
        binding.cardJp.setOnClickListener(this)
        binding.cardDpp.setOnClickListener(this)
        binding.cardKp.setOnClickListener(this)
        binding.cardLpp.setOnClickListener(this)
        binding.cardPmk.setOnClickListener(this)
        binding.cardPmku.setOnClickListener(this)
        binding.cardPmus.setOnClickListener(this)
        binding.cardRjmk.setOnClickListener(this)

        val ArrowOpen : ImageButton = findViewById(R.id.cv_arrowl_penduduk)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }
    }

    override fun onClick(view: View?) {
        when (view?.id){
            R.id.card_jp -> {
                val intent = Intent(this, JumlahPendudukActivity::class.java)
                startActivity(intent)
            }
            R.id.card_dpp -> {
                val intent = Intent(this, LajuPertumbuhanActivity::class.java)
                startActivity(intent)
            }
            R.id.card_kp -> {
                val intent = Intent(this, DistribusiPersentasiActivity::class.java)
                startActivity(intent)
            }
            R.id.card_lpp -> {
                val intent = Intent(this, KepadatanPendudukActivity::class.java)
                startActivity(intent)
            }
            R.id.card_pmk -> {
                val intent = Intent(this, RasioJenisActivity::class.java)
                startActivity(intent)
            }
            R.id.card_pmku -> {
                val intent = Intent(this, PendudukUmurdanGenderActivity::class.java)
                startActivity(intent)
            }
            R.id.card_pmus -> {
                val intent = Intent(this, PendudukkelUmurActivity::class.java)
                startActivity(intent)
            }
            R.id.card_rjmk -> {
                val intent = Intent(this, PendudukUsiaSekolahActivity::class.java)
                startActivity(intent)
            }
        }
    }


}