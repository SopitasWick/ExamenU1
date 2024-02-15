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
            if (gf.text.isEmpty()){
                gf.setText("Por favor introducir grados F°")
            }else {
                val gradosF: Double
                val result: Double
                gradosF = gf.toString().toDouble()
                result = (gradosF - 32) / 1.8
                gc.setText(result.toString())
            }
        }
        bF.setOnClickListener {
            if (gc.text.isEmpty()){
                gc.setText("Por favor introducir grados C°")
            }else {
                val gradosC: Double
                val result: Double
                gradosC = gc.toString().toDouble()
                result = (gradosC * 1.8) + 32
                gf.setText(result.toString())
            }
        }

    }
}