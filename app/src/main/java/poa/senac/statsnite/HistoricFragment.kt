package poa.senac.statsnite
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.realm.Realm
import kotlinx.android.synthetic.main.fragment_historic.*
import poa.senac.statsnite.Adapter.StatsNiteRecyclerAdapter
import poa.senac.statsnite.Model.StatsNitePlayer
import java.util.*

class HistoricFragment : Fragment() {

    private val playerList: MutableList<StatsNitePlayer> = mutableListOf()

    private lateinit var adapter: StatsNiteRecyclerAdapter
    private lateinit var realm: Realm

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        realm = Realm.getDefaultInstance()

        return inflater.inflate(R.layout.fragment_historic, container, false)
    }

    override fun onStart() {
        super.onStart()

        initReciclerView()
        getHistoricPlayers()
    }

    override fun onResume() {
        super.onResume()
        getHistoricPlayers()
    }
    
    private fun initReciclerView(){
        var recyclerView = rcvHistoric
        adapter = StatsNiteRecyclerAdapter(playerList, activity!!.applicationContext)
        recyclerView.adapter = adapter

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

     fun getHistoricPlayers(){
        realm.beginTransaction()

        val result = realm.where(StatsNitePlayer::class.java)
                .findAll()
        realm.commitTransaction()

        playerList.clear()
        adapter.clear()
        playerList.addAll(result)
    }
}
