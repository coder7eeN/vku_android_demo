package com.example.vku_demo.ui.newspaper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vku_demo.R
import com.example.vku_demo.databinding.ActivityNewsBinding

/**
 * @author huypham on 3/7/22
 */
class NewsActivity: AppCompatActivity() {
    companion object{
        const val NEWS = "news"
    }

    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addFragment()
    }

    private fun addFragment() {
        val fragment = supportFragmentManager.beginTransaction()
        fragment.add(R.id.clBaseNews, NewsListFragment.newInstance(), fragment.javaClass.name)
        fragment.addToBackStack(NEWS)
        fragment.commit()
    }
}
