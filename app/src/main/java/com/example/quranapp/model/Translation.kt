package com.example.quranapp.model

data class Translation(
    val language: String,
    val translation:List<Translation>
)
