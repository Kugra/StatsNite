package poa.senac.statsnite.Model

import retrofit2.http.GET
import retrofit2.http.Query

interface FortniteApiService {
    @GET("/v1/profile/{platform}/{epic-nickname}")
    fun getStats(
            @Query("TRN-Api-Key")appKey:String
    )
}