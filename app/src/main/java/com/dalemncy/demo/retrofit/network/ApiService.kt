package com.dalemncy.demo.retrofit.network

import com.dalemncy.demo.retrofit.models.Post
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @GET("/api/post")
    fun getPostList(): Call<List<Post>>

    @GET("/api/post/{id}")
    fun getPostById(@Path("id") id: String): Call<Post>

    @POST("/api/post")
    fun createPost(@Body post: Post): Call<Post>
}