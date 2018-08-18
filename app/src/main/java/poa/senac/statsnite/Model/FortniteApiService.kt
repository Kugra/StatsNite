package poa.senac.statsnite.Model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface FortniteApiService {
    @Headers("TRN-Api-Key: daf25611-1dad-4b75-be48-d31e74006483")
    @GET("/v1/profile/{platform}/{epic-nickname}")
    fun getStats(
            @Query("platform")platform:String,
            @Query("epic-nickname")nickname:String
    ): Call<StatsNiteApiModel>
}