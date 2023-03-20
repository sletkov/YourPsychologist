package com.example.yourpsychologist
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PsychologistsViewModel(private val user: User?) : ViewModel() {
    private val api = APIImpl()

    val psychologists: MutableLiveData<ArrayList<Psychologist>> by lazy {
        MutableLiveData<ArrayList<Psychologist>>()
    }

    init {
        getAllPsychologists()
    }

    fun getAllPsychologists() {
        psychologists.value = api.getAllPsychologists()
    }

}