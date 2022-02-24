package com.example.vku_demo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vku_demo.R
import com.example.vku_demo.data.Person
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var personAdapter: PersonAdapter
    private lateinit var rvPerson: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initAdapter()
        initRecycler()
    }

    private fun initView() {
        rvPerson = findViewById(R.id.rvPerson)
    }

    private fun initAdapter() {
        personAdapter = PersonAdapter(createListData())
    }

    private fun createListData(): MutableList<Person> {
        val listPerson = mutableListOf<Person>()
        for (index in 0..100) {
            listPerson.add(Person("Huy", "Pham", Random.nextInt(100000, 10000000)))
        }
        return listPerson
    }

    private fun initRecycler() {
        rvPerson.layoutManager = LinearLayoutManager(this)
        rvPerson.adapter = personAdapter
    }
}