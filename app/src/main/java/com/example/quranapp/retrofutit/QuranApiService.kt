package com.example.quranapp.retrofutit

import androidx.room.Query
import com.example.quranapp.model.Translation
import com.example.quranapp.model.Verse
import retrofit2.http.GET

interface QuranApiService {
    @GET("quran/verses")
    suspend fun getVerses():List<Verse>

    @GET("quran/Translation")
    suspend fun getTranslation(@Query("language") language: String): Translation

}