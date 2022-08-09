package com.example.recyclerapi.ui.searchrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerapi.R
import com.example.recyclerapi.ui.searchuser.searchViewString

class SearchRepoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_repo)
        setTitle("SearchRepoActivity")

        val viewModel = ViewModelProvider(this)[SearchRepoViewModel::class.java]
        viewModel.searchRepo(searchViewString())
        viewModel.getSearchRepo().observe(this) {
            Log.i("SearchRepo", "onCreate: $it \n \n \n Nama Username: ${it.items?.get(0)?.name}")
            println(it.items?.get(0)?.name)
        }
    }
}