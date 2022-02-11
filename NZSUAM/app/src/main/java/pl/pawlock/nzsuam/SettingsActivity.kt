package pl.pawlock.nzsuam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SettingsActivity : NzsUamBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        nav_bar("settings",R.id.id_settings_nav_home,R.id.id_settings_nav_tree,R.id.id_settings_nav_notifications,R.id.id_settings_nav_settings)
    }
}