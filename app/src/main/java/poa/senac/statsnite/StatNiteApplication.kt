package poa.senac.statsnite

import android.app.Application
import io.realm.Realm

class StatNiteApplication : Application(){
    override fun onCreate() {
        Realm.init(applicationContext);
        super.onCreate()
    }
}