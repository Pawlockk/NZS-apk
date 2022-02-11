package pl.pawlock.nzsuam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SplashActivity : NzsUamBase() {
    private lateinit var signin_auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        signin_auth = Firebase.auth
        val current_user = signin_auth.currentUser
        if (current_user != null){
            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 2000)
        }else{
            Handler().postDelayed({
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }, 2000)
        }

    }
}