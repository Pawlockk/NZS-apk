package pl.pawlock.nzsuam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TreeActivity : NzsUamBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree)
        nav_bar("tree",R.id.id_tree_nav_home,R.id.id_tree_nav_tree,R.id.id_tree_nav_notifications,R.id.id_tree_nav_settings)
    }
}