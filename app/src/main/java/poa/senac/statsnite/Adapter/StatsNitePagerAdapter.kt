package poa.senac.statsnite.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import poa.senac.statsnite.HistoricFragment
import poa.senac.statsnite.SearchFragment

class StatsNitePagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> return SearchFragment()
            1 -> return HistoricFragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Search"
            1 -> "Historic"
            else ->{
                return  ""
            }
        }
    }
}