package com.bandungwetan.sicamat.ui.activity.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.bandungwetan.sicamat.MainActivity
import com.bandungwetan.sicamat.databinding.ActivityLoginBinding
import com.bandungwetan.sicamat.lightStatusBar
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    private var _binding : ActivityLoginBinding? = null
    private val binding get() =  _binding!!

    private val loginViewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        lightStatusBar(window)

        binding.button.setOnClickListener{
            loginViewModel.postLogin(
                binding.email.text.toString(),
                binding.password.text.toString()
            )

            loginViewModel.isSuccess.observe(this){ isSuccess ->
                if (isSuccess) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Snackbar.make(binding.root, "login gagal", Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }
}