package com.example.recyclerapi.ui

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerapi.data.response.PahlawanResponseItem
import com.example.recyclerapi.databinding.ActivityJsonBinding

class JsonActivity : AppCompatActivity() {

    private var _binding : ActivityJsonBinding? = null
    private val binding get() = _binding as ActivityJsonBinding

//    private var _viewModel : MainViewModel? = null
//    private val viewModel get() = _viewModel as MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityJsonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTitle("JsonActivity")

//        _viewModel = ViewModelProvider(this)[MainViewModel::class.java]
//        viewModel.getData()
//
//        viewModel.kisahResponse.observe(this) { showData(it) }
    }

    private fun showData(data: List<PahlawanResponseItem>?) {
        binding.rvView.apply {
            val mAdapter = Adapter(datas = ArrayList())
            mAdapter.setData(data)
            layoutManager = GridLayoutManager(this@JsonActivity, 2)
            adapter = mAdapter
        }
    }
}