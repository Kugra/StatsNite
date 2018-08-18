package poa.senac.statsnite.Model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class StatsNitePlayer(
        @PrimaryKey var Id:Int = 1,
        var Name:String = "",
        var Platform:String = ""):RealmObject()