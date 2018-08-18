package poa.senac.statsnite

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import poa.senac.statsnite.Model.RetrofitInitializer
import poa.senac.statsnite.Model.StatsNiteApiModel

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StatsActivity : AppCompatActivity() {

    private lateinit var call: Call<StatsNiteApiModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        var bundle : Bundle = intent.extras.getBundle("bundle")
        var platform = bundle.getString("platform")
        var nickname = bundle.getString("nickname")

        call = RetrofitInitializer().forniteApiService().getStats(platform,nickname)

        call.enqueue(object: Callback<StatsNiteApiModel>{
            override fun onFailure(call: Call<StatsNiteApiModel>?, t: Throwable?) {
            }

            override fun onResponse(call: Call<StatsNiteApiModel>?, response: Response<StatsNiteApiModel>?) {

                Toast.makeText(this@StatsActivity, response?.body()?.platformId.toString(), Toast.LENGTH_LONG).show()

            }

        })


    }
}
