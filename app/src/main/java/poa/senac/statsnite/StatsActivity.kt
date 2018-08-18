package poa.senac.statsnite

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_stats.*
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
        var platform = bundle.getString("platform").toLowerCase()
        var nickname = bundle.getString("nickname")

        call = RetrofitInitializer().forniteApiService().getStats("daf25611-1dad-4b75-be48-d31e74006483",platform,nickname)

        call.enqueue(object: Callback<StatsNiteApiModel>{
            override fun onFailure(call: Call<StatsNiteApiModel>?, t: Throwable?) {
                Toast.makeText(this@StatsActivity, "404 - PLAYER NOT FOUND", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<StatsNiteApiModel>?, response: Response<StatsNiteApiModel>?) {
                Log.d("abcz", "${response?.body()}")
                var model = response?.body()


                var platform = txvPlatform
                var user = txvUser
                var matches = txvMatches
                var wins = txvWins
                var winp = txvWinp
                var kills = txvKills
                var kd = txvKd

                platform.text = model!!.platformNameLong
                user.text = model.epicUserHandle
                matches.text = "Matches: ${model.lifeTimeStats.get(7).value}"
                wins.text = "Wins: ${model.lifeTimeStats.get(8).value}"
                winp.text = "WinRate: ${model.lifeTimeStats.get(9).value}"
                kills.text = "Kills: ${model.lifeTimeStats.get(10).value}"
                kd.text = "K/D: ${model.lifeTimeStats.get(11).value}"

            }

        })


    }
}
