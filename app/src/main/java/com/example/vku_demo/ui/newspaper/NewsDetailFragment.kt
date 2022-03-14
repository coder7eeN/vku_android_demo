package com.example.vku_demo.ui.newspaper

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.vku_demo.data.Person
import com.example.vku_demo.databinding.FragmentNewsDetailBinding

/**
 * @author huypham on 3/7/22
 */
class NewsDetailFragment : Fragment() {
    companion object {
        private const val TAG = "tag2"
        const val NEWS_DETAIL_TITLE = "new_detail_title"
        const val NEWS_DETAIL_ARRAY_LIST = "new_detail_array_list"
        const val NEWS_DETAIL_PERSON = "news_detail_person"

        fun newInstance(title: String, arrays: ArrayList<String>, persons: ArrayList<Person>) = NewsDetailFragment().apply {
            arguments = Bundle().apply {
                putString(NEWS_DETAIL_TITLE, title)
                putStringArrayList(NEWS_DETAIL_ARRAY_LIST, arrays)
                putParcelableArrayList(NEWS_DETAIL_PERSON, persons)
            }
        }
    }

    private var _binding: FragmentNewsDetailBinding? = null
    private val binding get() = _binding!!

    private var title: String = ""
    private var arrayString = arrayListOf<String>()
    private var persons = arrayListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate: ")


        title = arguments?.getString(NEWS_DETAIL_TITLE, "") ?: ""
        arrayString = arguments?.getStringArrayList(NEWS_DETAIL_ARRAY_LIST) as ArrayList<String>
        persons = arguments?.getParcelableArrayList<Person>(NEWS_DETAIL_PERSON) as ArrayList<Person>
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: ")
        _binding = FragmentNewsDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showTitle()
        backPress()
    }

    private fun showTitle() {
        binding.tvTitle.text = persons[2].phone.toString()

    }

    private fun backPress() {
        binding.tvBack.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()
        }
    }
}
