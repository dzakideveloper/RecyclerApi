package com.example.recyclerapi.ui.searchrepo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerapi.data.network.ApiClient
import com.example.recyclerapi.data.response.RepoResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchRepoViewModel: ViewModel() {

    val listUser = MutableLiveData<RepoResponse>()

    fun searchRepo(username: String) {
        ApiClient.getApiService().searchRepo(username).enqueue(object : Callback<RepoResponse> {
            override fun onResponse(
                call: Call<RepoResponse>,
                response: Response<RepoResponse>
            ) {
                listUser.value = response.body()
            }
            override fun onFailure(call: Call<RepoResponse>, t: Throwable) {
                Log.e("SearchRepo", "error: $t")
            }

        })
    }

    fun getSearchRepo(): LiveData<RepoResponse> = listUser
}