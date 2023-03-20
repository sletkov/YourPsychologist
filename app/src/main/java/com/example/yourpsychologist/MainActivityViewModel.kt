package com.example.yourpsychologist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel() : ViewModel() {
    private val api = APIImpl()
    val currentUser: MutableLiveData<User?> = MutableLiveData(null)

    fun login(login: String, password: String): Boolean {
        currentUser.value = api.login(login, password)
        return currentUser.value != null
    }

    fun logout(): Boolean {
        val user = currentUser.value
        if (user != null) {
            return if (api.logout(user.login)) {
                currentUser.value = null
                true
            } else {
                false
            }
        }
        return false
    }

    fun register(login: String, password: String): Boolean {
        return api.register(login, password)
    }

    fun getAllPsychologists(): ArrayList<Psychologist> {
        return api.getAllPsychologists()
    }


}