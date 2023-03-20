package com.example.yourpsychologist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yourpsychologist.databinding.FragmentPsychologistsBinding

class PsychologistsFragment: Fragment() {
    private var _binding: FragmentPsychologistsBinding? = null
    private val binding get() = _binding!!

    private var _model: PsychologistsViewModel? = null
    private val model get() = _model!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPsychologistsBinding.inflate(inflater, container, false)
        _model = PsychologistsViewModel(activity.let { (it as MainActivity).getCurrentUser()})
        val view: View = binding.root

        model.getAllPsychologists()

        val adapter = PsychologistsAdapter()
        binding.psychologistsList.layoutManager = LinearLayoutManager(binding.root.context)
        binding.psychologistsList.adapter = adapter

        model.psychologists.observe(viewLifecycleOwner) { psychologists ->
            if (psychologists.size == 0) {
                activity.let { (it as MainActivity).showMessage(getString(R.string.empty_psychologists_message)) }
            }
            adapter.addAll(psychologists)
        }

        return view
    }

    companion object {
        fun newInstance() = PsychologistsFragment()
    }
}