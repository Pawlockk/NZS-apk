package pl.pawlock.nzsuam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class TreeActivity : NzsUamBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree)
        val toolbar : Toolbar = findViewById(R.id.id_tool_bar)
        setSupportActionBar(toolbar)
        nav_bar()
    }
}