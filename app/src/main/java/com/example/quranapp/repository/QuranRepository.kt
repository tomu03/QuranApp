package com.example.quranapp.repository

import com.example.quranapp.model.Translation
import com.example.quranapp.model.Verse
import com.example.quranapp.retrofutit.QuranApiService

class QuranRepository (private val api: QuranApiService){
    suspend fun getVerses():List<Verse>{
        return api.getVerses()
    }

    suspend fun getTranslations(language:String): Translation {
        return api.getTranslations(language)
    }
}