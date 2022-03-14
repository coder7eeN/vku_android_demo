package com.example.vku_demo.ui.newspaper

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.vku_demo.R
import com.example.vku_demo.data.Person
import com.example.vku_demo.databinding.FragmentNewsListBinding
import kotlin.math.log

/**
 * @author huypham on 3/7/22
 */
class NewsListFragment : Fragment() {

    companion object {
        private const val TAG = "tag"

        fun newInstance() = NewsListFragment()
    }

    private var _binding: FragmentNewsListBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate: ")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: ")
        _binding = FragmentNewsListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "onViewCreated: ")

        clickOpenNewFragment()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    private fun clickOpenNewFragment() {
        binding.tvTest.text = "OPEN FRAGMENT"
        binding.tvTest.setOnClickListener {
            addNewFragment()
        }
    }

    private fun addNewFragment() {
        val arrayString = arrayListOf<String>()
        arrayString.add("Huy")
        arrayString.add("Huy1")
        arrayString.add("Huy2")
        arrayString.add("Huy3")
        arrayString.add("Huy4")
        arrayString.add("Huy5")
        arrayString.add("Huy6")

        val persons = arrayListOf<Person>()
        val person = Person("Huy", "Pham", 1234)
        val person3 = Person("Huy", "Pham", 5678)

        persons.add(person)
        persons.add(person)
        persons.add(person3)
        persons.add(person)
        persons.add(person)

        val newsDetailFragment = NewsDetailFragment.newInstance("VKU12", arrayString, persons)


        val fragment = activity?.supportFragmentManager?.beginTransaction()
        fragment?.replace(R.id.clBaseNews, newsDetailFragment, fragment?.javaClass?.name)
        fragment?.addToBackStack(NewsActivity.NEWS)
        fragment?.commit()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
