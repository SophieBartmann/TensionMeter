package de.bb42.anspannungssmeter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.widget.*

class captureTension : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture_tension)
        val tensionNumber = findViewById(R.id.tensionNumber) as TextView
        val window = this.window as Window
        tensionNumber.setText("0")
        val layout = findViewById(R.id.tensionLayout) as LinearLayout

        val tensionBar = findViewById(R.id.tensionBar) as SeekBar
        tensionBar.setOnSeekBarChangeListener(tensionBarChangeListener(tensionNumber,layout, window))
        val saveButton = findViewById(R.id.saveButton) as Button
        saveButton.setOnClickListener {
            if( tensionBar.progress == 0){

            }else{
                android.util.Log.println(android.util.Log.DEBUG, "SaveButton", tensionBar.progress.toString())
                finish()
            }
        }
        val editText = findViewById(R.id.WhatIsGoingOn) as EditText
        editText.setOnClickListener{
            android.util.Log.println(android.util.Log.DEBUG, "editTextButton", editText.text.toString())
            if(editText.text.toString().equals("Was ist los?")){
                android.util.Log.println(android.util.Log.DEBUG, "editTextButton equal", editText.text.toString())
                editText.setText("")
            }
        }


    }
}
