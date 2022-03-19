package com.example.vku_demo.ui.exam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vku_demo.R
import com.example.vku_demo.databinding.ActivityInformationBinding

/**
 * @author huypham on 3/15/22
 */
class InformationActivity: AppCompatActivity() {

    companion object {
        const val KEY_NAME = "key_name"
        const val KEY_EMAIL = "key_email"
        const val KEY_PHONE = "key_phone"
    }

    private lateinit var binding: ActivityInformationBinding
    private lateinit var capitalAdapter: CapitalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showData()
        initAdapter()
        initRecyclerView()
    }

    private fun showData() {
        with(binding) {
            tvName.text = intent.getStringExtra(KEY_NAME)
            tvEmail.text = intent.getStringExtra(KEY_EMAIL)
            tvPhone.text = intent.getStringExtra(KEY_PHONE)
        }
    }

    private fun initAdapter() {
        capitalAdapter = CapitalAdapter(this, initData(), initColor())

    }

    private fun initRecyclerView() {
        binding.rvCapital.run {
            layoutManager = LinearLayoutManager(this@InformationActivity)
            adapter = capitalAdapter
        }
    }

    private fun initData() : MutableList<String> {
        val capitals = mutableListOf<String>()
        capitals.add("Ha Noi")
        capitals.add("Vienna")
        capitals.add("Brussels")
        capitals.add("Mexico City")
        capitals.add("Oslo")
        capitals.add("Pyongyang")
        capitals.add("Beijing")
        capitals.add("Moscow")
        capitals.add("Budapest")
        capitals.add("Nairobi")
        capitals.add("Tokyo")
        capitals.add("Denver")
        capitals.add("Helsinki")
        capitals.add("Berlin")

        return capitals
    }

    private fun initColor() : MutableList<Int> {
        val cols = mutableListOf<Int>()
        cols.add(R.color.teal_200)
        cols.add(R.color.teal_700)
        cols.add(R.color.purple_200)
        return cols
    }

}
