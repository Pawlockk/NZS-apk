package pl.pawlock.nzsuam

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : NzsUamBase() {
    private lateinit var signin_auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        findViewById<Button>(R.id.id_login_button).setOnClickListener{
            SIGNIN_USER()
        }


    }


    private fun SIGNIN_USER(){
        val signin_email : String = findViewById<AppCompatEditText>(R.id.id_login_email).text.toString().trim {it <= ' '}
        val signin_password : String = findViewById<AppCompatEditText>(R.id.id_login_password).text.toString().trim {it <= ' '}
        signin_auth = Firebase.auth
        SIGNIN_FORM(signin_email, signin_password, signin_auth)
    }

    private fun SIGNIN_FORM(email : String, password: String, auth : FirebaseAuth){
        if (email.isEmpty()){
            Toast.makeText(this, "Wpisz E-mail", Toast.LENGTH_SHORT).show()
        }   else if (password.isEmpty()){
            Toast.makeText(this, "Wpisz hasło", Toast.LENGTH_SHORT).show()
        } else {
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this) {
                task ->
                    if (task.isSuccessful){
                        Toast.makeText(this, "Zalogowany", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    } else{
                        if(password.length<6){
                            Toast.makeText(this, "Błędne hasło", Toast.LENGTH_SHORT).show()
                        } else{
                            Toast.makeText(this, "Błędny E-mail lub hasło", Toast.LENGTH_SHORT).show()
                        }

                    }
            }
        }
    }

}