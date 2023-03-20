package com.example.yourpsychologist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.yourpsychologist.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view: View = binding.root

        val logoutButton: Button = binding.logoutButton
        val aboutButton: Button = binding.aboutButton

        val psychologistsButton: Button = binding.psychologists

        logoutButton.setOnClickListener {
            activity.let {
                (it as MainActivity).logout()
            }
        }

        aboutButton.setOnClickListener {
            activity.let {
                (it as MainActivity).goToAboutFragment()
            }
        }


        psychologistsButton.setOnClickListener {
            activity.let {
                (it as MainActivity).goToPsychologistsFragment()
            }
        }

        return view
    }

    companion object {

        fun newInstance() = MainFragment()
    }
}