package com.example.recyclerapi.ui.searchuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerapi.R

class SearchUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_user)
        setTitle("SearchUserActivity")

        val viewModel = ViewModelProvider(this)[SearchUserViewModel::class.java]
        viewModel.searchUser(searchViewString())
        viewModel.getSearchUser().observe(this) {
            Log.i("DATA", "onCreate: $it \n \n \n Nama Username: ${it.item?.get(0)?.login}")
            println(it.item?.get(0)?.login)
        }
    }
}

public fun searchViewString() = "Andi"
