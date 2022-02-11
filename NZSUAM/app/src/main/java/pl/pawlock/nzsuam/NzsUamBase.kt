package pl.pawlock.nzsuam

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.firebase.auth.FirebaseAuth

open class NzsUamBase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nav_bar(){
        findViewById<ImageView>(R.id.id_nav_bar_home).setOnClickListener{
                startActivity(Intent(this, MainActivity::class.java))
                finish()
        }
        findViewById<ImageView>(R.id.id_nav_bar_tree).setOnClickListener{
                startActivity(Intent(this, TreeActivity::class.java))
                finish()
        }
        findViewById<ImageView>(R.id.id_nav_bar_notifications).setOnClickListener{
                startActivity(Intent(this, NotificationsActivity::class.java))
                finish()
        }
        findViewById<ImageView>(R.id.id_nav_bar_settings).setOnClickListener{
                startActivity(Intent(this, SettingsActivity::class.java))
                finish()
        }
    }
}