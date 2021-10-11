package com.yoochangwonspro.airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {

    @GET("/v3/e43ce14b-d40d-44a1-84cd-6d71c3b5ece6")
    fun getHouseList(): Call<HouseDto>
}