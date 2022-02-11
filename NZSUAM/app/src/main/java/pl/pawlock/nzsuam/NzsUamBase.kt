package pl.pawlock.nzsuam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import org.intellij.lang.annotations.Identifier
import java.security.Identity

open class NzsUamBase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nav_bar(activity: String, main:Int, tree: Int, notifications: Int, settings: Int){
        findViewById<ImageView>(main).setOnClickListener{
            if(activity != "main"){
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
        findViewById<ImageView>(tree).setOnClickListener{
            if (activity != "tree"){
                startActivity(Intent(this, TreeActivity::class.java))
            }
        }
        findViewById<ImageView>(notifications).setOnClickListener{
            if (activity != "notifications"){
                startActivity(Intent(this, NotificationsActivity::class.java))
            }
        }
        findViewById<ImageView>(settings).setOnClickListener{
            if (activity != "settings"){
                startActivity(Intent(this, SettingsActivity::class.java))
            }
        }
    }
}