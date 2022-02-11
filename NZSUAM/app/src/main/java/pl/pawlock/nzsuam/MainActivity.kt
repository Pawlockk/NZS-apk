package pl.pawlock.nzsuam

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.google.firebase.auth.FirebaseAuth
import android.graphics.drawable.ColorDrawable
import android.view.WindowManager
import android.widget.*


class MainActivity : NzsUamBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_bar("main",R.id.id_main_nav_home,R.id.id_main_nav_tree,R.id.id_main_nav_notifications,R.id.id_main_nav_settings)


        findViewById<Button>(R.id.id_main_button).setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this, LoginActivity::class.java))
            Toast.makeText(this, "Wylogowany", Toast.LENGTH_SHORT).show()
        }
    }
}