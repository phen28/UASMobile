package api

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/logo")
    fun getAgents(): Call<List<ResponseItem>>
}