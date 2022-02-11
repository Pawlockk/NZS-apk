package pl.pawlock.nzsuam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NotificationsActivity : NzsUamBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        nav_bar("notifications",R.id.id_notifications_nav_home,R.id.id_notifications_nav_tree,R.id.id_notifications_nav_notifications,R.id.id_notifications_nav_settings)
    }
}