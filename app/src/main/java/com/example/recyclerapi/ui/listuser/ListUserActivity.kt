package com.example.recyclerapi.ui.listuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerapi.R

class ListUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_user)
        setTitle("ListUserActivity")

        val viewModel = ViewModelProvider(this)[ListUserViewModel::class.java]
        viewModel.getListUser()
        viewModel.getResultListUser().observe(this) {
            Log.i("ListUser", "onCreate: $it")
        }
    }
}