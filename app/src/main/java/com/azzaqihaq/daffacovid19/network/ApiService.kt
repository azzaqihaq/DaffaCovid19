package com.azzaqihaq.daffacovid19.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET ("summary")
    fun getAllCountry(): Call<AllCountries>
}

interface InfoService {
    @GET
    fun getInfoService(@Url url: String?): Call<List<InfoCountry>>
}