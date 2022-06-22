package com.bandungwetan.sicamat.ui.activity.agenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bandungwetan.sicamat.R
import com.bandungwetan.sicamat.adapter.AgendaRecyclerAdapter
import com.bandungwetan.sicamat.databinding.ActivityAgendaBinding
import com.bandungwetan.sicamat.lightStatusBar
import com.bandungwetan.sicamat.ui.home.HomeFragment

class AgendaActivity : AppCompatActivity(){
    private var _binding : ActivityAgendaBinding? = null
    private val binding get() = _binding!!
    private lateinit var agendaAdapter : AgendaRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        lightStatusBar(window)

        agendaAdapter = AgendaRecyclerAdapter()
        binding.recyclerviewagenda.adapter = agendaAdapter
        val ArrowOpen : ImageButton = findViewById(R.id.cv_arrowl)
        ArrowOpen.setOnClickListener(){
            onBackPressed()
        }
    }


}