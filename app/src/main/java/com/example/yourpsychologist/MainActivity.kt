package com.example.yourpsychologist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.yourpsychologist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var currentFragment: FragmentType = FragmentType.LOGIN
    private val model = MainActivityViewModel()
    private val api: API = APIImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        model.currentUser.observe(this) { newUser ->
            if (newUser == null) {
                goToLoginFragment()
            } else {
                showMessage(getString(R.string.empty_text))
                goToMainFragment()
            }
        }
    }

    fun showMessage(text: String) {
        binding.message.text = text
    }

    fun login(login: String, password: String) {
        if (login == "" || password == "") {
            showMessage(getString(R.string.non_empty_fields_message))
            return
        }
        val loginCheck = model.login(login, password)
        if (!loginCheck) {
            showMessage(getString(R.string.bad_login_or_password_message))
        }
    }

    fun logout() {
        model.logout()
    }

    fun register(login: String, password: String) {
        if (login == "" || password == "") {
            showMessage(getString(R.string.non_empty_fields_message))
            return
        }
        if (model.register(login, password)) {
            showMessage(getString(R.string.success_register_message))
        } else {
            showMessage(getString(R.string.login_already_exist_message))
        }
    }


    fun getCurrentUser(): User? {
        return model.currentUser.value
    }

    fun goToMainFragment() {
        supportFragmentManager.commit {
            replace(binding.frameFragments.id, MainFragment.newInstance())
        }
        currentFragment = FragmentType.MAIN
    }

    fun goToLoginFragment() {
        supportFragmentManager.commit {
            replace(binding.frameFragments.id, LoginFragment.newInstance())
        }
        currentFragment = FragmentType.LOGIN
    }

    fun goToAboutFragment() {
        supportFragmentManager.commit {
            replace(binding.frameFragments.id, AboutFragment.newInstance())
            addToBackStack("main")
        }
        currentFragment = FragmentType.ABOUT
    }

    fun goToPsychologistsFragment() {
        supportFragmentManager.commit {
            replace(binding.frameFragments.id, PsychologistsFragment.newInstance())
            addToBackStack("main")
        }
        currentFragment = FragmentType.PSYCHOLOGISTS
    }

}