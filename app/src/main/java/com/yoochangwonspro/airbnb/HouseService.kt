package com.yoochangwonspro.airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {

    @GET
    fun getHouseList(): Call<HouseDto>
}