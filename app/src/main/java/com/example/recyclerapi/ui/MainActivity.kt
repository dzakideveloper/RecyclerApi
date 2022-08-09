package com.example.recyclerapi.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.recyclerapi.R
import com.example.recyclerapi.databinding.ActivityMainBinding
import com.example.recyclerapi.ui.listuser.ListUserActivity
import com.example.recyclerapi.ui.searchrepo.SearchRepoActivity
import com.example.recyclerapi.ui.searchuser.SearchUserActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnJson.setOnClickListener(this@MainActivity)
            btnListUser.setOnClickListener(this@MainActivity)
            btnSeachRepo.setOnClickListener(this@MainActivity)
            btnSearchUser.setOnClickListener(this@MainActivity)
        }
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_json -> startActivity(Intent(this, JsonActivity::class.java))
            R.id.btn_list_user -> startActivity(Intent(this, ListUserActivity::class.java))
            R.id.btn_seach_repo -> startActivity(Intent(this, SearchRepoActivity::class.java))
            R.id.btn_search_user -> startActivity(Intent(this, SearchUserActivity::class.java))
        }
    }
}

