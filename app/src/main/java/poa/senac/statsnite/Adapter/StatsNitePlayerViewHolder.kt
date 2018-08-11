package poa.senac.statsnite.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.cardview_player.view.*
import poa.senac.statsnite.Model.StatsNitePlayer

class StatsNitePlayerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    fun bindView(player:StatsNitePlayer){
        val name = itemView.txvPlayerName
        val platform = itemView.txvPlatform
        name.text = player.Name
        platform.text = player.Platform
    }
}