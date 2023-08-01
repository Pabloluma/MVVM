package com.pablo.mvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pablo.mvvm.model.ModelClass
import com.pablo.mvvm.model.Provider

class ViewModelClass : ViewModel() {
    val modelo = MutableLiveData<ModelClass>()
    fun randomFrase() {
        val fraseActual = Provider.random()
        modelo.postValue(fraseActual)
    }
}