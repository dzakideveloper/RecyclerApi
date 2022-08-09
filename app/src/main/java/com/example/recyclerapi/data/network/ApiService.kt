package com.example.recyclerapi.data.network

import com.example.recyclerapi.data.response.RepoResponse
import com.example.recyclerapi.data.response.UsersItem
import com.example.recyclerapi.data.response.UsersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("users")
    fun getListUsers(): Call<List<UsersItem>>

    @GET("search/users")
    fun searchUser(@Query("q") username: String) : Call<UsersResponse>

    @GET("search/repositories")
    fun searchRepo(@Query("q") repositories: String) : Call<RepoResponse>
}