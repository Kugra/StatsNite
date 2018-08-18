package poa.senac.statsnite


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import io.realm.Realm
import kotlinx.android.synthetic.main.fragment_search.*
import poa.senac.statsnite.Model.StatsNitePlayer


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SearchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onStart() {
        super.onStart()

        val realm = Realm.getDefaultInstance()

        var platform = spnPlatform
        var platformAdapter = ArrayAdapter.createFromResource(activity!!.applicationContext, R.array.platform_array, android.R.layout.simple_spinner_item)
        platformAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnPlatform.adapter = platformAdapter


        var nickname = edtNickName
        var button = btnSearch

        button.setOnClickListener {
            realm.beginTransaction()

            val realmId = realm.where(StatsNitePlayer::class.java).max("Id")
            val nextId: Int

            nextId = if (realmId == null) {
                0
            } else {
                realmId.toInt() + 1
            }

            var playerObject = realm.createObject(StatsNitePlayer::class.java, nextId)
            playerObject.Platform = platform.selectedItem.toString()
            playerObject.Name = nickname.text.toString()
            realm.commitTransaction()

            var bundle = Bundle()
            bundle.putString("platform", platform.selectedItem.toString())
            bundle.putString("nickname", nickname.text.toString())

            nickname.text = null
            startActivity(Intent(activity!!.applicationContext,StatsActivity::class.java).putExtra("bundle", bundle))
        }
    }
}
