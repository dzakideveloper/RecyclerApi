package com.example.recyclerapi.ui.searchuser

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerapi.data.network.ApiClient
import com.example.recyclerapi.data.response.UsersResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchUserViewModel: ViewModel() {

    val listUser = MutableLiveData<UsersResponse>()

    fun searchUser(username: String) {
        // Callback nya harus yang retrofit
        ApiClient.getApiService().searchUser(username).enqueue(object : Callback<UsersResponse> {
            override fun onResponse(call: Call<UsersResponse>, response: Response<UsersResponse>) {
                listUser.value = response.body()
            }

            override fun onFailure(call: Call<UsersResponse>, t: Throwable) {
                Log.e("SearchUser", "onFailure: $t")
            }

        })
    }

    fun getSearchUser(): LiveData<UsersResponse> = listUser
}