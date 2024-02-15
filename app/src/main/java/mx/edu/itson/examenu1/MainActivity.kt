package mx.edu.itson.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gc: EditText =findViewById(R.id.etC)
        val gf: EditText =findViewById(R.id.etF)

        val bC: Button =findViewById(R.id.btnGC)
        val bF: Button =findViewById(R.id.btnGF)

        bC.setOnClickListener{
            val gC : Double
            val gF : Double
        }
        bF.setOnClickListener {
            val gC : Double
            val gF : Double
        }

    }
}