package poa.senac.statsnite
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_historic.*
import poa.senac.statsnite.Adapter.StatsNiteRecyclerAdapter
import poa.senac.statsnite.Model.StatsNitePlayer

class HistoricFragment : Fragment() {

    private val playerList: MutableList<StatsNitePlayer> = mutableListOf()

    private lateinit var adapter: StatsNiteRecyclerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_historic, container, false)
    }

    override fun onStart() {
        super.onStart()

        getHistoricPlayers()
        initReciclerView()
    }

    private fun initReciclerView(){
        var recyclerView = rcvHistoric
        adapter = StatsNiteRecyclerAdapter(playerList, activity!!.applicationContext)
        recyclerView.adapter = adapter

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    private fun getHistoricPlayers(){
        playerList.add(StatsNitePlayer("Rubenito", "PC"))
        playerList.add(StatsNitePlayer("Buiuia", "PS4"))
    }
}
