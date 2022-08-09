package com.example.recyclerapi.ui.listuser

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerapi.data.network.ApiClient
import com.example.recyclerapi.data.network.ApiService
import com.example.recyclerapi.data.response.UsersItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListUserViewModel : ViewModel() {

    private val listUser = MutableLiveData<List<UsersItem>>()

    fun getListUser() {
        ApiClient.getApiService().getListUsers().enqueue(object : Callback<List<UsersItem>> {
            override fun onResponse(
                call: Call<List<UsersItem>>,
                response: Response<List<UsersItem>>
            ) {
                listUser.value = response.body()
            }

            override fun onFailure(call: Call<List<UsersItem>>, t: Throwable) {
                Log.e("TAG", "error: $t")
            }
        })
    }

    fun getResultListUser(): LiveData<List<UsersItem>> = listUser
}