package com.example.lorcollectorsapp.ui.addCards

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddCardsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is add cards Fragment"
    }
    val text: LiveData<String> = _text
}