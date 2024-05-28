package com.example.quranapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quranapp.model.Translation
import com.example.quranapp.model.Verse
import com.example.quranapp.repository.QuranRepository
import kotlinx.coroutines.launch

class QuranViewmodel(private val repository: QuranRepository) : ViewModel() {
    private val _verses = MutableLiveData<List<Verse>>()
    val verse: LiveData<List<Verse>> get() = _verses

    private val _translations = MutableLiveData<Translation>()
    val translation: LiveData<Translation> get() = _translations

    fun getVerse(){
        viewModelScope.launch {
            _verses.value = repository.getVerses()
        }
    }

    fun getTranslations(language:String){
        viewModelScope.launch {
            _translations.value = repository.getTranslations(language)
        }
    }
}