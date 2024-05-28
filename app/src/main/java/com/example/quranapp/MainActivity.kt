package com.example.quranapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quranapp.repository.QuranRepository
import com.example.quranapp.retrofutit.RetrofitInstance
import com.example.quranapp.viewmodel.QuranViewmodel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: QuranViewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = QuranRepository(RetrofitInstance.api)
        viewModel = ViewModelProvider(this).get(QuranViewmodel::class.java)

        viewModel.verse.observe(this, Observer {

        })

        viewModel.translation.observe(this, Observer {

        })

        viewModel.getVerse()
        viewModel.getTranslations("en")

    }
}