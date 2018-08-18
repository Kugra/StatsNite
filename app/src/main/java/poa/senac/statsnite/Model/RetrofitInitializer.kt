package poa.senac.statsnite.Model

import retrofit2.Retrofit

class RetrofitInitializer {
    private val retrofit = Retrofit.Builder()
            .baseUrl("\"https://api.fortnitetracker.com\"")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun forniteApiService = retrofit.create(FortniteApiService::class.java)
}