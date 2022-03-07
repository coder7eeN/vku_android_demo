package com.example.vku_demo.ui.gretting

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vku_demo.R
import com.example.vku_demo.data.Person

/**
 * @author huypham on 2/24/22
 */
class PersonAdapter(private val listPerson: MutableList<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val item = listPerson[position]
        holder.bindData(item)
    }

    override fun getItemCount(): Int = listPerson.size

    inner class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvFirstName = view.findViewById<TextView>(R.id.tvFirstName)
        private val tvLastName = view.findViewById<TextView>(R.id.tvLastName)
        private val tvPhone = view.findViewById<TextView>(R.id.tvPhone)

        fun bindData(item: Person) {
            tvFirstName.text = item.firstName
            tvLastName.text = item.lastName
            tvPhone.text = item.phone.toString()
        }
    }
}
