package de.bb42.anspannungssmeter

import android.graphics.Color
import android.icu.text.AlphabeticIndex
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView
import de.bb42.anspannungssmeter.tensionBarChangeListener

class captureTension : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture_tension)
        val tensionNumber = findViewById(R.id.tensionNumber) as TextView
        tensionNumber.setText("0")
        val layout = findViewById(R.id.tensionLayout) as LinearLayout

        val tensionBar = findViewById(R.id.tensionBar) as SeekBar
        tensionBar.setOnSeekBarChangeListener(tensionBarChangeListener(tensionNumber,layout))

    }
}

