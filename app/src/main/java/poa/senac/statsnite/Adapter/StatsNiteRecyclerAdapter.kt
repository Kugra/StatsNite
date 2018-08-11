package poa.senac.statsnite.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import poa.senac.statsnite.Model.StatsNitePlayer
import poa.senac.statsnite.R

class StatsNiteRecyclerAdapter(private var playerList: MutableList<StatsNitePlayer>, private var context: Context):RecyclerView.Adapter<StatsNitePlayerViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatsNitePlayerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_player, parent, false)
        return StatsNitePlayerViewHolder(view)
    }

    override fun getItemCount(): Int =  playerList.size

    override fun onBindViewHolder(holder: StatsNitePlayerViewHolder, position: Int) {
        val player = playerList[position]
        holder.let {
            it.bindView(player)
        }
    }
}