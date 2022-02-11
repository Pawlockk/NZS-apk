package pl.pawlock.nzsuam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.firebase.auth.FirebaseAuth

class SettingsActivity : NzsUamBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val toolbar : Toolbar = findViewById(R.id.id_tool_bar)
        setSupportActionBar(toolbar)
        nav_bar()
        findViewById<Button>(R.id.id_settings_logout_button).setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this, LoginActivity::class.java))
            Toast.makeText(this, "Wylogowany", Toast.LENGTH_SHORT).show()
        }
    }
}