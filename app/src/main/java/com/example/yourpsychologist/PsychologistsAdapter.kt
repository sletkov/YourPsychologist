package com.example.yourpsychologist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yourpsychologist.databinding.PsychologistItemBinding

class PsychologistsAdapter :
    RecyclerView.Adapter<PsychologistsAdapter.PsychologistsHolder>() {

    private val psychologistsList = arrayListOf<Psychologist>()

    class PsychologistsHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = PsychologistItemBinding.bind(item)
        fun bind(psychologist: Psychologist) {
            binding.name.text = psychologist.name
            binding.experience.text = "Опыт " + psychologist.experience + " лет"
            binding.mark.text = "Средняя оценка " + psychologist.mark
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PsychologistsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.psychologist_item, parent, false)
        return PsychologistsHolder(view)
    }

    override fun onBindViewHolder(holder: PsychologistsHolder, position: Int) {
        holder.bind(psychologistsList[position])
    }

    override fun getItemCount(): Int {
        return psychologistsList.size
    }

    fun addAll(results: ArrayList<Psychologist>) {
        psychologistsList.clear()
        psychologistsList.addAll(results)
    }

}