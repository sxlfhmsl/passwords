package com.shenglu.passwords.ui.generator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GeneratorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generator Fragment"
    }
    val text: LiveData<String> = _text
}