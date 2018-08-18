package poa.senac.statsnite.Model

import retrofit2.Call
import retrofit2.http.*

interface FortniteApiService {
//    @Headers("TRN-Api-Key: daf25611-1dad-4b75-be48-d31e74006483")
    @GET("/v1/profile/{platform}/{epic-nickname}")
    fun getStats(
            @Header("TRN-Api-Key")key:String,
            @Path("platform")platform:String,
            @Path("epic-nickname")nickname:String
    ): Call<StatsNiteApiModel>
}